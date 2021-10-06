import java.util.Scanner;
public class Publishing
{
    private String name;	//Название
    private String city;	//Город

    //Конструктор
    public Publishing()
    {
        name = "Издательство №1";
        city = "г. Москва";
    }

    //Конструктор с параметром
    public Publishing(String name, String city)
    {
        this.name = name;
        this.city = city;
    }

    //Инициализация всех полей
    public void Init(String name, String city)
    {
        this.name = name;
        this.city = city;
    }

    //Ввод всех полей
    public void Read()
    {
        boolean f = true;
        Scanner inp = new Scanner(System.in, "cp866");

        System.out.print("Введите название издательства: ");
        do
        {
            name = inp.nextLine();

            if (name.length() == 0)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                f = false;
            }
        } while (f);

        f = true;
        System.out.print("\nВведите населённый пункт, в котором находится издательство (например: г. Барнаул): ");
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
    }

    //Вывод значений всех полей
    public void Display()
    {
        System.out.printf("%s (%s)", name, city);
    }

    //Проверка находится ли издательство в заданном городе
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

        //Работа с объектами класса Publishing
        System.out.printf("\n\n\n\nРабота со объектами класса Publishing\n");

        Publishing publishing_1 = new Publishing();	//Создание через конструктор без параметров
        Publishing publishing_2 = new Publishing("Издательство №2", "г. Барнаул");		//Создание через конструктор с параметрами

        //Печать созданных объектов
        System.out.printf("\nПечать данных объектов\npublishing1 = ");
        publishing_1.Display();
        System.out.printf("\npublishing2 = ");
        publishing_2.Display();
        System.out.printf("\n");

        //Ввод значений всех полей объекта
        System.out.printf("\nВвод значений всех полей объекта\n");

        publishing_1.Read();
        System.out.printf("\npublishing1 = ");
        publishing_1.Display();
        System.out.printf("\n\n");

        //Инициализация значений
        System.out.printf("\n\nИнициализация значений");
        publishing_1.Init("Паркер", "г. Вашингтон");
        System.out.printf("\npublishing1 = ");
        publishing_1.Display();

        //Проверка находится ли издательство в заданном городе
        System.out.printf("\n\nПроверка находится ли издательство в заданном городе\n");
        publishing_1.Display();
        System.out.printf(" и г. Москва");
        if (publishing_1.IsHere("г. Москва"))
        {
            System.out.printf(": да.\n");
        }
        else
        {
            System.out.printf(": нет.\n");
        }
    }
};
