/*
a.	Принимающий два аргумента число сторон и массив с длинами сторон. Например Polygon(3, array), где array ={3,4,5}
b.	Принимающий число сторон и величину, обозначающую длину каждой стороны
    (в данном случае, считаем, что многоугольник равносторонний)
c.	Конструктор без аргументов, выводящий надпись «многоугольник не определен»
 */
public class MainPolygon {
    public static void main(String[] args) {

        Polygon[] arrayPolygons = new Polygon[3]; //обьект класса
            arrayPolygons[0] =  new Polygon(4, new int[]{5,5,4,4});

            arrayPolygons[1] =  new Polygon(4,6);

            arrayPolygons[2] =  new Polygon();
    }
}
