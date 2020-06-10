package lesson.record;

import org.w3c.dom.ls.LSOutput;

public class Gramophone implements Plate{

    Plate a;
    Gramophone(Plate a) {
        this.a = a;
    }

    @Override
     public void play() {
       a.play();
    }

    public static void main(String[] args) {

        Classic c1 = new Classic();
        Classic c2 = new Classic();
        Rock r1 = new Rock();
        Rock r2 = new Rock();

        Gramophone gramm = new Gramophone(r1);
        gramm.play();
        System.out.println();
    }
}

