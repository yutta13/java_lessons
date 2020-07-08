// Вычислить наименьше число из массива
public class HW1 {
    public static void main(String[] args) {
        int[] a = {3, 9, 7, 1, 2};
        int min=a[0];

        for (int i=0;i<5;i++){
            if (min>a[i]) {
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
/*
3>9 f -->
3>7 f
3>11 f
3>2 t --> min=2
 */