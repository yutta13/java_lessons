public class Main1 {
    public static void main(String[] args) {

        SailBoat1 newboat = new SailBoat1();
        newboat.sail();
        newboat.lowerOrSetSails(true);

        Frigate newFrigate = new Frigate();
        newFrigate.sail();
        newFrigate.lowerOrSetSails(false);

        Hydroplane newHydroplane = new Hydroplane();
        newHydroplane.sail();
        newHydroplane.fly();

    }
}
