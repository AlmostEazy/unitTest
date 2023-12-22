package hw_3;

public class Homework {
/*Задание 1.
Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или
нечетным. (код приложен в презентации)*/
    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
/*Задание 2.
Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал
(25;100). (код приложен в презентации)*/
    public static boolean numberInInterval(int n) {
        return n > 25 && n < 100;
    }
}
