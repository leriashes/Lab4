import java.util.Scanner;
import java.lang.Math;
public class Book
{
	private String title;			//�������� �����
	private Author author;		//�����
	private int pages_number;		//���������� �������
	private String genre;			//����
	private Reader reader;	//��������
	private Publishing publishing;	//������������
	private int publ_year;			//���

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
        Scanner inp = new Scanner(System.in, "cp866");

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
        System.out.printf("��������: \"%s\"", title);
        System.out.printf("\n����: %s", genre);
        System.out.printf("\n���������� �������: %d", pages_number);
        System.out.printf("\n��� ����������: %d", publ_year);
        System.out.printf("\n�����: ");
        author.Display("FullName");
        System.out.printf("\n������������: ");
        publishing.Display();
        if (reader != null) 
        {
            System.out.printf("\n��������: ");
            reader.Display("[DocNumber] FullName");
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