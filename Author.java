import java.util.Scanner;
public class Author	//Автор
{
	private String full_name;	//ФИО
	private Date birth;			//Дата рождения
	private String country;	//Страна
    private ArrayList<Book> books;      //Книги, написанные писателем

    //Конструктор
    public Author()
    {
        full_name = "Иванов Иван Иванович";
        birth = new Date();
        country = "Россия";
        books = new ArrayList<Book>();
    }

    //Конструктор с параметром
    public Author(String full_name, Date birth_date, String country)
    {
        this.full_name = full_name;
        birth = new Date(birth_date);
        this.country = country;
        books = new ArrayList<Book>();
    }

    //Конструктор с параметром
    public Author(String full_name, int day, int month, int year, String country)
    {
        this.full_name = full_name;
        birth = new Date(0, 0,  0, day, month, year);
        this.country = country;
        books = new ArrayList<Book>();
    }

    //Инициализация значений всех полей
    public void Init(String full_name, Date birth_date, String country)
    {
        this.full_name = full_name;
        birth = new Date(birth_date);
        this.country = country;
    }

    //Инициализация значений всех полей
    public void Init(String full_name, int day, int month, int year, String country)
    {
        this.full_name = full_name;
        birth.Init(0, 0,  0, day, month, year);
        this.country = country;
    }

    //Ввод значений всех полей
    public void Read()
    {
        boolean f = true;
        Scanner inp = new Scanner(System.in, "cp866");

        System.out.print("Введите ФИО автора: ");
        do
        {
            full_name = inp.nextLine();

            if (full_name.length() == 0)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        System.out.println("\nДата рождения");
        birth.ReadDate();

        f = true;
        System.out.print("\nВведите страну происхождения автора: ");
        do
        {
            country = inp.nextLine();

            if (country.length() == 0)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                f = false;
            }
        } while (f);
    }

    //Вывод значений полей в выбранном формате
    public void Display(String format)
    {
        String[] form = { "FullName", "FullName (Country)", "FullName (BirthDate)", "all" };
        boolean f = true;

        System.out.printf("%s ", full_name);

        for (int i = 0; i < 4 && f; i++)
        {
            if (format.equalsIgnoreCase(form[i]))
            {
                if (i == 1) 
                {
                    System.out.printf("(%s)", country);
                }
                else if (i == 2)
                {
                    System.out.printf("(");
                    birth.Display("DD.MM.YYYY");
                    System.out.printf(")");
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
            System.out.printf("(");
            birth.Display("DD.MM.YYYY");
            System.out.printf(", %s)", country);
        }
    }

    //Проверка родился ли автор в указанной стране
    public boolean BornIn(String country)
    {
        boolean result = false;

        if (this.country.equalsIgnoreCase(country))
        {
            result = true;
        }

        return result;
    }

    //Новая книга
    public void NewBook(Book book)
    {
        if(!books.contains(book))
        {
            books.add(book);
        }
    }
}