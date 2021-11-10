import java.util.Scanner;
public class Address
{
	private String city;	//Название населённого пункта
	private String street;	//Название улицы
	private int house;		//Номер дома
	private int flat;		//Номер квартиры

    //Конструктор
    public Address()
    {
        city = "г. Москва";
        street = "Ленинский проспект";
        house = 1;
        flat = 1;
    }

    //Конструктор с параметром
    public Address(String city, String street, int house_number, int flat_number)
    {
        this.city = city;
        this.street = street;
        house = house_number;
        flat = flat_number;
    }

    //Инициализация всех полей
    public void Init(String city, String street, int house_number, int flat_number)
    {
        this.city = city;
        this.street = street;
        house = house_number;
        flat = flat_number;
    }

    //Ввод значений всех полей
    public void Read()
    {
        boolean f = true;
        Scanner inp = new Scanner(System.in);

        String str;

        System.out.print("Введите название населённого пункта (например: г. Барнаул): ");
        do
        {
            city = inp.nextLine();

            if (city.length() == 0)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        f = true;
        System.out.print("\nВведите название улицы (например: ул. Попова): ");
        do
        {
            street = inp.nextLine();

            if (street.length() == 0)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        f = true;
        System.out.print("\nВведите номер дома: ");
        do
        {
            str = inp.nextLine();
            house = Convert.StringToInt(str);

            if (house <= 0)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        f = true;
        System.out.print("\nВведите номер квартиры: ");
        do
        {
            str = inp.nextLine();
            flat = Convert.StringToInt(str);

            if (flat <= 0)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                f = false;
            }
        } while (f);
    }

    //Вывод значений всех полей
    public void Display()
    {
        System.out.printf("%s, %s %d, %d", city, street, house, flat);
    }

    //Проверка совпадения города
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
