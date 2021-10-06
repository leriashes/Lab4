import java.util.Scanner;
public class Publishing
{
    private String name;	//��������
    private String city;	//�����

    //�����������
    public Publishing()
    {
        name = "������������ �1";
        city = "�. ������";
    }

    //����������� � ����������
    public Publishing(String name, String city)
    {
        this.name = name;
        this.city = city;
    }

    //������������� ���� �����
    public void Init(String name, String city)
    {
        this.name = name;
        this.city = city;
    }

    //���� ���� �����
    public void Read()
    {
        boolean f = true;
        Scanner inp = new Scanner(System.in, "cp866");

        System.out.print("������� �������� ������������: ");
        do
        {
            name = inp.nextLine();

            if (name.length() == 0)
            {
                System.out.print("\n������ �����! ��������� ����: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        f = true;
        System.out.print("\n������� ��������� �����, � ������� ��������� ������������ (��������: �. �������): ");
        do
        {
            city = inp.nextLine();

            if (city.length() == 0)
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
        System.out.printf("%s (%s)", name, city);
    }

    //�������� ��������� �� ������������ � �������� ������
    public boolean IsHere(String city)
    {
        boolean result = false;

        if (this.city.equalsIgnoreCase(city)) 
        {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {

        //������ � ��������� ������ Publishing
        System.out.printf("\n\n\n\n������ �� ��������� ������ Publishing\n");

        Publishing publishing_1 = new Publishing();	//�������� ����� ����������� ��� ����������
        Publishing publishing_2 = new Publishing("������������ �2", "�. �������");		//�������� ����� ����������� � �����������

        //������ ��������� ��������
        System.out.printf("\n������ ������ ��������\npublishing1 = ");
        publishing_1.Display();
        System.out.printf("\npublishing2 = ");
        publishing_2.Display();
        System.out.printf("\n");

        //���� �������� ���� ����� �������
        System.out.printf("\n���� �������� ���� ����� �������\n");

        publishing_1.Read();
        System.out.printf("\npublishing1 = ");
        publishing_1.Display();
        System.out.printf("\n\n");

        //������������� ��������
        System.out.printf("\n\n������������� ��������");
        publishing_1.Init("������", "�. ���������");
        System.out.printf("\npublishing1 = ");
        publishing_1.Display();

        //�������� ��������� �� ������������ � �������� ������
        System.out.printf("\n\n�������� ��������� �� ������������ � �������� ������\n");
        publishing_1.Display();
        System.out.printf(" � �. ������");
        if (publishing_1.IsHere("�. ������"))
        {
            System.out.printf(": ��.\n");
        }
        else
        {
            System.out.printf(": ���.\n");
        }
    }
};
