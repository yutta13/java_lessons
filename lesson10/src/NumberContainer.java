public class NumberContainer {
    static int number = 12;
    int number1;


    NumberContainer(int n){
        number1=n;
    }

    @Override
    public boolean equals(Object o){
        if ((o==null)||(o instanceof NumberContainer)) {
            return false;
        }
        return this.number == ((NumberContainer)o).number;

    }

    static int MethodAnd(int n){
        System.out.print(Integer.toBinaryString(number) + " AND " + Integer.toBinaryString(n) + " ... Result ");
        return number & n;
    }
    static int MethodOR(int n){
        System.out.print(Integer.toBinaryString(number) + " OR " + Integer.toBinaryString(n) + " ... Result ");
        return number | n;
    }
    static int MethodXOR(int n){
        System.out.print(Integer.toBinaryString(number) + " XOR " + Integer.toBinaryString(n) + " ... Result ");
        return number ^ n;
    }
    static int MethodShiftRight(int n){
        System.out.print(Integer.toBinaryString(number) + " >> " + Integer.toBinaryString(n) + " ... Result ");
        return number >> n;
    }
    static int MethodShiftLeft(int n){
        System.out.print(Integer.toBinaryString(number) + " << " + Integer.toBinaryString(n) + " ... Result ");
        return number << n;
    }
    static int MethodInversion(int n){
        System.out.print(Integer.toBinaryString(number) + " Inversion " + Integer.toBinaryString(n) + " ... Result ");
        return ~number;
    }



    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(MethodAnd(4)));
        System.out.println(Integer.toBinaryString(MethodOR(4)));
        System.out.println(Integer.toBinaryString(MethodXOR(4)));
        System.out.println(Integer.toBinaryString(MethodShiftRight(4)));
        System.out.println(Integer.toBinaryString(MethodShiftLeft(4)));
        System.out.println(Integer.toBinaryString(MethodInversion(4)));
    }

}
