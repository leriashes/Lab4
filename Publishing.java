import java.util.Scanner;
public class Publishing     //Издательство
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

}
