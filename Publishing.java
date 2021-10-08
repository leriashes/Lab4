import java.util.Scanner;
public class Publishing     //������������
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

}
