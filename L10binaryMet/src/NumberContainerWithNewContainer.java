public class NumberContainerWithNewContainer {
    int number = 12;
    int number1;

    NumberContainerWithNewContainer(int n){
        number1=n;
    }

     int MethodAnd(int n){
        System.out.println(number);
        System.out.println(n);
        System.out.print(Integer.toBinaryString(number) + " AND " + Integer.toBinaryString(n) + " ... Result ");
        return number & n;
    }
     int MethodOR(int n){
        System.out.print(Integer.toBinaryString(number) + " OR " + Integer.toBinaryString(n) + " ... Result ");
        return number | n;
    }
     int MethodXOR(int n){
        System.out.print(Integer.toBinaryString(number) + " XOR " + Integer.toBinaryString(n) + " ... Result ");
        return number ^ n;
    }
     int MethodShiftRight(int n){
        System.out.print(Integer.toBinaryString(number) + " >> " + Integer.toBinaryString(n) + " ... Result ");
        return number >> n;
    }
     int MethodShiftLeft(int n){
        System.out.print(Integer.toBinaryString(number) + " << " + Integer.toBinaryString(n) + " ... Result ");
        return number << n;
    }
     int MethodInversion(int n){
        System.out.print(Integer.toBinaryString(number) + " Inversion " + Integer.toBinaryString(n) + " ... Result ");
        return ~number;
    }



    public static void main(String[] args) {
        NumberContainerWithNewContainer newContainer = new NumberContainerWithNewContainer(2);
        System.out.println(Integer.toBinaryString(newContainer.MethodAnd(3)));

    }

}
