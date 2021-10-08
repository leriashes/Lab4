public class Main 
{
     public static void main(String[] args) 
     {
        //Работа с объектами класса Date
        System.out.println("Работа со объектами класса Date");

        Date date_1 = new Date();	//Создание через конструктор без параметров
        
        //Создание через конструкторы с параметрами
        Date date_2 = new Date(12, 02, 2004);
        Date date_3 = new Date(26, 35, 12, 13, 05, 1997);

        //Печать созданных объектов
        System.out.print("\nПечать данных объектов\ndate_1 = ");
        date_1.Display("all");
        System.out.print("\ndate_2 = ");
        date_2.Display("all");
        System.out.print("\ndate_3 = ");
        date_3.Display("all");
        System.out.println();

        //Ввод только времени
        System.out.println("\n\nВвод только времени");

        date_1.ReadTime();
        System.out.printf("\ndate_1 = ");
        date_1.Display("all");
        System.out.println();

        ///Ввод только даты
        System.out.printf("\n\nВвод только даты\n");

        date_1.ReadDate();
        System.out.print("\ndate_1 = ");
        date_1.Display("all");
        System.out.println();

        //Вывод значений полей в выбранном формате
        System.out.print("\n\nВывод значений полей в выбранном формате (помимо полного вывода)\ndate_1 (hh:mm:ss) = ");
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
        System.out.println();

        //Получение текущей даты и времени
        System.out.print("\n\nТекущая дата и время\ndate_2 = ");
        date_2.Now();
        date_2.Display("all");

        //Сравнение дат
        System.out.println("\n\n\nСравнение дат (сколько времени от первой даты до второй)\n");
        date_2.Display("all");
        System.out.print(" и ");
        date_3.Display("all");
        System.out.println();
        (date_2.Compare(date_3)).Display("CompareResult");
        System.out.println();
        (date_2.Compare(date_3)).Display("CompareResultRU");
        System.out.println();

        //Инициализация значений
        System.out.print("\n\nИнициализация значений");
        date_1.Init(30, 5, 11, 27, 6, 2010);
        System.out.print("\ndate_1 = ");
        date_1.Display("all");

        date_3.Init(30, 5, 7, 2, 2, 1);
        System.out.print("\ndate_3 = ");
        date_3.Display("all");
        System.out.println();

        //Прибавление времени к дате
        System.out.print("\n\nПрибавление времени date_3 к дате date_1: ");
        (date_1.Add(date_3)).Display("all");
        System.out.println();

        //Проверка является дата годовщиной другой
        System.out.println("\n\nПроверка является ли вторая дата 'годовщиной' первой\n");
        date_1.Display("all");
        System.out.print(" и ");
        date_2.Display("all");
        if (date_1.IsAnniversary(date_2))
        {
            System.out.println(": да.");
        }
        else
        {
            System.out.println(": нет.");
        }

        date_1.Display("all");
        System.out.print(" и ");
        date_3.Display("all");
        if (date_1.IsAnniversary(date_3))
        {
            System.out.println(": да.");
        }
        else
        {
            System.out.println(": нет.");
        }



        //Работа с объектами класса Author
        System.out.println("\n\n\nРабота со объектами класса Author");
        Author author_1 = new Author();	//Создание через конструктор без параметров
            
        //Создание через конструкторы с параметрами
        Author author_2 = new Author("Петров Пётр Петрович", date_1, "Украина");
        Author author_3 = new Author("Сидорова Светлана Сергеевна", 12, 12, 1972, "Беларусь");

        //Печать созданных объектов
        System.out.print("\nПечать данных объектов\nauthor_1 = ");
        author_1.Display("all");
        System.out.print("\nauthor_2 = ");
        author_2.Display("all");
        System.out.print("\nauthor_3 = ");
        author_3.Display("all");
        System.out.println();

        //Ввод значений всех полей объекта
        System.out.println("\n\nВвод значений всех полей объекта");

        author_1.Read();
        System.out.print("\nauthor_1 = ");
        author_1.Display("all");
        System.out.println();

        //Вывод значений полей в выбранном формате
        System.out.print("\n\nВывод значений полей в выбранном формате (помимо полного вывода)\nauthor_1 (FullName) = ");
        author_1.Display("FullName");
        System.out.print("\nauthor_1 (FullName (Country)) = ");
        author_1.Display("FullName (Country)");
        System.out.print("\nauthor_1 (FullName (BirthDate)) = ");
        author_1.Display("FullName (BirthDate)");
        System.out.println();

        //Инициализация значений
        System.out.print("\n\nИнициализация значений");
        author_2.Init("Паркер Энн", date_1, "США");
        System.out.print("\nauthor_2 = ");
        author_2.Display("all");
        System.out.println();

        //Проверка родился ли автор в заданной стране
        System.out.println("\n\nПроверка родился ли автор в заданной стране");
        author_1.Display("all");
        System.out.print(" и страна Россия");
        if (author_1.BornIn("Россия"))
        {
            System.out.println(": да.");
        }
        else
        {
            System.out.println(": нет.");
        }



        //Работа с объектами класса Address
        System.out.println("\n\n\nРабота со объектами класса Address");

        Address address_1 = new Address();	//Создание через конструктор без параметров
        Address address_2 = new Address("г. Новосибирск", "ул. Сиреневая", 12, 4);		//Создание через конструкторы с параметрами

        //Печать созданных объектов
        System.out.print("\nПечать данных объектов\naddress_1 = ");
        address_1.Display();
        System.out.print("\naddress_2 = ");
        address_2.Display();
        System.out.println();

        //Ввод значений всех полей объекта
        System.out.println("\n\nВвод значений всех полей объекта");

        address_1.Read();
        System.out.print("\naddress_1 = ");
        address_1.Display();
        System.out.println();

        //Инициализация значений
        System.out.print("\n\nИнициализация значений");
        address_1.Init("г. Троицк", "ул. Текстильщиков", 6, 2);
        System.out.print("\naddress_1 = ");
        address_1.Display();
        System.out.println();

        //Проверка совпадения города
        System.out.println("\n\nПроверка родился ли автор в заданной стране");
        address_1.Display();
        System.out.print(" и г. Барнаул");
        if (address_1.City("г. Барнаул"))
        {
            System.out.println(": да.");
        }
        else
        {
            System.out.println(": нет.");
        }


        //Работа с объектами класса Publishing
        System.out.println("\n\n\nРабота со объектами класса Publishing");

        Publishing publishing_1 = new Publishing();	//Создание через конструктор без параметров
        Publishing publishing_2 = new Publishing("Издательство №2", "г. Барнаул");		//Создание через конструктор с параметрами

        //Печать созданных объектов
        System.out.print("\nПечать данных объектов\npublishing_1 = ");
        publishing_1.Display();
        System.out.print("\npublishing_2 = ");
        publishing_2.Display();
        System.out.println();

        //Ввод значений всех полей объекта
        System.out.println("\n\nВвод значений всех полей объекта");
        publishing_1.Read();
        System.out.print("\npublishing_1 = ");
        publishing_1.Display();
        System.out.println();

        //Инициализация значений
        System.out.print("\n\nИнициализация значений");
        publishing_1.Init("Паркер", "г. Вашингтон");
        System.out.print("\npublishing_1 = ");
        publishing_1.Display();
        System.out.println();

        //Проверка находится ли издательство в заданном городе
        System.out.println("\n\nПроверка находится ли издательство в заданном городе");
        publishing_1.Display();
        System.out.print(" и г. Москва");
        if (publishing_1.IsHere("г. Москва"))
        {
            System.out.println(": да.");
        }
        else
        {
            System.out.println(": нет.");
        }
    }
}