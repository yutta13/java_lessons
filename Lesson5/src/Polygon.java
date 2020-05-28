/*
Создать класс Polygon (многоугольник) с полем perimeter. Определить три конструктора:
a.	Принимающий два аргумента число сторон и массив с длинами сторон. Например Polygon(3, array), где array ={3,4,5}
b.	Принимающий число сторон и величину, обозначающую длину каждой стороны
    (в данном случае, считаем, что многоугольник равносторонний)
c.	Конструктор без аргументов, выводящий надпись «многоугольник не определен»
Определить метод showPerimeter().  Если периметр не вычислен, то вывести надпись «периметр неизвестен».
Определить несколько объектов этого класса, используя все виды конструкторов, вывести их периметр.
 */
public class Polygon {
    //характеристки/шаблон многоугольника
    int sideCount;
    int side;
    int[]arrayLth;
    int perimeter;

// ЕСЛИ Я ПРАВИЛЬНО ПОНЯЛА , ТО THIS. ПОЗВОЛЯЕТ ПЕРЕКЛЮЧАТЬ МЕЖДУ КОНСТРУКТОРАМИ
    //коснтруктор а
    Polygon(int sideCount, int[] arrayLth) {
        this.sideCount = sideCount;
        this.arrayLth = arrayLth;

        if (sideCount>2){
        for (int i = 0; i < arrayLth.length; i++) {
            perimeter += arrayLth[i]; }
            System.out.println("Периметр1 равен " + perimeter);}
        else
        System.out.println("Ошибка. не многоугольник");
    }

    //коснтруктор b

    Polygon(int sideCount, int side) {
        this.sideCount = sideCount;
        this.side = side;

        if (sideCount<=2){
            System.out.println("Ошибка. не многоугольник");
        }
        perimeter=sideCount*side;
            System.out.println("Периметр2 равен  " + perimeter);
            }

    //коснтруктор c
    Polygon() {
        System.out.println("Не определены параметры");
    }
    }

