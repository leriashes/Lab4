import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        ArrayList knigki = new ArrayList();

        Book b1 = new Book("Старый мир");
	    Book b2 = new Book("Новый мир");
	    ForeignBook fb1 = new ForeignBook();

        knigki.add(b1);
        knigki.add(fb1);
        knigki.add(b2);

        Iterator vb = knigki.iterator();

        System.out.print("Коллекция до сортировки\n\n");
        while (vb.hasNext())
        {
            Object element = vb.next();
            String gc = element.getClass().getSimpleName();
            if (gc.equals("Book") || gc.equals("ForeignBook"))
            {
                System.out.printf("%s\n\n", element);
            }
        }

        Collections.sort(knigki);

        System.out.print("Коллекция после сортировки\n\n");
        vb = knigki.iterator();
        while (vb.hasNext())
        {
            Object element = vb.next();
            String gc = element.getClass().getSimpleName();
            if (gc.equals("Book") || gc.equals("ForeignBook"))
            {
                System.out.printf("%s\n\n", element);
            }
        }

        Book[] b = new Book[4];
        for (int i = 0; i < 4; i++)
        {
            b[i] = new Book();
        }
        Array<Book> abook = new Array<Book>(b);
        abook.Read();
        boolean fg = abook.AllInLib();
        System.out.printf("\n\nВсе книги из массива находятся в библиотеке: ");
        if (fg)
        {
            System.out.print("да.\n");
        }
        else
        {
            System.out.print("нет.\n");
        }


        //Работа с объектами класса Date
        System.out.println("Работа с объектами класса Date");

        Date date_1 = new Date();	//Создание через конструктор без параметров
        
        //Создание через конструкторы с параметрами
        Date date_2 = new Date(12, 02, 2004);
        Date date_3 = new Date(26, 35, 12, 13, 05, 1997);
        
        //Печать созданных объектов
        System.out.printf("\nПечать данных объектов\ndate_1 = %s", date_1);
        System.out.printf("\ndate_2 = %s", date_2);
        System.out.printf("\ndate_3 = %s\n", date_3);

        //Ввод только времени
        System.out.println("\n\nВвод только времени");

        date_1.ReadTime();
        System.out.printf("\ndate_1 = ");
        date_1.Display("hh:mm:ss");
        System.out.println();

        ///Ввод только даты
        System.out.printf("\n\nВвод только даты\n");

        date_1.ReadDate();
        System.out.printf("\ndate_1 = %s\n", date_1);

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
        date_2.Now();
        System.out.printf("\n\nТекущая дата и время\ndate_2 = %s", date_2);

        //Сравнение дат
        System.out.printf("\n\n\nСравнение дат (сколько времени от первой даты до второй)\n%s и %s\n\n", date_2, date_3);
        (date_2.Compare(date_3)).Display("CompareResult");
        System.out.println();
        (date_2.Compare(date_3)).Display("CompareResultRU");
        System.out.println();

        //Инициализация значений
        System.out.printf("\n\nИнициализация значений");
        date_1.Init(30, 5, 11, 27, 6, 2010);
        System.out.printf("\ndate_1 = %s", date_1);

        date_3.Init(30, 5, 7, 2, 2, 1);
        System.out.printf("\ndate_3 = %s\n", date_3);

        //Прибавление времени к дате
        System.out.printf("\n\nПрибавление времени date_3 к дате date_1: %s\n", (date_1.Add(date_3)));

        //Проверка является дата годовщиной другой
        System.out.printf("\n\nПроверка является ли вторая дата 'годовщиной' первой\n%s и %s", date_1, date_2);
        if (date_1.IsAnniversary(date_2))
        {
            System.out.println(": да.");
        }
        else
        {
            System.out.println(": нет.");
        }

        System.out.printf("%s и %s", date_1, date_3);
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
        System.out.printf("\nПечать данных объектов\nauthor_1 = %s", author_1);
        System.out.printf("\nauthor_2 = %s", author_2);
        System.out.printf("\nauthor_3 = %s\n", author_3);

        //Ввод значений всех полей объекта
        System.out.println("\n\nВвод значений всех полей объекта");

        author_1.Read();
        System.out.printf("\nauthor_1 = %s\n", author_1);

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
        System.out.printf("\nauthor_2 = %s\n", author_2);

        //Проверка родился ли автор в заданной стране
        System.out.printf("\n\nПроверка родился ли автор в заданной стране\n%s", author_1);
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
        System.out.printf("\nПечать данных объектов\naddress_1 = %s", address_1);
        System.out.printf("\naddress_2 = %s\n", address_2);

        //Ввод значений всех полей объекта
        System.out.println("\n\nВвод значений всех полей объекта");

        address_1.Read();
        System.out.printf("\naddress_1 = %s\n", address_1);

        //Инициализация значений
        System.out.printf("\n\nИнициализация значений");
        address_1.Init("г. Троицк", "ул. Текстильщиков", 6, 2);
        System.out.printf("\naddress_1 = %s\n", address_1);

        //Проверка совпадения города
        System.out.printf("\n\nПроверка находится ли адрес в городе %s и г. Барнаул\n", address_1);
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
        System.out.printf("\nПечать данных объектов\nreader_1 = %s", reader_1);
        System.out.printf("\nreader_2 = %s", reader_2);
        System.out.printf("\nreader_3 = %s\n", reader_3);

        //Ввод значений всех полей объекта
        System.out.println("\n\nВвод значений всех полей объекта");
        reader_1.Read();
        System.out.printf("\nreader_1 = %s\n", reader_1);

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
        System.out.printf("\nreader_1 = %s\n", reader_1);

        //Проверка является ли дата днём рождения читателя
        System.out.printf("\n\nПроверка является ли дата днём рождения читателя\n%s и %s\n", reader_3, date_3);
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
        System.out.printf("\nПечать данных объектов\npublishing_1 = %s", publishing_1);
        System.out.printf("\npublishing_2 = %s\n", publishing_2);

        //Ввод значений всех полей объекта
        System.out.println("\n\nВвод значений всех полей объекта");
        publishing_1.Read();
        System.out.printf("\npublishing_1 = %s\n", publishing_1);

        //Инициализация значений
        System.out.print("\n\nИнициализация значений");
        publishing_1.Init("Паркер", "г. Вашингтон");
        System.out.printf("\npublishing_1 = %s\n", publishing_1);

        //Проверка находится ли издательство в заданном городе
        System.out.printf("\n\nПроверка находится ли издательство в заданном городе\n%s и г. Москва\n", publishing_1);
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
        System.out.printf("\nПечать данных  объектов\nbook_1 %s\n\nbook_2 %s\n\nbook_3 %s\n", book_1, book_2, book_3);

        //Ввод значений всех полей объекта
        System.out.println("\n\nВвод значений всех полей объекта");

        book_1.Read();
        System.out.printf("\n\nbook_1 %s\n", book_1);

        //Инициализация значений
        System.out.print("\n\nИнициализация значений");
        book_1.Init("Петька и Кот", author_3, 65, "Ужасы", publishing_1, 2005);
        System.out.printf("\nbook_1 %s", book_1);

        book_3.Init("Васька и Пёс", author_2, 124, "Комедия", reader_3, publishing_2, 2012);
        System.out.printf("\n\nbook_3 %s\n", book_3);

        //Привязка читателя
        book_2.AddReader(reader_1);
        System.out.printf("\n\nПривязка читателя\nbook_2 %s\n", book_2);

        //Проверка принадлежности книги читателю
        System.out.printf("\n\nПроверка принадлежности книги читателю\n\n%s\n\nи \n\n", book_2);
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
        System.out.printf("\n\nСравнение читателей книг\n%s\n\nи \n\n%s", book_3, book_2);
        if (book_3.CmpReader(book_2))
        {
            System.out.println("\n\nодин и тот же читатель.");
        }
        else
        {
            System.out.println("\n\nразные читатели.");
        }

        //Отвязка читателя
        book_2.AddReader(null);
        System.out.printf("\n\nОтвязка читателя\nbook_2 %s\n", book_2);

        //Проверка принадлежности книги читателю
        System.out.printf("\n\nПроверка принадлежности книги читателю\n%s\n\nи \n\n", book_2);
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
            System.out.printf("\n\nbook_mas[%d] %s", i, book_mas[i]);
        }

        System.out.printf("\n\nКниг в библиотеке: %d", Book.GetCounter());

        //Инициализация значений
        System.out.print("\n\nИнициализация значений");
        book_mas[1].Init("Петька и Кот", author_3, 65, "Ужасы", reader_1, publishing_1, 2005);
        System.out.printf("\nbook_mas[1] %s", book_mas[1]);

        book_mas[2].Init("Васька и Пёс", author_2, 124, "Комедия", reader_3, publishing_2, 2012);
        System.out.printf("\n\nbook_mas[2] %s\n", book_mas[2]);

        //Проверка принадлежности книги читателю
        System.out.printf("\n\nПроверка принадлежности книги читателю\n%s\n\nи\n\n", book_mas[2]);
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
        System.out.printf("\n\nСравнение читателей книг\n%s\n\nи \n\n%s", book_mas[1], book_mas[2]);
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
            System.out.printf("\n\n%s", knigi[i]);
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
            System.out.printf("\n\nodnm_mas[%d] %s", i, odnm_mas[i]);
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

        System.out.printf("\n\nodnm_mas[%d] %s", k, odnm_mas[k]);

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
                System.out.printf("\n\ndvum_mas[%d][%d] %s", i, j, dvum_mas[i][j]);
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

        System.out.printf("\n\ndvum_mas[%d][%d] %s", k, d, dvum_mas[k][d]);

        Date fdate = new Date(28, 11, 2001);
	    Address faddress = new Address();
	    Reader freader = new Reader("Шишкова Валентина Алексеевна", fdate, faddress, 123456789);
	    Author fauthor = new Author("Сьюэлл Анна", date_1, "Великобритания");
	    Publishing fpublishing = new Publishing();

	    ForeignBook fbook = new ForeignBook("Good Morning", fauthor, 345, "Фантастика", freader, fpublishing, 2021, "Английский");
        ForeignBook fbook1 = new ForeignBook();
	
	    fbook1.Init("Black Beauty", fauthor, 289, "Рассказы", publishing_1, 2019, "Английский");


        System.out.printf("\n\nИнформация об авторе author_st: %s", author_1.About());
	    System.out.printf("\n\nИнформация о читателе reader_st: %s", reader_1.About());

        //Мелкое копирование
        book_1 = (Book)book_2.clone();
        System.out.printf("\nbook_1 %s\n", book_1);
        System.out.printf("\nbook_2 %s\n", book_2);
        book_2.Init("Black Beauty", author_1, 289, "Рассказы", publishing_1, 2019);
        System.out.printf("\nbook_2 %s\n", book_2);
        System.out.printf("\nbook_1 %s\n", book_1);
    }
}