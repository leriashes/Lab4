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
        Scanner inp = new Scanner(System.in);

        System.out.print("������� �������� ������������: ");
        do
        {
            try
            {
                name = inp.nextLine();

                for (int i = 0; i < name.length(); i++)
                {
                    if (name.charAt(i) == ' ')
                    {
                        if (i == 0 || i < name.length() - 1 && name.charAt(i + 1) == ' ' || i == name.length() - 1)
                        {
                            name = name.substring(0, i) + name.substring(i + 1, name.length());
                            i--;
                        }
                    }
                }

                if (name.length() == 0)
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

        f = true;
        System.out.print("\n������� ��������� �����, � ������� ��������� ������������ (��������: �. �������): ");
        do
        {
            try
            {
                city = inp.nextLine();

                for (int i = 0; i < city.length(); i++)
                {
                    if (city.charAt(i) == ' ')
                    {
                        if (i == 0 || i < city.length() - 1 && city.charAt(i + 1) == ' ' || i == city.length() - 1)
                        {
                            city = city.substring(0, i) + city.substring(i + 1, city.length());
                            i--;
                        }
                    }
                }

                if (city.length() == 0)
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

    //����� �������� ���� �����
    public void Display()
    {
        System.out.printf("%s (%s)", name, city);
    }

    public String toString()
    {
        return name + " (" + city + ")";
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
