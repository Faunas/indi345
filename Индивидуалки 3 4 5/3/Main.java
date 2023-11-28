// Определить интерфейс Triad с методами увеличения на 1. Реализовать интерфейс в классах Date и Time.


import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Что будем создавать?\n[1] - Время\n[2] - Дата");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        if (choose == 1)
        {
            int hour = 0;
            int minute = 0;
            int second = 0;
            System.out.println("Создаём класс \"Время\"");
            System.out.println("Введите количество часов: ");
            try
            {
                hour = sc.nextInt();
                System.out.println("Введите количество минут: ");
                minute = sc.nextInt();
                System.out.println("Введите количество секунд: ");
                second = sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Ошибка ввода.Вводить можно только целые числа.");
            }
            Time t1 = new Time(hour, minute, second);
            System.out.println("Исходное время: ");
            t1.print();
            t1.plus1First();
            t1.plus1Second();
            t1.plus1Third();
            t1.print();
        }
        else if (choose == 2)
        {
            int day = 0;
            int month = 0;
            int year = 0;
            System.out.println("Создаём класс \"Дата\"");
            System.out.println("Введите количество дней: ");
            try
            {
                day = sc.nextInt();
                System.out.println("Введите месяц: ");
                month = sc.nextInt();
                System.out.println("Введите год: ");
                year = sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Ошибка ввода.Вводить можно только целые числа.");
            }
            Date D1 = new Date(day, month, year);
            System.out.println("Исходная дата: ");
            D1.print();
            D1.plus1First();
            D1.plus1Second();
            D1.plus1Third();
            D1.print();
        }
    }
}