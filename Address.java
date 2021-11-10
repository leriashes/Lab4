import java.util.Scanner;
public class Address
{
	private String city;	//�������� ���������� ������
	private String street;	//�������� �����
	private int house;		//����� ����
	private int flat;		//����� ��������

    //�����������
    public Address()
    {
        city = "�. ������";
        street = "��������� ��������";
        house = 1;
        flat = 1;
    }

    //����������� � ����������
    public Address(String city, String street, int house_number, int flat_number)
    {
        this.city = city;
        this.street = street;
        house = house_number;
        flat = flat_number;
    }

    //������������� ���� �����
    public void Init(String city, String street, int house_number, int flat_number)
    {
        this.city = city;
        this.street = street;
        house = house_number;
        flat = flat_number;
    }

    //���� �������� ���� �����
    public void Read()
    {
        boolean f = true;
        Scanner inp = new Scanner(System.in);

        String str;

        System.out.print("������� �������� ���������� ������ (��������: �. �������): ");
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

        f = true;
        System.out.print("\n������� �������� ����� (��������: ��. ������): ");
        do
        {
            street = inp.nextLine();

            if (street.length() == 0)
            {
                System.out.print("\n������ �����! ��������� ����: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        f = true;
        System.out.print("\n������� ����� ����: ");
        do
        {
            str = inp.nextLine();
            house = Convert.StringToInt(str);

            if (house <= 0)
            {
                System.out.print("\n������ �����! ��������� ����: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        f = true;
        System.out.print("\n������� ����� ��������: ");
        do
        {
            str = inp.nextLine();
            flat = Convert.StringToInt(str);

            if (flat <= 0)
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
        System.out.printf("%s, %s %d, %d", city, street, house, flat);
    }

    //�������� ���������� ������
    public boolean City(String city)
    {
        boolean result = false;

        if (this.city.equalsIgnoreCase(city))
        {
            result = true;
        }

        return result;
    }
}
