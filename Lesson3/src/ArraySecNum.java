// распечатать каждое второе число в массиве

public class ArraySecNum {
    public static void main(String[] args) {
        int[]a={7,8,1,3,5,9,0,4};
//        int b=0;

        for (int i=0; i<8; i++){
            if (i%2==1){
            int b=a[i];
            System.out.print(a[i]+" ");}

        }
    }
}
//a1 a3 a5 a7
//8 3 9 4