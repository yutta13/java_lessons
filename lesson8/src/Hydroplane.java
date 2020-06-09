import javax.crypto.spec.PSource;

public class Hydroplane implements Plane, Ship{

    public void sail() {
        System.out.print("Гидроплан может плыть  ");
    }

    @Override
    public void fly() {
        System.out.println("Гидроплан может летать  ");
    }

}
