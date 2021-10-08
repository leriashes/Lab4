public class Main 
{
     public static void main(String[] args) 
     {
        //������ � ��������� ������ Date
        System.out.println("������ �� ��������� ������ Date");

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
        System.out.println("\n\n\n������ �� ��������� ������ Author");
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
        System.out.println("\n\n\n������ �� ��������� ������ Address");

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


        //������ � ��������� ������ Publishing
        System.out.println("\n\n\n������ �� ��������� ������ Publishing");

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
    }
}