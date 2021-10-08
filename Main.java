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
        System.out.println("\n���� ������ �������");

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

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        date_1.Init(30, 5, 11, 27, 6, 2010);
        System.out.print("\ndate_1 = ");
        date_1.Display("all");

        date_3.Init(30, 5, 7, 2, 2, 1);
        System.out.print("\ndate_3 = ");
        date_3.Display("all");

        //����������� ������� � ����
        System.out.print("\n\n����������� ������� date_3 � ���� date_1: ");
        (date_1.Add(date_3)).Display("all");

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
            System.out.print(": ��.");
        }
        else
        {
            System.out.print(": ���.");
        }



        //������ � ��������� ������ Publishing
        System.out.println("\n\n\n\n������ �� ��������� ������ Publishing");

        Publishing publishing_1 = new Publishing();	//�������� ����� ����������� ��� ����������
        Publishing publishing_2 = new Publishing("������������ �2", "�. �������");		//�������� ����� ����������� � �����������

        //������ ��������� ��������
        System.out.print("\n������ ������ ��������\npublishing_1 = ");
        publishing_1.Display();
        System.out.print("\npublishing_2 = ");
        publishing_2.Display();
        System.out.println();

        //���� �������� ���� ����� �������
        System.out.println("\n���� �������� ���� ����� �������");

        publishing_1.Read();
        System.out.print("\npublishing_1 = ");
        publishing_1.Display();
        System.out.println();
        System.out.println();

        //������������� ��������
        System.out.print("\n\n������������� ��������");
        publishing_1.Init("������", "�. ���������");
        System.out.print("\npublishing_1 = ");
        publishing_1.Display();

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