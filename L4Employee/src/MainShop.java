public class MainShop {
    public static void main(String[] args) {
        double summ = 0;

        Shop[] array = new Shop[20];    //создаем массив шаблонов (Классов)

        for (int i = 0; i < 20; i++) {
            array[i] = new Shop(" - Ромашка № " +i );  // создаем обект массива
            array[i].name = "Новый магазин "; // элементу обьекта присвоили имя
//            System.out.print(array[i].name);
            array[i].profit = 100+i;
            System.out.println( " принес выручку - " + array[i].profit );
        }

        for (int i = 0; i < 20; i++) {
            summ+=array[i].profit;
        }

        System.out.println( "Итого выручка составила : " + summ);
    }
}
