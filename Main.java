public class Main 
{
     public static void main(String[] args) {

        //Работа с объектами класса Publishing
        System.out.printf("\n\n\n\nРабота со объектами класса Publishing\n");

        Publishing publishing_1 = new Publishing();	//Создание через конструктор без параметров
        Publishing publishing_2 = new Publishing("Издательство №2", "г. Барнаул");		//Создание через конструктор с параметрами

        //Печать созданных объектов
        System.out.printf("\nПечать данных объектов\npublishing_1 = ");
        publishing_1.Display();
        System.out.printf("\npublishing_2 = ");
        publishing_2.Display();
        System.out.printf("\n");

        //Ввод значений всех полей объекта
        System.out.printf("\nВвод значений всех полей объекта\n");

        publishing_1.Read();
        System.out.printf("\npublishing_1 = ");
        publishing_1.Display();
        System.out.printf("\n\n");

        //Инициализация значений
        System.out.printf("\n\nИнициализация значений");
        publishing_1.Init("Паркер", "г. Вашингтон");
        System.out.printf("\npublishing_1 = ");
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
}