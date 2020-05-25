public class shop2 {
    public static void main(String[] args) {

        double totalProfit = 0;
         String[] shopName = new String[20];
         double[] shopProfit = new double[20];
         shopProfit[0]=500;
         shopProfit[1]=600;
         shopProfit[2]=700;
         shopProfit[3]=1100;
         shopProfit[4]=300;
         shopProfit[5]=500;
         shopProfit[6]=600;
         shopProfit[7]=700;
         shopProfit[8]=1100;
         shopProfit[9]=300;
         shopProfit[10]=500;
         shopProfit[11]=600;
         shopProfit[12]=700;
         shopProfit[13]=1100;
         shopProfit[14]=300;
         shopProfit[15]=500;
         shopProfit[16]=600;
         shopProfit[17]=700;
         shopProfit[18]=1100;
         shopProfit[19]=300;

         for (int i = 0; i < shopName.length; i++) {
                shopName[i] = "someShop " + i;

            System.out.println(shopName[i] + " - выручка составляет : " + shopProfit[i] + " Руб.");
         }
         for (int i = 0; i < shopName.length; i++) {
             totalProfit += shopProfit[i];
         }
        System.out.println("Итого, выручка : " + totalProfit + " Руб.");

    }
}