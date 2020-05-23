// вычислить сумму чисел в массиве

public class ArraySum {
    public static void main(String[] args) {
        int[]a={2,3,4,7,8};
        int sum=0;

        for (int i=0; i<5; i++){
            sum+=a[i];
        }
        System.out.println(sum);

    }
}
