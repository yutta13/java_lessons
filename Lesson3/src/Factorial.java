// вычислить факториал от числа a
public class Factorial {
    public static void main(String[] args) {
        int a = 5;
        int f=1;

        for (int i=1; i<=a; i++){
            f*=i;
        }
        System.out.println(f);
    }
}
