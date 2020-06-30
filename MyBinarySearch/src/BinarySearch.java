public class BinarySearch {
    public static void main(String[] args) {
        int[]a= {4,5,9,8,1,3,2,6,7};
        int aLength = a.length;
        int buf;

        for (int i=0; i<aLength; i++){
            for (int i1=0; i1<aLength-i-1; i1++) {
                if (a[i1] > a[i1 + 1]) {
                    buf = a[i1];
                    a[i1] = a[i1 + 1];
                    a[i1 + 1] = buf;
                }
            }
        }

        for (int i=0; i<aLength; i++){
            System.out.print(a[i] + " ");
        }


        // найти число n в массиве
        int start=0;
        int end = a.length;
        int mid=0;
        int n = 8;

        boolean isFound = false;

        //учесть нулевой массив, и если числа нет в массиве
        if (aLength==0){
            System.out.println("Empty array ");
        }
        if (aLength==1){
            System.out.println(" array with 1 el");
        }

        while (!isFound) {
            mid = (end + start)/2;
            //System.out.println(mid);
            if (a[mid] == n){
                isFound = true;
               System.out.println(" index of n =  "+ mid);
               break;
           }
           else if (a[mid] > n){
               end=mid;
             //  System.out.println("work test2 found index" +a[mid]);
                isFound = false;
           }
           else if (a[mid] < n) {
                start = mid;
              //  System.out.println("work test3 found index  " + a[mid]);
                isFound = false;
            }
        }
    }
}


