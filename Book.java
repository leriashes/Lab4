import java.util.Scanner;
import java.lang.Math;
public class Book
{
    private static int counter = 0;     //Счётчик книг
    private static int time = 30;       //Время, на которое можно брать книги

	private String title;			//Название книги
	private Author author;		//Автор
	private int pages_number;		//Количество страниц
	private String genre;			//Жанр
	private Reader reader;	//Читатель
	private Publishing publishing;	//Издательство
	private int publ_year;			//Год
    private int id;     //ID книги
    private Date borrow_date;       //Дата взятия книги

    public static int GetCounter()
    {
        return counter;
    }

    public static int GetTime()
    {
        return time;
    } 

    public static void SetTime(int days)
    {
        if (days >= 1)
        {
            time = days;
        }

        return;
    }

    public static boolean BorrowBook(Book book, Reader reader, Date date)
    {
        boolean result = false;

        if (book.InLib())
        {
            book.AddReader(reader);
            book.borrow_date = date;
            result = true;
        }

        return result;
    }

    public static int BorrowBook(Book book[], int num, Reader reader, Date date)
    {
        int result = 0;

        for (int i = 0; i < num; i++)
        {
            if (BorrowBook(book[i], reader, date))
            {
                result += 1;
            }
        }
        return result;
    }

    //Конструктор
    public Book()
    {
        title = "Котофей";
        author = new Author();
        author.NewBook(this);
        pages_number = 50;
        genre = "Сказки";
        publishing = new Publishing();
        publ_year = 2021;
        counter += 1;
        id = counter;
        borrow_date = new Date();
    }

    //Конструктор с параметром
    public Book(String title, Author author, int pages_number, String genre, Publishing publishing, int publication_year)
    {
        this.title = title;
        this.author = author;
        author.NewBook(this);
        this.pages_number = Math.abs(pages_number);
        this.genre = genre;
        this.publishing = publishing;
        this.publ_year = Math.abs(publication_year);
        counter += 1;
        id = counter;
        borrow_date = new Date();
    }

    //Конструктор с параметром
    public Book(String title, Author author, int pages_number, String genre, Reader reader, Publishing publishing, int publication_year)
    {
        this.title = title;
        this.author = author;
        author.NewBook(this);
        this.pages_number = Math.abs(pages_number);
        this.genre = genre;
        this.AddReader(reader);
        this.publishing = publishing;
        this.publ_year = Math.abs(publication_year);
        counter += 1;
        id = counter;
        borrow_date = new Date();
    }

    //Инициализация всех полей
    public void Init(String title, Author author, int pages_number, String genre, Publishing publishing, int publication_year)
    {
        this.title = title;
        this.author = author;
        author.NewBook(this);
        this.pages_number = Math.abs(pages_number);
        this.genre = genre;
        this.publishing = publishing;
        this.publ_year = Math.abs(publication_year);
    }

    //Инициализация всех полей
    public void Init(String title, Author author, int pages_number, String genre, Reader reader, Publishing publishing, int publication_year)
    {
        this.title = title;
        this.author = author;
        author.NewBook(this);
        this.pages_number = Math.abs(pages_number);
        this.genre = genre;
        this.AddReader(reader);
        this.publishing = publishing;
        this.publ_year = Math.abs(publication_year);
    }

    //Ввод значений всех полей
    public void Read()
    {
        boolean f = true;
        Scanner inp = new Scanner(System.in);

        String str;

        System.out.print("Введите название книги: ");
        do
        {
            title = inp.nextLine();

            if (title.length() == 0)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        System.out.println();
        author.Read();
        author.NewBook(this); 

        f = true;
        System.out.print("\nВведите количество страниц в книге: ");
        do
        {
            str = inp.nextLine();
            pages_number = Convert.StringToInt(str);

            if (pages_number <= 0)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        f = true;
        System.out.print("\nВведите жанр: ");
        do
        {
            genre = inp.nextLine();

            if (genre.length() == 0)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        System.out.println();
        publishing.Read();

        f = true;
        System.out.print("\nВведите год издания книги: ");
        do
        {
            str = inp.nextLine();
            publ_year = Convert.StringToInt(str);

            if (publ_year <= 0)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                f = false;
            }
        } while (f);
    }

    //Вывод значений всех полей
    public void Display()
    {
        System.out.printf("ID %d", id);
        System.out.printf("\nНазвание: \"%s\"", title);
        System.out.printf("\nЖанр: %s", genre);
        System.out.printf("\nКоличество страниц: %d", pages_number);
        System.out.printf("\nГод публикации: %d", publ_year);
        System.out.printf("\nАвтор: ");
        author.Display("FullName");
        System.out.print("\nИздательство: ");
        publishing.Display();
        if (reader != null) 
        {
            System.out.print("\nЧитатель: ");
            reader.Display("[DocNumber] FullName");
            System.out.print("\nДата взятия книги: ");
		    borrow_date.Display("DD.MM.YYYY");
		    System.out.print("\nСрок сдачи книги: ");
		    Date plus = new Date(time, 0, 0);
            plus.Add(borrow_date).Display( "DD.MM.YYYY");
        }
    }

    //Привязка читателя
    public void AddReader(Reader reader)
    {
        if (reader == null)
        {
            if (this.reader != null)
            {
                this.reader.ReturnBook(this);
            }
        }
        else
        {
            reader.TakeBook(this);
        }

        this.reader = reader;
    }

    //Проверка находится ли книга в библиотеке
    public boolean InLib()
    {
        boolean result = false;

        if (reader == null)
        {
            result = true;
        }

        return result;
    }

    //Сравнение читателей книг
    public boolean CmpReader(Book second_book)
    {
        return (reader == second_book.reader);
    }

    //Проверка принадлежности книги читателю
    public boolean Belongs(Reader reader)
    {
        return this.reader == reader;
    }

    //Проверка принадлежности книги писателю
    public boolean Belongs(Author author)
    {
        return this.author == author;
    }
}