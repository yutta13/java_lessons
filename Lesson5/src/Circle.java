/* Создать класс Circus (Круг) с полем square (площадь)  конструктор которого принимает радиус круга.
Определить в классе метод showSquare(),  выводящий на экран площадь круга.
Создать массив элементов класса Circus,  вывести на экран их площадь.
S = ПR^2
        */
public class Circle {
    private static final double P = 3.14;
    double r;


    Circle(double radius) {
        r=radius;
    }

    double ShowSquare(double r){
        double s = 0;
        s=Circle.P*r*r;
        return s;
    }
    public static void main(String[] args) {
        double sq = 0;

        Circle[] array = new Circle[1]; //создали массив класса
        array[0] =  new Circle(7); // создали массив круг

        sq =  array[0].r*array[0].r*P; //

        System.out.println("считаем площадь в массиве со занчением 7, получаем " + sq);
        System.out.println("считаем площадь через метод со значением 8 , получаем " + array[0].ShowSquare(8));

    }



}
