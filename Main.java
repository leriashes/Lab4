import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList knigki = new ArrayList();

        Book b1 = new Book("������ ���");
	    Book b2 = new Book("����� ���");
	    ForeignBook fb1 = new ForeignBook();

        knigki.add(b1);
        knigki.add(fb1);
        knigki.add(b2);

        Iterator vb = knigki.iterator();

        System.out.print("��������� �� ����������\n\n");
        while (vb.hasNext())
        {
            Object element = vb.next();
            String gc = element.getClass().getSimpleName();
            if (gc.equals("Book") || gc.equals("ForeignBook"))
            {
                System.out.printf("%s\n\n", element);
            }
        }

        Collections.sort(knigki);

        System.out.print("��������� ����� ����������\n\n");
        vb = knigki.iterator();
        while (vb.hasNext())
        {
            Object element = vb.next();
            String gc = element.getClass().getSimpleName();
            if (gc.equals("Book") || gc.equals("ForeignBook"))
            {
                System.out.printf("%s\n\n", element);
            }
        }

        Book[] b = new Book[4];
        for (int i = 0; i < 4; i++)
        {
            b[i] = new Book();
        }
        Array<Book> abook = new Array<Book>(b);
        abook.Read();
        boolean fg = abook.AllInLib();
        System.out.printf("\n\n��� ����� �� ������� ��������� � ����������: ");
        if (fg)
        {
            System.out.print("��.\n");
        }
        else
        {
            System.out.print("���.\n");
        }


        //������ � ��������� ������ Date
        System.out.println("������ � ��������� ������ Date");

        Date date_1 = new Date();	//�������� ����� ����������� ��� ����������
        
        //�������� ����� ������������ � �����������
        Date date_2 = new Date(12, 02, 2004);
        Date date_3 = new Date(26, 35, 12, 13, 05, 1997);
        
        //������ ��������� ��������
        System.out.printf("\n������ ������ ��������\ndate_1 = %s", date_1);
        System.out.printf("\ndate_2 = %s", date_2);
        System.out.printf("\ndate_3 = %s\n", date_3);

        //���� ������ �������
        System.out.println("\n\n���� ������ �������");

        date_1.ReadTime();
        System.out.printf("\ndate_1 = ");
        date_1.Display("hh:mm:ss");
        System.out.println();

        ///���� ������ ����
        System.out.printf("\n\n���� ������ ����\n");

        date_1.ReadDate();
        System.out.printf("\ndate_1 = %s\n", date_1);

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
        date_2.Now();
        System.out.printf("\n\n������� ���� � �����\ndate_2 = %s", date_2);

        //��������� ���
        System.out.printf("\n\n\n��������� ��� (������� ������� �� ������ ���� �� ������)\n%s � %s\n\n", date_2, date_3);
        (date_2.Compare(date_3)).Display("CompareResult");
        System.out.println();
        (date_2.Compare(date_3)).Display("CompareResultRU");
        System.out.println();

        //������������� ��������
        System.out.printf("\n\n������������� ��������");
        date_1.Init(30, 5, 11, 27, 6, 2010);
        System.out.printf("\ndate_1 = %s", date_1);

        date_3.Init(30, 5, 7, 2, 2, 1);
        System.out.printf("\ndate_3 = %s\n", date_3);

        //����������� ������� � ����
        System.out.printf("\n\n����������� ������� date_3 � ���� date_1: %s\n", (date_1.Add(date_3)));

        //�������� �������� ���� ���������� ������
        System.out.printf("\n\n�������� �������� �� ������ ���� '����������' ������\n%s � %s", date_1, date_2);
        if (date_1.IsAnniversary(date_2))
        {
            System.out.println(": ��.");
        }
        else
        {
            System.out.println(": ���.");
        }

        System.out.printf("%s � %s", date_1, date_3);
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
        System.out.printf("\n������ ������ ��������\nauthor_1 = %s", author_1);
        System.out.printf("\nauthor_2 = %s", author_2);
        System.out.printf("\nauthor_3 = %s\n", author_3);

        //���� �������� ���� ����� �������
        System.out.println("\n\n���� �������� ���� ����� �������");

        author_1.Read();
        System.out.printf("\nauthor_1 = %s\n", author_1);

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
        System.out.printf("\nauthor_2 = %s\n", author_2);

        //�������� ������� �� ����� � �������� ������
        System.out.printf("\n\n�������� ������� �� ����� � �������� ������\n%s", author_1);
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
        System.out.printf("\n������ ������ ��������\naddress_1 = %s", address_1);
        System.out.printf("\naddress_2 = %s\n", address_2);

        //���� �������� ���� ����� �������
        System.out.println("\n\n���� �������� ���� ����� �������");

        address_1.Read();
        System.out.printf("\naddress_1 = %s\n", address_1);

        //������������� ��������
        System.out.printf("\n\n������������� ��������");
        address_1.Init("�. ������", "��. �������������", 6, 2);
        System.out.printf("\naddress_1 = %s\n", address_1);

        //�������� ���������� ������
        System.out.printf("\n\n�������� ��������� �� ����� � ������ %s � �. �������\n", address_1);
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
        System.out.printf("\n������ ������ ��������\nreader_1 = %s", reader_1);
        System.out.printf("\nreader_2 = %s", reader_2);
        System.out.printf("\nreader_3 = %s\n", reader_3);

        //���� �������� ���� ����� �������
        System.out.println("\n\n���� �������� ���� ����� �������");
        reader_1.Read();
        System.out.printf("\nreader_1 = %s\n", reader_1);

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
        System.out.printf("\nreader_1 = %s\n", reader_1);

        //�������� �������� �� ���� ��� �������� ��������
        System.out.printf("\n\n�������� �������� �� ���� ��� �������� ��������\n%s � %s\n", reader_3, date_3);
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
        System.out.printf("\n������ ������ ��������\npublishing_1 = %s", publishing_1);
        System.out.printf("\npublishing_2 = %s\n", publishing_2);

        //���� �������� ���� ����� �������
        System.out.println("\n\n���� �������� ���� ����� �������");
        publishing_1.Read();
        System.out.printf("\npublishing_1 = %s\n", publishing_1);

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        publishing_1.Init("������", "�. ���������");
        System.out.printf("\npublishing_1 = %s\n", publishing_1);

        //�������� ��������� �� ������������ � �������� ������
        System.out.printf("\n\n�������� ��������� �� ������������ � �������� ������\n%s � �. ������\n", publishing_1);
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
        System.out.printf("\n������ ������  ��������\nbook_1 %s\n\nbook_2 %s\n\nbook_3 %s\n", book_1, book_2, book_3);

        //���� �������� ���� ����� �������
        System.out.println("\n\n���� �������� ���� ����� �������");

        book_1.Read();
        System.out.printf("\n\nbook_1 %s\n", book_1);

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        book_1.Init("������ � ���", author_3, 65, "�����", publishing_1, 2005);
        System.out.printf("\nbook_1 %s", book_1);

        book_3.Init("������ � ϸ�", author_2, 124, "�������", reader_3, publishing_2, 2012);
        System.out.printf("\n\nbook_3 %s\n", book_3);

        //�������� ��������
        book_2.AddReader(reader_1);
        System.out.printf("\n\n�������� ��������\nbook_2 %s\n", book_2);

        //�������� �������������� ����� ��������
        System.out.printf("\n\n�������� �������������� ����� ��������\n\n%s\n\n� \n\n", book_2);
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
        System.out.printf("\n\n��������� ��������� ����\n%s\n\n� \n\n%s", book_3, book_2);
        if (book_3.CmpReader(book_2))
        {
            System.out.println("\n\n���� � ��� �� ��������.");
        }
        else
        {
            System.out.println("\n\n������ ��������.");
        }

        //������� ��������
        book_2.AddReader(null);
        System.out.printf("\n\n������� ��������\nbook_2 %s\n", book_2);

        //�������� �������������� ����� ��������
        System.out.printf("\n\n�������� �������������� ����� ��������\n%s\n\n� \n\n", book_2);
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
            System.out.printf("\n\nbook_mas[%d] %s", i, book_mas[i]);
        }

        System.out.printf("\n\n���� � ����������: %d", Book.GetCounter());

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        book_mas[1].Init("������ � ���", author_3, 65, "�����", reader_1, publishing_1, 2005);
        System.out.printf("\nbook_mas[1] %s", book_mas[1]);

        book_mas[2].Init("������ � ϸ�", author_2, 124, "�������", reader_3, publishing_2, 2012);
        System.out.printf("\n\nbook_mas[2] %s\n", book_mas[2]);

        //�������� �������������� ����� ��������
        System.out.printf("\n\n�������� �������������� ����� ��������\n%s\n\n�\n\n", book_mas[2]);
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
        System.out.printf("\n\n��������� ��������� ����\n%s\n\n� \n\n%s", book_mas[1], book_mas[2]);
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
            System.out.printf("\n\n%s", knigi[i]);
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
            System.out.printf("\n\nodnm_mas[%d] %s", i, odnm_mas[i]);
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

        System.out.printf("\n\nodnm_mas[%d] %s", k, odnm_mas[k]);

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
                System.out.printf("\n\ndvum_mas[%d][%d] %s", i, j, dvum_mas[i][j]);
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

        System.out.printf("\n\ndvum_mas[%d][%d] %s", k, d, dvum_mas[k][d]);

        Date fdate = new Date(28, 11, 2001);
	    Address faddress = new Address();
	    Reader freader = new Reader("������� ��������� ����������", fdate, faddress, 123456789);
	    Author fauthor = new Author("������ ����", date_1, "��������������");
	    Publishing fpublishing = new Publishing();

	    ForeignBook fbook = new ForeignBook("Good Morning", fauthor, 345, "����������", freader, fpublishing, 2021, "����������");
        ForeignBook fbook1 = new ForeignBook();
	
	    fbook1.Init("Black Beauty", fauthor, 289, "��������", publishing_1, 2019, "����������");


        System.out.printf("\n\n���������� �� ������ author_st: %s", author_1.About());
	    System.out.printf("\n\n���������� � �������� reader_st: %s", reader_1.About());

        //������ �����������
        book_1 = (Book)book_2.clone();
        System.out.printf("\nbook_1 %s\n", book_1);
        System.out.printf("\nbook_2 %s\n", book_2);
        book_2.Init("Black Beauty", author_1, 289, "��������", publishing_1, 2019);
        System.out.printf("\nbook_2 %s\n", book_2);
        System.out.printf("\nbook_1 %s\n", book_1);
    }
}