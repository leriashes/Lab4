import java.util.Scanner;
import java.lang.Math;
public class Book
{
    private static int counter = 0;     //������� ����
    private static int time = 30;       //�����, �� ������� ����� ����� �����

	private String title;			//�������� �����
	private Author author;		//�����
	private int pages_number;		//���������� �������
	private String genre;			//����
	private Reader reader;	//��������
	private Publishing publishing;	//������������
	private int publ_year;			//���
    private int id;     //ID �����
    private Date borrow_date;       //���� ������ �����

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

    //�����������
    public Book()
    {
        title = "�������";
        author = new Author();
        author.NewBook(this);
        pages_number = 50;
        genre = "������";
        publishing = new Publishing();
        publ_year = 2021;
        counter += 1;
        id = counter;
        borrow_date = new Date();
    }

    //����������� � ����������
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

    //����������� � ����������
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

    //������������� ���� �����
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

    //������������� ���� �����
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

    //���� �������� ���� �����
    public void Read()
    {
        boolean f = true;
        Scanner inp = new Scanner(System.in);

        String str;

        System.out.print("������� �������� �����: ");
        do
        {
            title = inp.nextLine();

            if (title.length() == 0)
            {
                System.out.print("\n������ �����! ��������� ����: ");
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
        System.out.print("\n������� ���������� ������� � �����: ");
        do
        {
            str = inp.nextLine();
            pages_number = Convert.StringToInt(str);

            if (pages_number <= 0)
            {
                System.out.print("\n������ �����! ��������� ����: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        f = true;
        System.out.print("\n������� ����: ");
        do
        {
            genre = inp.nextLine();

            if (genre.length() == 0)
            {
                System.out.print("\n������ �����! ��������� ����: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        System.out.println();
        publishing.Read();

        f = true;
        System.out.print("\n������� ��� ������� �����: ");
        do
        {
            str = inp.nextLine();
            publ_year = Convert.StringToInt(str);

            if (publ_year <= 0)
            {
                System.out.print("\n������ �����! ��������� ����: ");
            }
            else
            {
                f = false;
            }
        } while (f);
    }

    //����� �������� ���� �����
    public void Display()
    {
        System.out.printf("ID %d", id);
        System.out.printf("\n��������: \"%s\"", title);
        System.out.printf("\n����: %s", genre);
        System.out.printf("\n���������� �������: %d", pages_number);
        System.out.printf("\n��� ����������: %d", publ_year);
        System.out.printf("\n�����: ");
        author.Display("FullName");
        System.out.print("\n������������: ");
        publishing.Display();
        if (reader != null) 
        {
            System.out.print("\n��������: ");
            reader.Display("[DocNumber] FullName");
            System.out.print("\n���� ������ �����: ");
		    borrow_date.Display("DD.MM.YYYY");
		    System.out.print("\n���� ����� �����: ");
		    Date plus = new Date(time, 0, 0);
            plus.Add(borrow_date).Display( "DD.MM.YYYY");
        }
    }

    //�������� ��������
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

    //�������� ��������� �� ����� � ����������
    public boolean InLib()
    {
        boolean result = false;

        if (reader == null)
        {
            result = true;
        }

        return result;
    }

    //��������� ��������� ����
    public boolean CmpReader(Book second_book)
    {
        return (reader == second_book.reader);
    }

    //�������� �������������� ����� ��������
    public boolean Belongs(Reader reader)
    {
        return this.reader == reader;
    }

    //�������� �������������� ����� ��������
    public boolean Belongs(Author author)
    {
        return this.author == author;
    }
}