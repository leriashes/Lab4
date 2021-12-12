import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        //Работа с объектами класса Date
        System.out.println("Работа с объектами класса Date");

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
        System.out.println("\n\n\nРабота с объектами класса Author");
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
        System.out.println("\n\n\nРабота с объектами класса Address");

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



        //Работа с объектами класса Reader
        System.out.println("\n\n\nРабота с объектами класса Reader");

        Reader reader_1 = new Reader();	//Создание через конструктор без параметров

        //Создание через конструкторы с параметрами
        Reader reader_2 = new Reader("Петров Пётр Петрович", date_1, address_1, "0110 120954");
        Reader reader_3 = new Reader("Сидорова Светлана Сергеевна", date_2, address_2, 987654);

        //Печать созданных объектов
        System.out.print("\nПечать данных объектов\nreader_1 = ");
        reader_1.Display("all");
        System.out.print("\nreader_2 = ");
        reader_2.Display("all");
        System.out.print("\nreader_3 = ");
        reader_3.Display("all");
        System.out.println();

        //Ввод значений всех полей объекта
        System.out.println("\n\nВвод значений всех полей объекта");
        reader_1.Read();
        System.out.print("\nreader_1 = ");
        reader_1.Display("all");
        System.out.println();

        //Вывод значений полей в выбранном формате
        System.out.print("\n\nВывод значений полей в выбранном формате (помимо полного вывода)\nreader_1 (FullName) = ");
        reader_1.Display("FullName");
        System.out.print("\nreader_1 ([DocNumber] FullName) = ");
        reader_1.Display("[DocNumber] FullName");
        System.out.print("\nreader_1 (FullName (BirthDate)) = ");
        reader_1.Display("FullName (BirthDate)");
        System.out.println();

        //Инициализация значений
        System.out.print("\n\nИнициализация значений");
        reader_1.Init("Кузнецов Кирилл Корнеевич", date_3, address_1, "0112 765423");
        System.out.print("\nreader_1 = ");
        reader_1.Display("all");
        System.out.println();

        //Проверка является ли дата днём рождения читателя
        System.out.println("\n\nПроверка является ли дата днём рождения читателя");
        reader_3.Display("all");
        System.out.print(" и ");
        date_3.Display("DD.MM.YYYY");
        if (reader_3.IsBirthday(date_3))
        {
            System.out.println(": да.");
        }
        else
        {
            System.out.println(": нет.");
        }



        //Работа с объектами класса Publishing
        System.out.println("\n\n\nРабота с объектами класса Publishing");

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



        //Работа с объектами класса Book
        System.out.println("\n\n\nРабота с объектами класса Book");
        
        Book book_1 = new Book();	//Создание через конструктор без параметров
        
        //Создание через конструкторы с параметрами
        Book book_2 = new Book("Новый мир");
        Book book_3 = new Book("Петька и Васька", author_3, 76, "Рассказы", reader_1, publishing_1, 2019);

        //Печать созданных объектов
        System.out.print("\nПечать данных  объектов\nbook_1 ");
        book_1.Display();
        System.out.print("\n\nbook_2 ");
        book_2.Display();
        System.out.print("\n\nbook_3 ");
        book_3.Display();
        System.out.println();

        //Ввод значений всех полей объекта
        System.out.println("\n\nВвод значений всех полей объекта");

        book_1.Read();
        System.out.print("\n\nbook_1 ");
        book_1.Display();
        System.out.println();

        //Инициализация значений
        System.out.print("\n\nИнициализация значений");
        book_1.Init("Петька и Кот", author_3, 65, "Ужасы", publishing_1, 2005);
        System.out.print("\nbook_1 ");
        book_1.Display();

        book_3.Init("Васька и Пёс", author_2, 124, "Комедия", reader_3, publishing_2, 2012);
        System.out.print("\n\nbook_3 ");
        book_3.Display();
        System.out.println();

        //Привязка читателя
        System.out.print("\n\nПривязка читателя\nbook_2 ");
        book_2.AddReader(reader_1);
        book_2.Display();
        System.out.println();

        //Проверка принадлежности книги читателю
        System.out.println("\n\nПроверка принадлежности книги читателю");
        book_2.Display();
        System.out.println("\n\nи \n");
        reader_1.Display("Full_name");
        if (book_2.Belongs(reader_1))
        {
            System.out.println("\n\nкнига у этого читателя.");
        }
        else
        {
            System.out.println("\n\nкнига не у этого читателя.");
        }
        
        //Сравнение читателей книг
        System.out.println("\n\nСравнение читателей книг");
        book_3.Display();
        System.out.println("\n\nи \n");
        book_2.Display();
        if (book_3.CmpReader(book_2))
        {
            System.out.println("\n\nодин и тот же читатель.");
        }
        else
        {
            System.out.println("\n\nразные читатели.");
        }

        //Отвязка читателя
        System.out.print("\n\nОтвязка читателя\nbook_2 ");
        book_2.AddReader(null);
        book_2.Display();
        System.out.println();

        //Проверка принадлежности книги читателю
        System.out.println("\n\nПроверка принадлежности книги читателю");
        book_2.Display();
        System.out.println("\n\nи \n");
        reader_1.Display("Full_name");
        if (book_2.Belongs(reader_1))
        {
            System.out.println("\n\nкнига у этого читателя.");
        }
        else
        {
            System.out.println("\n\nкнига не у этого читателя.");
        }

        System.out.printf("\n\nКниг в библиотеке: %d\n", Book.GetCounter());

        //Работа с массивом объектов класса Book
        Book[] book_mas = new Book[3];

        //Печать созданных объектов
        System.out.print("\nПечать данных  объектов\n");
        for (int i = 0; i < 3; i++)
        {
            book_mas[i] = new Book("Новая книга");
            System.out.printf("\n\nbook_mas[%d] ", i);
            book_mas[i].Display();
        }

        System.out.printf("\n\nКниг в библиотеке: %d", Book.GetCounter());

        //Инициализация значений
        System.out.print("\n\nИнициализация значений");
        book_mas[1].Init("Петька и Кот", author_3, 65, "Ужасы", reader_1, publishing_1, 2005);
        System.out.print("\nbook_mas[1] ");
        book_mas[1].Display();

        book_mas[2].Init("Васька и Пёс", author_2, 124, "Комедия", reader_3, publishing_2, 2012);
        System.out.print("\n\nbook_mas[2] ");
        book_mas[2].Display();
        System.out.println();

        //Проверка принадлежности книги читателю
        System.out.println("\n\nПроверка принадлежности книги читателю");
        book_mas[2].Display();
        System.out.println("\n\nи \n");
        reader_1.Display("Full_name");
        if (book_mas[2].Belongs(reader_1))
        {
            System.out.println("\n\nкнига у этого читателя.");
        }
        else
        {
            System.out.println("\n\nкнига не у этого читателя.");
        }
        
        //Сравнение читателей книг
        System.out.println("\n\nСравнение читателей книг");
        book_mas[1].Display();
        System.out.println("\n\nи \n");
        book_mas[2].Display();
        if (book_mas[1].CmpReader(book_mas[2]))
        {
            System.out.println("\n\nодин и тот же читатель.");
        }
        else
        {
            System.out.println("\n\nразные читатели.");
        }

        Book kniga = new Book();
	    System.out.printf("\nКниг в библиотеке:%d \nВремя, на которое можно брать книги: %d", Book.GetCounter(), Book.GetTime());
	    Book.SetTime(14);
	    Book[] knigi = new Book[3];
        for (int i = 0; i < 3; i++)
        {
            knigi[i] = new Book();
        }

	    System.out.printf("\n\nКниг в библиотеке:%d \nВремя, на которое можно брать книги: %d\n\n", Book.GetCounter(), Book.GetTime());

	    Book.BorrowBook(kniga, reader_1, Date.Today());
	    kniga.Display();
	    System.out.printf("\n\nКоличество выданных книг читателю reader_st2: %d\n\n", Book.BorrowBook(knigi, 2, reader_3, Date.Today()));
	    System.out.printf("\n\nКоличество выданных книг читателю reader_st1: %d\n\n", Book.BorrowBook(knigi, 3, reader_2, Date.Today()));

        for (int i = 0; i < 3; i++)
        {
            System.out.printf("\n\n");
            knigi[i].Display();
        }

        //Работа с одномерным массивом
        Book[] odnm_mas = new Book[3];
        for (int i = 0; i < 3; i++)
        {
            odnm_mas[i] = new Book();
        }
        System.out.printf("Работа с одномерным массивом\nКниг в библиотеке:%d ", Book.GetCounter());

        for (int i = 0; i < 3; i++)
        {
            System.out.printf("\n\nodnm_mas[%d] ", i);
            odnm_mas[i].Display();
        }

        int k, d;
        String index;
        Scanner inp = new Scanner(System.in);
        do
        {
            System.out.printf("\n\nВведите индекс элемента массива для ввода: ");
            index = inp.nextLine();
            k = Convert.StringToInt(index);
        } while (k < 0 || k > 2);

        System.out.printf("%d\n\nВвод информации о книге odnm_mas[%d]\n", k, k);
        odnm_mas[k].Read();

        System.out.printf("\n\nodnm_mas[%d] ", k);
        odnm_mas[k].Display();

        //Работа с двумерным массивом
        Book[][] dvum_mas = new Book[2][2];
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                dvum_mas[i][j] = new Book();
            }
        }
        System.out.printf("Работа с двумерным массивом\nКниг в библиотеке:%d ", Book.GetCounter());

        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 2; j++)
            {
                System.out.printf("\n\ndvum_mas[%d][%d] ", i, j);
                dvum_mas[i][j].Display();
            }
        }

        do
        {
            System.out.printf("\n\nВведите номер строки двумерного массива: ");
            index = inp.nextLine();
            k = Convert.StringToInt(index);
        } while (k < 0 || k > 1);
        System.out.printf("%d", k);

        do
        {
            System.out.printf("\n\nВведите номер столбца двумерного массива: ");
            index = inp.nextLine();
            d = Convert.StringToInt(index);
        } while (d < 0 || d > 1);

        System.out.printf("%d\n\nВвод информации о книге dvum_mas[%d][%d]\n", d, k, d);
        dvum_mas[k][d].Read();

        System.out.printf("\n\ndvum_mas[%d][%d]", k, d);
        dvum_mas[k][d].Display();

        Date fdate = new Date(28, 11, 2001);
	    Address faddress = new Address();
	    Reader freader = new Reader("Шишкова Валентина Алексеевна", fdate, faddress, 123456789);
	    Author fauthor = new Author("Сьюэлл Анна", date_1, "Великобритания");
	    Publishing fpublishing = new Publishing();

	    ForeignBook fbook = new ForeignBook("Good Morning", fauthor, 345, "Фантастика", freader, fpublishing, 2021, "Английский");
        ForeignBook fbook1 = new ForeignBook();
	
	    fbook1.Init("Black Beauty", fauthor, 289, "Рассказы", publishing_1, 2019, "Английский");
    }
}