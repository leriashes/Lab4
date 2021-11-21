import java.util.Scanner;
import java.util.ArrayList;
public class Reader
{
	private String full_name;	//ФИО
	private Date birth;			//Дата рождения
	private Address address;	//Адрес
	private String doc_number;		//Номер документа, удостоверяющего личность
    private ArrayList<Book> books;  //Книги, которые находятся у читателя

    //Конструктор
    public Reader()
    {
        full_name = "Иванов Иван Иванович";
        birth = new Date();
        address = new Address();
        doc_number = "01 10 123456";
        books = new ArrayList<Book>();
    }

    //Конструктор с параметром
    public Reader(String full_name, Date birth_date, Address address, String doc_number)
    {
        this.full_name = full_name;
        birth = new Date(birth_date);
        this.address = address;
        this.doc_number = doc_number;
        books = new ArrayList<Book>();
    }

    //Конструктор с параметром 
    public Reader(String full_name, Date birth_date, Address address, int doc_number)
    {
        this.full_name = full_name;
        birth = new Date(birth_date);
        this.address = address;
        this.doc_number = Integer.toString(doc_number);
        books = new ArrayList<Book>();
    }

    //Инициализация всех полей
    public void Init(String full_name, Date birth_date, Address address, String doc_number)
    {
        this.full_name = full_name;
        birth = new Date(birth_date);
        this.address = address;
        this.doc_number = doc_number;
    }

    //Инициализация всех полей
    public void Init(String full_name, Date birth_date, Address address, int doc_number)
    {
        this.full_name = full_name;
        birth = new Date(birth_date);
        this.address = address;
        this.doc_number = Integer.toString(doc_number);
    }

    //Ввод всех полей
    public void Read()
    {
        boolean f = true;
        Scanner inp = new Scanner(System.in);

        System.out.print("Введите ФИО читателя: ");
        do
        {
            try
            {
                full_name = inp.nextLine();

                for (int i = 0; i < full_name.length(); i++)
                {
                    if (full_name.charAt(i) == ' ')
                    {
                        if (i == 0 || i < full_name.length() - 1 && full_name.charAt(i + 1) == ' ' || i == full_name.length() - 1)
                        {
                            full_name = full_name.substring(0, i) + full_name.substring(i + 1, full_name.length());
                            i--;
                        }
                    }
                }

                if (full_name.length() == 0)
                {
                    throw new Exception("\nОшибка ввода! Повторите ввод: ");
                }
                else
                {
                    f = false;
                }
            }
            catch (Exception ex)
            {
                System.out.print(ex.getMessage());
            }
        } while (f);

        System.out.println("\nДата рождения");
        birth.ReadDate();

        System.out.println("\nАдрес проживания");
        address.Read();

        f = true;
        System.out.print("\nВведите номер документа, удостовряющего личность: ");
        do
        {
            try
            {
                doc_number = inp.nextLine();

                for (int i = 0; i < doc_number.length(); i++)
                {
                    if (doc_number.charAt(i) == ' ')
                    {
                        if (i == 0 || i < doc_number.length() - 1 && doc_number.charAt(i + 1) == ' ' || i == doc_number.length() - 1)
                        {
                            doc_number = doc_number.substring(0, i) + doc_number.substring(i + 1, doc_number.length());
                            i--;
                        }
                    }
                }

                if (doc_number.length() == 0)
                {
                    throw new Exception("\nОшибка ввода! Повторите ввод: ");
                }
                else
                {
                    f = false;
                }
            }
            catch (Exception ex)
            {
                System.out.print(ex.getMessage());
            }
        } while (f);
    }

    //Вывод значений полей в выбранном формате
    public void Display(String format)
    {
        String[] form = { "FullName", "[DocNumber] FullName", "FullName (BirthDate)", "all" };
        boolean f = true;

        for (int i = 0; i < 4 && f; i++)
        {
            if (format.equalsIgnoreCase(form[i]))
            {
                if (i == 0)
                {
                    System.out.printf("%s ", full_name);
                }
                else if (i == 1)
                {
                    System.out.printf("[%s] %s ", doc_number, full_name);
                }
                else if (i == 2)
                {
                    System.out.printf("%s (", full_name);
                    birth.Display("DD.MM.YYYY");
                    System.out.print(") ");
                }

                if (i < 3)
                {
                    i = 4;
                }
            }

            if (i == 3)
            {
                f = false;
            }
        }

        if (!f)
        {
            System.out.printf("[%s] %s (Дата рождения: ", doc_number, full_name);
            birth.Display("DD.MM.YYYY");
            System.out.print(". Адрес проживания: ");
            address.Display();
            System.out.print(") ");
        }
    }

    //Проверка является ли день днём рождения читателя
    public boolean IsBirthday(Date day)
    {
        return birth.IsAnniversary(day);
    }

    //Взятие книги
    public boolean TakeBook(Book book)
    {
        boolean result = false;

        if(!books.contains(book))
        {
            books.add(book);
            book.AddReader(this);
            result = true;
        }
        return result;
    }

    //Сдача книги
    public boolean ReturnBook(Book book)
    {
        boolean result = false;

        if(books.contains(book))
        {
            books.remove(book);
            book.AddReader(null);
            result = true;
        }
        return result;
    }
}