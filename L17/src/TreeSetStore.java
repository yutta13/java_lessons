import java.util.TreeSet;
/*
1.	Возрастание цены
2.	Модели в алфавитном порядке
3.	Возрастание тактовой частоты
4.	Убывание объема памяти
 */
public class TreeSetStore {
    public static void main(String[] args) {
        TreeSet<Phone> s1 = new TreeSet<>(new PriceSort());
        TreeSet<Phone> s2 = new TreeSet<>();
        TreeSet<Phone> s3 = new TreeSet<>(new ProcessorSort());
        TreeSet<Phone> s4 = new TreeSet<>(new VolumeMemSort());

        Phone p1 = new Phone(2000,128, "Al", 400);
        Phone p2 = new Phone(1800,8, "Bl", 500);
        Phone p3 = new Phone(2200,256, "Cl", 100);
        Phone p4 = new Phone(1600,32, "Dl", 350);
        Phone p5 = new Phone(1000,16, "El", 800);
        Phone p6 = new Phone(2400,64, "Fl", 200);

        s1.add(p4);
        s1.add(p1);
        s1.add(p3);
        s1.add(p2);

        System.out.println("\nПо цене " + s1);//по цене ОК

        s2.add(p6);
        s2.add(p3);
        s2.add(p1);
        s2.add(p2);

        System.out.println("\nПо модели " + s2);//по модели ОК

        s3.add(p1);
        s3.add(p2);
        s3.add(p3);
        s3.add(p4);

        System.out.println("\nПо частоте " + s3);//по частоте ОК

        s4.add(p1);
        s4.add(p2);
        s4.add(p3);
        s4.add(p5);

        System.out.println("\nПо убыванию памяти " + s4);//по убыванию памяти ОК


    }
}
