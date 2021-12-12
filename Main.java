import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        //������ � ��������� ������ Date
        System.out.println("������ � ��������� ������ Date");

        Date date_1 = new Date();	//�������� ����� ����������� ��� ����������
        
        //�������� ����� ������������ � �����������
        Date date_2 = new Date(12, 02, 2004);
        Date date_3 = new Date(26, 35, 12, 13, 05, 1997);
        
        //������ ��������� ��������
        System.out.print("\n������ ������ ��������\ndate_1 = ");
        date_1.Display("all");
        System.out.print("\ndate_2 = ");
        date_2.Display("all");
        System.out.print("\ndate_3 = ");
        date_3.Display("all");
        System.out.println();

        //���� ������ �������
        System.out.println("\n\n���� ������ �������");

        date_1.ReadTime();
        System.out.printf("\ndate_1 = ");
        date_1.Display("all");
        System.out.println();

        ///���� ������ ����
        System.out.printf("\n\n���� ������ ����\n");

        date_1.ReadDate();
        System.out.print("\ndate_1 = ");
        date_1.Display("all");
        System.out.println();

        //����� �������� ����� � ��������� �������
        System.out.print("\n\n����� �������� ����� � ��������� ������� (������ ������� ������)\ndate_1 (hh:mm:ss) = ");
        date_1.Display("hh:mm:ss");
        System.out.print("\ndate_1 (hh:mm) = ");
        date_1.Display("hh:mm");
        System.out.print("\ndate_1 (mm:ss) = ");
        date_1.Display("mm:ss");
        System.out.print("\ndate_1 (DD.MM.YYYY) = ");
        date_1.Display("DD.MM.YYYY");
        System.out.print("\ndate_1 (DD/MM/YYYY) = ");
        date_1.Display("DD/MM/YYYY");
        System.out.print("\ndate_1 (MM.DD.YYYY) = ");
        date_1.Display("MM.DD.YYYY");
        System.out.print("\ndate_1 (DD-MM-YYYY) = ");
        date_1.Display("DD-MM-YYYY");
        System.out.print("\ndate_1 (YYYY-MM-DD) = ");
        date_1.Display("YYYY-MM-DD");
        System.out.println();

        //��������� ������� ���� � �������
        System.out.print("\n\n������� ���� � �����\ndate_2 = ");
        date_2.Now();
        date_2.Display("all");

        //��������� ���
        System.out.println("\n\n\n��������� ��� (������� ������� �� ������ ���� �� ������)\n");
        date_2.Display("all");
        System.out.print(" � ");
        date_3.Display("all");
        System.out.println();
        (date_2.Compare(date_3)).Display("CompareResult");
        System.out.println();
        (date_2.Compare(date_3)).Display("CompareResultRU");
        System.out.println();

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        date_1.Init(30, 5, 11, 27, 6, 2010);
        System.out.print("\ndate_1 = ");
        date_1.Display("all");

        date_3.Init(30, 5, 7, 2, 2, 1);
        System.out.print("\ndate_3 = ");
        date_3.Display("all");
        System.out.println();

        //����������� ������� � ����
        System.out.print("\n\n����������� ������� date_3 � ���� date_1: ");
        (date_1.Add(date_3)).Display("all");
        System.out.println();

        //�������� �������� ���� ���������� ������
        System.out.println("\n\n�������� �������� �� ������ ���� '����������' ������\n");
        date_1.Display("all");
        System.out.print(" � ");
        date_2.Display("all");
        if (date_1.IsAnniversary(date_2))
        {
            System.out.println(": ��.");
        }
        else
        {
            System.out.println(": ���.");
        }

        date_1.Display("all");
        System.out.print(" � ");
        date_3.Display("all");
        if (date_1.IsAnniversary(date_3))
        {
            System.out.println(": ��.");
        }
        else
        {
            System.out.println(": ���.");
        }



        //������ � ��������� ������ Author
        System.out.println("\n\n\n������ � ��������� ������ Author");
        Author author_1 = new Author();	//�������� ����� ����������� ��� ����������
            
        //�������� ����� ������������ � �����������
        Author author_2 = new Author("������ ϸ�� ��������", date_1, "�������");
        Author author_3 = new Author("�������� �������� ���������", 12, 12, 1972, "��������");

        //������ ��������� ��������
        System.out.print("\n������ ������ ��������\nauthor_1 = ");
        author_1.Display("all");
        System.out.print("\nauthor_2 = ");
        author_2.Display("all");
        System.out.print("\nauthor_3 = ");
        author_3.Display("all");
        System.out.println();

        //���� �������� ���� ����� �������
        System.out.println("\n\n���� �������� ���� ����� �������");

        author_1.Read();
        System.out.print("\nauthor_1 = ");
        author_1.Display("all");
        System.out.println();

        //����� �������� ����� � ��������� �������
        System.out.print("\n\n����� �������� ����� � ��������� ������� (������ ������� ������)\nauthor_1 (FullName) = ");
        author_1.Display("FullName");
        System.out.print("\nauthor_1 (FullName (Country)) = ");
        author_1.Display("FullName (Country)");
        System.out.print("\nauthor_1 (FullName (BirthDate)) = ");
        author_1.Display("FullName (BirthDate)");
        System.out.println();

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        author_2.Init("������ ���", date_1, "���");
        System.out.print("\nauthor_2 = ");
        author_2.Display("all");
        System.out.println();

        //�������� ������� �� ����� � �������� ������
        System.out.println("\n\n�������� ������� �� ����� � �������� ������");
        author_1.Display("all");
        System.out.print(" � ������ ������");
        if (author_1.BornIn("������"))
        {
            System.out.println(": ��.");
        }
        else
        {
            System.out.println(": ���.");
        }



        //������ � ��������� ������ Address
        System.out.println("\n\n\n������ � ��������� ������ Address");

        Address address_1 = new Address();	//�������� ����� ����������� ��� ����������
        Address address_2 = new Address("�. �����������", "��. ���������", 12, 4);		//�������� ����� ������������ � �����������

        //������ ��������� ��������
        System.out.print("\n������ ������ ��������\naddress_1 = ");
        address_1.Display();
        System.out.print("\naddress_2 = ");
        address_2.Display();
        System.out.println();

        //���� �������� ���� ����� �������
        System.out.println("\n\n���� �������� ���� ����� �������");

        address_1.Read();
        System.out.print("\naddress_1 = ");
        address_1.Display();
        System.out.println();

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        address_1.Init("�. ������", "��. �������������", 6, 2);
        System.out.print("\naddress_1 = ");
        address_1.Display();
        System.out.println();

        //�������� ���������� ������
        System.out.println("\n\n�������� ������� �� ����� � �������� ������");
        address_1.Display();
        System.out.print(" � �. �������");
        if (address_1.City("�. �������"))
        {
            System.out.println(": ��.");
        }
        else
        {
            System.out.println(": ���.");
        }



        //������ � ��������� ������ Reader
        System.out.println("\n\n\n������ � ��������� ������ Reader");

        Reader reader_1 = new Reader();	//�������� ����� ����������� ��� ����������

        //�������� ����� ������������ � �����������
        Reader reader_2 = new Reader("������ ϸ�� ��������", date_1, address_1, "0110 120954");
        Reader reader_3 = new Reader("�������� �������� ���������", date_2, address_2, 987654);

        //������ ��������� ��������
        System.out.print("\n������ ������ ��������\nreader_1 = ");
        reader_1.Display("all");
        System.out.print("\nreader_2 = ");
        reader_2.Display("all");
        System.out.print("\nreader_3 = ");
        reader_3.Display("all");
        System.out.println();

        //���� �������� ���� ����� �������
        System.out.println("\n\n���� �������� ���� ����� �������");
        reader_1.Read();
        System.out.print("\nreader_1 = ");
        reader_1.Display("all");
        System.out.println();

        //����� �������� ����� � ��������� �������
        System.out.print("\n\n����� �������� ����� � ��������� ������� (������ ������� ������)\nreader_1 (FullName) = ");
        reader_1.Display("FullName");
        System.out.print("\nreader_1 ([DocNumber] FullName) = ");
        reader_1.Display("[DocNumber] FullName");
        System.out.print("\nreader_1 (FullName (BirthDate)) = ");
        reader_1.Display("FullName (BirthDate)");
        System.out.println();

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        reader_1.Init("�������� ������ ���������", date_3, address_1, "0112 765423");
        System.out.print("\nreader_1 = ");
        reader_1.Display("all");
        System.out.println();

        //�������� �������� �� ���� ��� �������� ��������
        System.out.println("\n\n�������� �������� �� ���� ��� �������� ��������");
        reader_3.Display("all");
        System.out.print(" � ");
        date_3.Display("DD.MM.YYYY");
        if (reader_3.IsBirthday(date_3))
        {
            System.out.println(": ��.");
        }
        else
        {
            System.out.println(": ���.");
        }



        //������ � ��������� ������ Publishing
        System.out.println("\n\n\n������ � ��������� ������ Publishing");

        Publishing publishing_1 = new Publishing();	//�������� ����� ����������� ��� ����������
        Publishing publishing_2 = new Publishing("������������ �2", "�. �������");		//�������� ����� ����������� � �����������

        //������ ��������� ��������
        System.out.print("\n������ ������ ��������\npublishing_1 = ");
        publishing_1.Display();
        System.out.print("\npublishing_2 = ");
        publishing_2.Display();
        System.out.println();

        //���� �������� ���� ����� �������
        System.out.println("\n\n���� �������� ���� ����� �������");
        publishing_1.Read();
        System.out.print("\npublishing_1 = ");
        publishing_1.Display();
        System.out.println();

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        publishing_1.Init("������", "�. ���������");
        System.out.print("\npublishing_1 = ");
        publishing_1.Display();
        System.out.println();

        //�������� ��������� �� ������������ � �������� ������
        System.out.println("\n\n�������� ��������� �� ������������ � �������� ������");
        publishing_1.Display();
        System.out.print(" � �. ������");
        if (publishing_1.IsHere("�. ������"))
        {
            System.out.println(": ��.");
        }
        else
        {
            System.out.println(": ���.");
        }



        //������ � ��������� ������ Book
        System.out.println("\n\n\n������ � ��������� ������ Book");
        
        Book book_1 = new Book();	//�������� ����� ����������� ��� ����������
        
        //�������� ����� ������������ � �����������
        Book book_2 = new Book("����� ���");
        Book book_3 = new Book("������ � ������", author_3, 76, "��������", reader_1, publishing_1, 2019);

        //������ ��������� ��������
        System.out.print("\n������ ������  ��������\nbook_1 ");
        book_1.Display();
        System.out.print("\n\nbook_2 ");
        book_2.Display();
        System.out.print("\n\nbook_3 ");
        book_3.Display();
        System.out.println();

        //���� �������� ���� ����� �������
        System.out.println("\n\n���� �������� ���� ����� �������");

        book_1.Read();
        System.out.print("\n\nbook_1 ");
        book_1.Display();
        System.out.println();

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        book_1.Init("������ � ���", author_3, 65, "�����", publishing_1, 2005);
        System.out.print("\nbook_1 ");
        book_1.Display();

        book_3.Init("������ � ϸ�", author_2, 124, "�������", reader_3, publishing_2, 2012);
        System.out.print("\n\nbook_3 ");
        book_3.Display();
        System.out.println();

        //�������� ��������
        System.out.print("\n\n�������� ��������\nbook_2 ");
        book_2.AddReader(reader_1);
        book_2.Display();
        System.out.println();

        //�������� �������������� ����� ��������
        System.out.println("\n\n�������� �������������� ����� ��������");
        book_2.Display();
        System.out.println("\n\n� \n");
        reader_1.Display("Full_name");
        if (book_2.Belongs(reader_1))
        {
            System.out.println("\n\n����� � ����� ��������.");
        }
        else
        {
            System.out.println("\n\n����� �� � ����� ��������.");
        }
        
        //��������� ��������� ����
        System.out.println("\n\n��������� ��������� ����");
        book_3.Display();
        System.out.println("\n\n� \n");
        book_2.Display();
        if (book_3.CmpReader(book_2))
        {
            System.out.println("\n\n���� � ��� �� ��������.");
        }
        else
        {
            System.out.println("\n\n������ ��������.");
        }

        //������� ��������
        System.out.print("\n\n������� ��������\nbook_2 ");
        book_2.AddReader(null);
        book_2.Display();
        System.out.println();

        //�������� �������������� ����� ��������
        System.out.println("\n\n�������� �������������� ����� ��������");
        book_2.Display();
        System.out.println("\n\n� \n");
        reader_1.Display("Full_name");
        if (book_2.Belongs(reader_1))
        {
            System.out.println("\n\n����� � ����� ��������.");
        }
        else
        {
            System.out.println("\n\n����� �� � ����� ��������.");
        }

        System.out.printf("\n\n���� � ����������: %d\n", Book.GetCounter());

        //������ � �������� �������� ������ Book
        Book[] book_mas = new Book[3];

        //������ ��������� ��������
        System.out.print("\n������ ������  ��������\n");
        for (int i = 0; i < 3; i++)
        {
            book_mas[i] = new Book("����� �����");
            System.out.printf("\n\nbook_mas[%d] ", i);
            book_mas[i].Display();
        }

        System.out.printf("\n\n���� � ����������: %d", Book.GetCounter());

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        book_mas[1].Init("������ � ���", author_3, 65, "�����", reader_1, publishing_1, 2005);
        System.out.print("\nbook_mas[1] ");
        book_mas[1].Display();

        book_mas[2].Init("������ � ϸ�", author_2, 124, "�������", reader_3, publishing_2, 2012);
        System.out.print("\n\nbook_mas[2] ");
        book_mas[2].Display();
        System.out.println();

        //�������� �������������� ����� ��������
        System.out.println("\n\n�������� �������������� ����� ��������");
        book_mas[2].Display();
        System.out.println("\n\n� \n");
        reader_1.Display("Full_name");
        if (book_mas[2].Belongs(reader_1))
        {
            System.out.println("\n\n����� � ����� ��������.");
        }
        else
        {
            System.out.println("\n\n����� �� � ����� ��������.");
        }
        
        //��������� ��������� ����
        System.out.println("\n\n��������� ��������� ����");
        book_mas[1].Display();
        System.out.println("\n\n� \n");
        book_mas[2].Display();
        if (book_mas[1].CmpReader(book_mas[2]))
        {
            System.out.println("\n\n���� � ��� �� ��������.");
        }
        else
        {
            System.out.println("\n\n������ ��������.");
        }

        Book kniga = new Book();
	    System.out.printf("\n���� � ����������:%d \n�����, �� ������� ����� ����� �����: %d", Book.GetCounter(), Book.GetTime());
	    Book.SetTime(14);
	    Book[] knigi = new Book[3];
        for (int i = 0; i < 3; i++)
        {
            knigi[i] = new Book();
        }

	    System.out.printf("\n\n���� � ����������:%d \n�����, �� ������� ����� ����� �����: %d\n\n", Book.GetCounter(), Book.GetTime());

	    Book.BorrowBook(kniga, reader_1, Date.Today());
	    kniga.Display();
	    System.out.printf("\n\n���������� �������� ���� �������� reader_st2: %d\n\n", Book.BorrowBook(knigi, 2, reader_3, Date.Today()));
	    System.out.printf("\n\n���������� �������� ���� �������� reader_st1: %d\n\n", Book.BorrowBook(knigi, 3, reader_2, Date.Today()));

        for (int i = 0; i < 3; i++)
        {
            System.out.printf("\n\n");
            knigi[i].Display();
        }

        //������ � ���������� ��������
        Book[] odnm_mas = new Book[3];
        for (int i = 0; i < 3; i++)
        {
            odnm_mas[i] = new Book();
        }
        System.out.printf("������ � ���������� ��������\n���� � ����������:%d ", Book.GetCounter());

        for (int i = 0; i < 3; i++)
        {
            System.out.printf("\n\nodnm_mas[%d] ", i);
            odnm_mas[i].Display();
        }

        int k, d;
        String index;
        Scanner inp = new Scanner(System.in);
        do
        {
            System.out.printf("\n\n������� ������ �������� ������� ��� �����: ");
            index = inp.nextLine();
            k = Convert.StringToInt(index);
        } while (k < 0 || k > 2);

        System.out.printf("%d\n\n���� ���������� � ����� odnm_mas[%d]\n", k, k);
        odnm_mas[k].Read();

        System.out.printf("\n\nodnm_mas[%d] ", k);
        odnm_mas[k].Display();

        //������ � ��������� ��������
        Book[][] dvum_mas = new Book[2][2];
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                dvum_mas[i][j] = new Book();
            }
        }
        System.out.printf("������ � ��������� ��������\n���� � ����������:%d ", Book.GetCounter());

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.printf("\n\ndvum_mas[%d][%d] ", i, j);
                dvum_mas[i][j].Display();
            }
        }

        do
        {
            System.out.printf("\n\n������� ����� ������ ���������� �������: ");
            index = inp.nextLine();
            k = Convert.StringToInt(index);
        } while (k < 0 || k > 1);
        System.out.printf("%d", k);

        do
        {
            System.out.printf("\n\n������� ����� ������� ���������� �������: ");
            index = inp.nextLine();
            d = Convert.StringToInt(index);
        } while (d < 0 || d > 1);

        System.out.printf("%d\n\n���� ���������� � ����� dvum_mas[%d][%d]\n", d, k, d);
        dvum_mas[k][d].Read();

        System.out.printf("\n\ndvum_mas[%d][%d]", k, d);
        dvum_mas[k][d].Display();

        Date fdate = new Date(28, 11, 2001);
	    Address faddress = new Address();
	    Reader freader = new Reader("������� ��������� ����������", fdate, faddress, 123456789);
	    Author fauthor = new Author("������ ����", date_1, "��������������");
	    Publishing fpublishing = new Publishing();

	    ForeignBook fbook = new ForeignBook("Good Morning", fauthor, 345, "����������", freader, fpublishing, 2021, "����������");
        ForeignBook fbook1 = new ForeignBook();
	
	    fbook1.Init("Black Beauty", fauthor, 289, "��������", publishing_1, 2019, "����������");
    }
}