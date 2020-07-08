public class Frigate implements SailBoat {
    @Override
    public void sail() {
        System.out.print("Фрегат может плыть  ");
    }

    public void lowerOrSetSails(boolean sailslow) {
        String result =( sailslow ==true) ? "Паруса подняты" : "Паруса опущены";
        System.out.println(result);
    }
}
