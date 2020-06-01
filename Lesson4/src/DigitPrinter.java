/*
3.	Создать класс DigitPrinter, внутри которого есть метод printDigits().
Метод берет число и распечатывает все его цифры справа налево (как в прошлом дз).
Метод реализовать рекурсивно.
 */

public class DigitPrinter {

    void printDigits(int n) {
        int a=0;
        if (n >= 1){
            a = n%10;
            n/=10;
            System.out.print(a);
        printDigits(n);
        }
    }

    public static void main(String[] args) {
        int n = 1880897534;
        DigitPrinter d= new DigitPrinter();
        d.printDigits(n);
    }

}



