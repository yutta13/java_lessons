/*
3.	Создать класс Car cо статической переменной  tankVolume (объем бака).  Присвоить переменной значение 100.
Определить в классе нестатическую переменную remainingFuel (оставшееся топливо) изначально равное tankVolume
(присвоить эту величину внутри конструктора) . Определить методы:
a.	Нестатический spendFuel( double spendedFuel),  «расходующий» топливо из оставшегося объема.
b.	Нестатический showRemainingFuel()  показывающий оставшееся топливо
c.	Статический showTankVolume() показывающий объем бака.
Использовать showTankVolume() НЕ СОЗДАВ ОБЪЕКТ. Затем создать объект класса и использовать нестатические методы.
 */
public class Car {
    static double tankVolume = 100;
    double remainingFuel = tankVolume;

    Car(double remainingFuel) {
        remainingFuel = remainingFuel;
    }

    double spendFuel() {
        double spendedFuel=20;
        for (int i = 5; i < 7; i++) {
             spendedFuel = 10 + i;
            System.out.println("израсходовано " + spendedFuel);
        }
        return spendedFuel;
    }

    void showRemainingFuel() {
        remainingFuel -= spendFuel();
        System.out.println("Оставшееся топливо " + remainingFuel);
    }

    static double showTankVolume() {
        return tankVolume;
    }

    public static void main(String[] args) {
        System.out.println("объем бака " + showTankVolume());

        Car carNew = new Car(90);
        carNew.spendFuel();
        carNew.showRemainingFuel();


    }

}
