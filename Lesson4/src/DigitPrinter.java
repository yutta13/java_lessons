/*
3.	Создать класс DigitPrinter, внутри которого есть метод printDigits().
Метод берет число и распечатывает все его цифры справа налево (как в прошлом дз).
Метод реализовать рекурсивно.
 */

public class DigitPrinter {
   static int n = 18808975;


    private static void printDigits(int n) {
        int a=0;
        if (n >= 1){
            a = n%10;
            n/=10;
            System.out.print(a);
        printDigits(n);
        }
    }

    public static void main(String[] args) {
        printDigits(n);
    }

}



