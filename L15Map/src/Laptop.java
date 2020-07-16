import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;


public class Laptop {
    String memory;
    String OS;
    String RAM;
    String VideoCard;

    Map<String, String> properties = new HashMap<>();


    void setMemory(String m){
        this.memory = m;
        properties.put(memory,m);
    }

    void setOS(String s){
        this.OS = s;
        properties.put(OS,s);
    }
    void setRAM(String r){
        this.RAM = r;
        properties.put(RAM,r);
    }
    void setVideoCard(String v){
        this.VideoCard = v;
        properties.put(VideoCard,v);
    }


    void printProperties(Object p){
        System.out.println(properties.get(p));
    }
    void removeProperties(Object p){
        properties.remove(p);
    }
    void replaceProperties(String k, String v){
        properties.replace(k, v);
    }


    public static void main(String[] args) {

        Laptop mac = new Laptop();

        mac.setMemory("128 GB");
        mac.setOS("MacOS Catalina");
        mac.setRAM("DDR3");
        mac.setVideoCard("Intel(R) UHD Graphics 620\\n");

        mac.printProperties(mac.memory);

        mac.removeProperties(mac.RAM);


        Laptop dell = new Laptop();
        dell.setMemory("64 Gb");
        dell.printProperties(dell.memory);
        dell.replaceProperties(dell.memory, "256 gb");
        dell.printProperties(dell.memory);


        System.out.println(dell.properties.values());
        System.out.println(mac.properties.values());

        mac.replaceProperties(mac.OS, "Catalina 2");
        boolean contain =  mac.properties.containsKey("RAM");

        System.out.println(dell.properties.values());
        System.out.println(mac.properties.values());




    }
}
