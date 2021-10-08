import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.lang.Math;
public class Date	//Дата
{
	private int sec;	//Секунды
	private int min;	//Минуты
	private int hour;	//Часы
	private int day;	//День
	private int month;	//Месяц
	private int year;	//Год

    //Конструктор
    public Date()
    {
        sec = min = hour = 0;
        day = 1;
        month = 1;
        year = 1900;
    }

    //Конструктор с параметром (только дата)
    public Date(int day, int month, int year)
    {
        sec = min = hour = 0;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Конструктор с параметром (дата и время)
    public Date(int seconds, int minutes, int hours, int day, int month, int year)
    {
        sec = seconds;
        min = minutes;
        hour = hours;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Инициализация всех полей
    public void Init(int seconds, int minutes, int hours, int day, int month, int year) 
    {
        sec = seconds;
        min = minutes;
        hour = hours;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Ввод времени
    public void ReadTime()
    {
        String stime;
        int[] time = new int [6];
        boolean f = true;
        Scanner inp = new Scanner(System.in, "cp866");

        System.out.print("Введите время (в формате hh:mm:ss): ");
        do
        {
            stime = inp.nextLine();

            if (stime.length() != 8)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                stime = stime.substring(0, 2) + stime.substring(3, 5) + stime.substring(6);

                try 
                {
                    time[0] = Integer.parseInt(stime);
                }
                catch (NumberFormatException e)
                {
                    time[0] = 0;
                }

                for (int i = 0; i < 5 && time[0] > 0; i++)
                {
                    time[5 - i] = time[0] % 10;
                    time[0] /= 10;
                }

                if (time[0] < 0 || time[0] > 2 ||
                time[1] < 0 || time[1] > 9 || time[0] == 2 && time[1] > 3 ||
                time[2] < 0 || time[2] > 5 ||
                time[3] < 0 || time[3] > 9 ||
                time[4] < 0 || time[4] > 5 ||
                time[5] < 0 || time[5] > 9)
                {
                    System.out.print("\nОшибка ввода! Повторите ввод: ");
                }
                else
                {
                    f = false;
                }
            }
        } while (f);

        hour = time[0] * 10 + time[1];
        min = time[2] * 10 + time[3];
        sec = time[4] * 10 + time[5];
    }

    //Ввод даты
    public void ReadDate()
    {
        String sdate;
        int[] date = new int [8];
        boolean f = true;
        Scanner inp = new Scanner(System.in, "cp866");

        System.out.print("Введите дату (в формате YYYY.MM.DD): ");
        do
        {
            sdate = inp.nextLine();

            if (sdate.length() != 10)
            {
                System.out.print("\nОшибка ввода! Повторите ввод: ");
            }
            else
            {
                sdate = sdate.substring(0, 4) + sdate.substring(5, 7) + sdate.substring(8);

                try 
                {
                    date[0] = Integer.parseInt(sdate);
                }
                catch (NumberFormatException e)
                {
                    date[0] = 0;
                }

                for (int i = 0; i < 7 && date[0] > 0; i++)
                {
                    date[7 - i] = date[0] % 10;
                    date[0] /= 10;
                }

                if (date[0] < 0 || date[0] > 2 ||
                date[1] < 0 || date[1] > 9 || date[1] != 0 && date[0] > 1 ||
                date[2] < 0 || date[2] > 9 ||
                date[3] < 0 || date[3] > 9 || date[3] == 0 && date[0] == 0 && date [1] == 0 && date[2] == 0 ||
                date[4] < 0 || date[4] > 1 ||
                date[5] < 0 || date[5] > 9 || date[5] > 2 && date[4] == 1 ||
                date[6] < 0 || date[6] > 3 || date[6] == 3 && date[4] == 0 && date[5] == 2 ||
                date[7] < 0 || date[7] > 9 || date[7] == 0 && date[6] == 0 ||
                date[7] == 1 && date[6] == 3 && (date[4] == 0 && date[5] != 1 && date[5] != 3 && date[5] != 5 && date[5] != 7 && date[5] != 8 || date[4] == 1 && date[5] != 0 && date[5] != 2) ||
                date[7] >= 2 && date[7] <= 8 && date[6] > 2 ||
                date[7] == 9 && (date[6] > 2 || date[6] == 2 && date[4] == 0 && date[5] == 2 && (date[2] * 10 + date[3]) % 4 != 0))
                {
                    System.out.print("\nОшибка ввода! Повторите ввод: ");
                }
                else
                {
                    f = false;
                }
            }
        } while (f);

        year = 0;
        for (int i = 0; i < 4; i++)
        {
            year += date[i] * Math.pow(10, 3 - i);
        }

        month = date[4] * 10 + date[5];
        day = date[6] * 10 + date[7];

        return;
    }

    //Ввод значений всех полей
    public void Read() 
    {
        ReadTime();
        System.out.println();
        ReadDate();

        return;
    }

    //Вывод значений всех полей
    public void Display(String format) 
    {
        String[] form = {"hh:mm:ss", "hh:mm", "mm:ss", "DD.MM.YYYY", "DD/MM/YYYY", "MM.DD.YYYY", "DD-MM-YYYY", "YYYY-MM-DD", "CompareResult", "CompareResultRU", "all"};
        boolean f = true;

        for (int i = 0; i < 11 && f; i++)
        {
            if (format.equalsIgnoreCase(form[i]))
            {
                if (i == 0)
                {
                    System.out.printf("%02d:%02d:%02d", hour, min, sec);
                }
                else if (i == 1)
                {
                    System.out.printf("%02d:%02d", hour, min);
                }
                else if (i == 2)
                {
                    System.out.printf("%02d:%02d", min, sec);
                }
                else if (i == 3)
                {
                    System.out.printf("%02d.%02d.%04d", day, month, year);
                }
                else if (i == 4)
                {
                    System.out.printf("%02d/%02d/%04d", day, month, year);
                }
                else if (i == 5)
                {
                    System.out.printf("%02d.%02d.%04d", month, day, year);
                }
                else if (i == 6)
                {
                    System.out.printf("%02d-%02d-%04d", day, month, year);
                }
                else if (i == 7)
                {
                    System.out.printf("%04d-%02d-%02d", year, month, day);
                }
                else if (i == 8)
                {
                    int k = 0;

                    if (year > 0)
                    {
                        if (year > 1)
                        {
                            System.out.printf("%d years ", year);
                        }
                        else
                        {
                            System.out.printf("%d year ", year);
                        }
                        k++;
                    }

                    if (day > 0)
                    {
                        if (day > 1)
                        {
                            System.out.printf("%d days ", day);
                        }
                        else
                        {
                            System.out.printf("%d day ", day);
                        }
                        k++;
                    }

                    if (hour > 0)
                    {
                        if (hour > 1)
                        {
                            System.out.printf("%d hours ", hour);
                        }
                        else
                        {
                            System.out.printf("%d hour ", hour);
                        }
                        k++;
                    }

                    if (min > 0)
                    {
                        if (min > 1)
                        {
                            System.out.printf("%d minutes ", min);
                        }
                        else
                        {
                            System.out.printf("%d minute ", min);
                        }
                        k++;
                    }

                    if (sec > 0)
                    {
                        if (sec > 1)
                        {
                            System.out.printf("%d seconds ", sec);
                        }
                        else
                        {
                            System.out.printf("%d second ", sec);
                        }
                        k++;
                    }

                    if (k == 0)
                    {
                        System.out.print("The time has already come. ");
                    }
                }
                else if (i == 9)
                {
                    int k = 0;

                    if (year > 0)
                    {
                        System.out.printf("%d ", year);
                        if (year % 10 == 1 && year % 100 != 11)
                        {
                            System.out.print("год ");
                        }
                        else if (year % 10 >= 2 && year % 10 <= 4 && (year % 100 < 12 || year % 100 > 14))
                        {
                            System.out.print("года ");
                        }
                        else
                        {
                            System.out.print("лет ");
                        }
                        k++;
                    }

                    if (day > 0)
                    {
                        System.out.printf("%d ", day);
                        if (day % 10 == 1 && day % 100 != 11)
                        {
                            System.out.print("день ");
                        }
                        else if (day % 10 >= 2 && day % 10 <= 4 && (day % 100 < 12 || day % 100 > 14))
                        {
                            System.out.print("дня ");
                        }
                        else
                        {
                            System.out.print("дней ");
                        }
                        k++;
                    }

                    if (hour > 0)
                    {
                        System.out.printf("%d ", hour);
                        if (hour % 10 == 1 && hour % 100 != 11)
                        {
                            System.out.print("час ");
                        }
                        else if (hour % 10 >= 2 && hour % 10 <= 4 && (hour % 100 < 12 || hour % 100 > 14))
                        {
                            System.out.print("часа ");
                        }
                        else
                        {
                            System.out.print("часов "); 
                        }
                        k++;
                    }

                    if (min > 0)
                    {
                        System.out.printf("%d ", min);
                        if (min % 10 == 1 && min % 100 != 11)
                        {
                            System.out.print("минута ");
                        }
                        else if (min % 10 >= 2 && min % 10 <= 4 && (min % 100 < 12 || min % 100 > 14))
                        {
                            System.out.print("минуты ");
                        }
                        else
                        {
                            System.out.print("минут ");
                        }
                        k++;
                    }

                    if (sec > 0)
                    {
                        System.out.printf("%d ", sec);
                        if (sec % 10 == 1 && sec % 100 != 11)
                        {
                            System.out.print("секунда ");
                        }
                        else if (sec % 10 >= 2 && sec % 10 <= 4 && (sec % 100 < 12 || sec % 100 > 14))
                        {
                            System.out.print("секунды ");
                        }
                        else
                        { 
                            System.out.print("секунд ");
                        }
                        k++;
                    }

                    if (k == 0)
                    {
                        System.out.print("Это время уже наступило. ");
                    }
                }

                if (i < 10)
                {
                    i = 11;
                }
            }
            
            if (i == 10)
            {
                f = false;
            }
        }

        if (!f) 
        {
            System.out.printf("%02d:%02d:%02d %02d.%02d.%04d", hour, min, sec, day, month, year);
        }

    }

    //Текущая дата
    public void Now() 
    {
        LocalDateTime today = LocalDateTime.now();
        Init(today.getSecond(), today.getMinute(), today.getHour(), today.getDayOfMonth(), today.get(ChronoField.MONTH_OF_YEAR), today.getYear());
    }

    //Сравнение дат
    public Date Compare(Date end_date)
    {
        Date result = new Date();

        result.year = end_date.year - year;

        if (month > end_date.month)
        {
            for (int i = 1; i < 13; i++)
            {
                if (i >= month || i < end_date.month)
                {
                    if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                    {
                        result.day += 31;
                    }
                    else if (i == 2)
                    {
                        result.day += 28;
                        if (i >= month && year % 4 == 0 || i < end_date.month && end_date.year % 4 == 0)
                        {
                            result.day++;
                        }
                    }
                    else
                    {
                        result.day += 30;
                    }
                }

            }

            if (result.year > 0)
            {
                result.year--;
            }
        }
        else if (month == end_date.month)
        {
            result.day = end_date.day - day;
            if (result.day < 0)
            {
                result.year--;
                for (int i = 1; i < 13; i++)
                {
                    if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                    {
                        result.day += 31;
                    }
                    else if (i == 2)
                    {
                        result.day += 28;
                        if (i >= month && year % 4 == 0 || i < end_date.month && end_date.year % 4 == 0)
                        {
                            result.day++;
                        }
                    }
                    else
                    {
                        result.day += 30;
                    }
                }
            }

        }
        else
        {
            for (int i = 1; i < 13; i++)
            {
                if (i >= month && i < end_date.month)
                {
                    if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
                    {
                        result.day += 31;
                    }
                    else if (i == 2)
                    {
                        result.day += 28;
                        if (i >= month && year % 4 == 0 || i < end_date.month && end_date.year % 4 == 0)
                        {
                            result.day++;
                        }
                    }
                    else
                    {
                        result.day += 30;
                    }
                }

            }

            result.day += end_date.day - day - 1;
        }

        result.month = 0;

        if (result.day >= 0)
        {
            result.hour = 24 - hour + end_date.hour;
            if (result.day + result.year == 0)
            {
                result.hour -= 24;
            }
            else
            {
                if (result.hour >= 24)
                {
                    result.hour -= 24;
                }
                else
                {
                    result.day--;
                }
            }

            result.min = 60 - min + end_date.min;
            if (result.hour + result.day + result.year == 0)
            {
                result.min -= 60;
            }
            else
            {
                if (result.min >= 60)
                {
                    result.min -= 60;
                }
                else
                {
                    result.hour--;
                }
            }

            result.min = 60 - min + end_date.min;
            if (result.hour + result.day + result.year == 0)
            {
                result.min -= 60;
            }
            else
            {
                if (result.min >= 60)
                {
                    result.min -= 60;
                }
                else
                {
                    result.hour--;
                }
            }

            result.sec = 60 - sec + end_date.sec;
            if (result.min + result.hour + result.day + result.year == 0)
            {
                result.sec -= 60;
            }
            else
            {
                if (result.sec >= 60)
                {
                    result.sec -= 60;
                }
                else
                {
                    result.min--;
                }
            }
        }

        if (result.day < 0 || result.year < 0 || result.hour < 0 || result.min < 0 || result.sec < 0)
        {
            result.year = result.day = result.hour = result.min = result.sec = 0;
        }

        return result;
    }

    //Прибавление времени к дате
    public Date Add(Date add_date)
    {
        Date result = new Date(sec + add_date.sec, min + add_date.min, hour + add_date.hour, day + add_date.day, month + add_date.month, year + add_date.year);

        while (result.sec >= 60)
        {
            result.sec -= 60;
            result.min += 1;
        }

        while (result.min >= 60)
        {
            result.min -= 60;
            result.hour += 1;
        }

        while (result.hour >= 24)
        {
            result.hour -= 24;
            result.day += 1;
        }

        boolean f = true;

        while (f)
        {
            if (result.day > 31 && (result.month == 1 || result.month == 3 || result.month == 5 || result.month == 7 || result.month == 8 || result.month == 10 || result.month == 12))
            {
                result.day -= 31;
            }
            else if (result.month == 2 && result.day > 28)
            {
                if (result.day > 29 && result.year % 4 == 0)
                    result.day -= 29;
                else
                    result.day -= 28;
            }
            else if (result.day > 30)
            {
                result.day -= 30;
            }
            else
            {
                f = false;
            }

            if (f)
            {
                result.month++;

                if (result.month >= 13)
                {
                    result.month -= 12;
                    result.year++;
                }
            }
        }

        return result;
    }

    //Проверка является ли дата годовщиной другой
    public boolean IsAnniversary(Date second_date)
    {
        return (day == second_date.day && month == second_date.month && year <= second_date.year);
    }
}