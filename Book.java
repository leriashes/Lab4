import java.util.Scanner;
import java.lang.Math;
public class Book
{
	private String title;			//Название книги
	private Author author;		//Автор
	private int pages_number;		//Количество страниц
	private String genre;			//Жанр
	private Reader reader;	//Читатель
	private Publishing publishing;	//Издательство
	private int publ_year;			//Год

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
        Scanner inp = new Scanner(System.in, "cp866");

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

            try 
            {
                pages_number = Integer.parseInt(str);
            }
            catch (NumberFormatException e)
            {
                pages_number = 0;
            }

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

            try 
            {
                publ_year = Integer.parseInt(str);
            }
            catch (NumberFormatException e)
            {
                publ_year = 0;
            }

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
        System.out.printf("Название: \"%s\"", title);
        System.out.printf("\nЖанр: %s", genre);
        System.out.printf("\nКоличество страниц: %d", pages_number);
        System.out.printf("\nГод публикации: %d", publ_year);
        System.out.printf("\nАвтор: ");
        author.Display("FullName");
        System.out.printf("\nИздательство: ");
        publishing.Display();
        if (reader != null) 
        {
            System.out.printf("\nЧитатель: ");
            reader.Display("[DocNumber] FullName");
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