public class SailBoat1 implements SailBoat{
    public void sail(){
        System.out.print("Парусная лодка может плыть  ");
    };
    @Override
    public void lowerOrSetSails(boolean sailslow) {
        String result =( sailslow ==true) ? "Паруса cпущены" : "Паруса подняты";
        System.out.println( result);
    }
}