package ru.Firma;

public class Main extends A {
    public static void main(String[] args) {
        Main a = new Main();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);

        a.getD();

        B bInstance = new B();
        System.out.println(bInstance.ab);

    }
}



class B{
    protected   int ab = 8;
}
