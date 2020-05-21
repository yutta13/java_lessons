/*Написать программу, к-я выводит символ по введенному порядковому номеру.
Если порядковый номер меньше нуля или больше 65278 вывести сообщение об ошибке
 */
public class Home2n1 {
    public static void main(String[] args) {
        char n = 0;
        if ((n>0)&(n<65278))
            System.out.println(n);
        else System.out.println("Ошибка");
    }
}
