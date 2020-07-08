public class Home_1 {
    public static void main(String[] args) {
        int x = 121; // задание 1
        int result_1; // задание 1
        int result_2; // задание 1

        double a = 54.434;  // задание 2
        int a1;  // задание 2

        int b1=2, c1=4, d1=2;   // задание 3
        int b2, c2, d2;   // задание 3
        int count=1;   // задание 3
        int count_total = 0;   // задание 3

        double z1=0.111111111, z2=11, z3=8.9;   // задание 3


            result_1 = x*x + 21*x-4;
             // Вычисляем формулу из задания 1
                System.out.println("1. x^2+21x-4 = " + result_1);

            result_2 = result_1%2;
             //если число четное= выводим соответсвующее сообщение
                if (result_2 == 0)
                    {
                 System.out.println("Результат - четное число");}

            a1 = (int) a; //приводим число к целому
             //выводим сообщение, введено - дробное или целое число
                if (a1==a){
                 System.out.println("2. Введено целое число");}
                else {
                 System.out.println("2. Введено дробное число");}

             //находим остаток от деления
             b2 = b1%2;
             c2 = c1%2;
             d2 = d1%2;
             //Если число нечетное- счетчик увеличивается
               if (b2 == 1)
               {count_total = count++;}
                   if (c2 == 1)
                   {count_total = count++;}
                       if (d2 == 1)
                       {count_total = count++;}
             System.out.println("3. Нечетных чисел " + count_total);

             // находим наибольшее число
                if ((z1>z2)&(z1>z3)){
                   System.out.println("4. Наибольшее число "+z1); }
                if ((z2>z1)&(z2>z3)){
                   System.out.println("4. Наибольшее число "+z2); }
                if ((z3>z1)&(z3>z2)){
                   System.out.println("4. Наибольшее число "+z3); }

        };
}
