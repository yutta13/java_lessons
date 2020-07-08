/* Вводится число. Если оно больше нуля, но меньше 4-ех, тогда вывести все нечетные числа.
Если оно больше пяти, но меньше 11 – вывести четное. В иных ситуациях вывести сообщение об ошибке
 */
public class Home2n2 {
    public static void main(String[] args) {
        int n = 3;
   //     char i = ;

        if ((n>0)&(n<=4))
            System.out.println("2,4");

        else if ((n>=5)&(n<11))
            System.out.println("5,7,9,11");

        else
            System.out.println("err");

    }
}
