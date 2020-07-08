//распечатать число наоборот 123=321

public class Hw4 {
    public static void main(String[] args) {
        int n = 56780;
        int a=0;

        while (n>=1) {
            a = n%10;
            n /= 10;
            System.out.print(a);
        }
    }
}