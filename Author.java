import java.util.Scanner;
import java.util.ArrayList;
public class Author	//�����
{
	private String full_name;	//���
	private Date birth;			//���� ��������
	private String country;	//������
    private ArrayList<Book> books;      //�����, ���������� ���������

    //�����������
    public Author()
    {
        full_name = "������ ���� ��������";
        birth = new Date();
        country = "������";
        books = new ArrayList<Book>();
    }

    //����������� � ����������
    public Author(String full_name, Date birth_date, String country)
    {
        this.full_name = full_name;
        birth = new Date(birth_date);
        this.country = country;
        books = new ArrayList<Book>();
    }

    //����������� � ����������
    public Author(String full_name, int day, int month, int year, String country)
    {
        this.full_name = full_name;
        birth = new Date(0, 0,  0, day, month, year);
        this.country = country;
        books = new ArrayList<Book>();
    }

    //������������� �������� ���� �����
    public void Init(String full_name, Date birth_date, String country)
    {
        this.full_name = full_name;
        birth = new Date(birth_date);
        this.country = country;
    }

    //������������� �������� ���� �����
    public void Init(String full_name, int day, int month, int year, String country)
    {
        this.full_name = full_name;
        birth.Init(0, 0,  0, day, month, year);
        this.country = country;
    }

    //���� �������� ���� �����
    public void Read()
    {
        boolean f = true;
        Scanner inp = new Scanner(System.in);

        System.out.print("������� ��� ������: ");
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
                    throw new Exception("\n������ �����! ��������� ����: ");
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

        System.out.println("\n���� ��������");
        birth.ReadDate();

        f = true;
        System.out.print("\n������� ������ ������������� ������: ");
        do
        {
            try
            {
                country = inp.nextLine();

                for (int i = 0; i < country.length(); i++)
                {
                    if (country.charAt(i) == ' ')
                    {
                        if (i == 0 || i < country.length() - 1 && country.charAt(i + 1) == ' ' || i == country.length() - 1)
                        {
                            country = country.substring(0, i) + country.substring(i + 1, country.length());
                            i--;
                        }
                    }
                }

                if (country.length() == 0)
                {
                    throw new Exception("\n������ �����! ��������� ����: ");
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

    //����� �������� ����� � ��������� �������
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

    public String toString()
    {
        return full_name + " (" + birth + ", " + country + ")";
    }

    //�������� ������� �� ����� � ��������� ������
    public boolean BornIn(String country)
    {
        boolean result = false;

        if (this.country.equalsIgnoreCase(country))
        {
            result = true;
        }

        return result;
    }

    //����� �����
    public void NewBook(Book book)
    {
        if(!books.contains(book))
        {
            books.add(book);
        }
    }
}