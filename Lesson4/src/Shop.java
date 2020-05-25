/* 2.	Создать класс Магазин, у которого будут следующие характеристики:
        a.	Название
        b.	Дневная выручка
        Создать 20 экземпляров магазина, присвоить им названия и выручку.
        Затем вычислить суммарную выручку всех магазинов.
        Для этого можно использовать циклы и массивы
*/
public class Shop {
       String name=null;
       double profit;
        static String[] shopName = new String[5];
        static double[] shopProfit = new double[5];
        double totalProfit = 0;

       void getTotal() {
           for (int i = 0; i < shopProfit.length; i++) {
               totalProfit += shopProfit[i];
           }
       }

        public static void main(String[] args) {
           Shop shop0 =new Shop();
           shop0.shopName[0]= "k";
           shop0.shopProfit[0]=900;
 //           System.out.print (shopName[0]);
           shop0.getTotal();

           Shop shop1 =new Shop();
           shop1.shopName[1]= "k1";
           shop1.shopProfit[1]=900;
           shop1.getTotal();

           Shop shop2 =new Shop();
           shop2.shopName[2]= "k2";
           shop2.shopProfit[2]=900;
           shop2.getTotal();

           Shop shop3 =new Shop();
           shop3.shopName[3]= "k3";
           shop3.shopProfit[3]=900;
           shop3.getTotal();

           Shop shop4 =new Shop();
           shop4.shopName[4]= "k4";
           shop4.shopProfit[4]= 80;
           shop4.getTotal();

           System.out.println(shop4.totalProfit);
    }

}