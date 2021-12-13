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
        Scanner inp = new Scanner(System.in);

        System.out.print("Введите название издательства: ");
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
                    throw new Exception("\nОшибка ввода! Повторите ввод: ");
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
        System.out.print("\nВведите населённый пункт, в котором находится издательство (например: г. Барнаул): ");
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
                    throw new Exception("\nОшибка ввода! Повторите ввод: ");
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

    //Вывод значений всех полей
    public void Display()
    {
        System.out.printf("%s (%s)", name, city);
    }

    public String toString()
    {
        return name + " (" + city + ")";
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
