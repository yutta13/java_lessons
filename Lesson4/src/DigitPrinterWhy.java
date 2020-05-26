public class DigitPrinterWhy {
        public static void main(String[] args) {

            System.out.println(printDigits(65430));

            static void printDigits(int n) {
                int a=0;
                if (n < 1){
                    return;
                }
                else
                    a = n%10;
                    n/=10;
                    System.out.print(a);
                    return;
                }
            }


}
