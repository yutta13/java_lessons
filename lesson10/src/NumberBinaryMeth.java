public class NumberBinaryMeth {
    public static void main(String[] args) {
            int number = 5;
            int x = 2;
            int y = number&x;
            int y1 = number|x;
            int y2 = number^x;
            int y3 = number>>x;
            int y4 = number<<x;
            int y5 = ~number;

            System.out.println(Integer.toBinaryString(x));
            System.out.println(Integer.toBinaryString(number));
            System.out.println("AND "  + Integer.toBinaryString(y));
            System.out.println("OR "  + Integer.toBinaryString(y1));
            System.out.println("XOR "  + Integer.toBinaryString(y2));
            System.out.println(">> "  + Integer.toBinaryString(y3));
            System.out.println("<< "  + Integer.toBinaryString(y4));
            System.out.println("Inversion "  + Integer.toBinaryString(y5));

        }
    }

