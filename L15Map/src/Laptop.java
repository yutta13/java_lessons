import java.util.HashMap;
import java.util.Map;

import static jdk.vm.ci.amd64.AMD64.k1;

public class Laptop {
    String memory;
    String OSMacOS;
    String RAM;
    String VideoCard;



    public static void main(String[] args) {
        Map<String, String> properties = new HashMap<>();

        Laptop mac = new Laptop();

        properties.put(mac.memory,"128 Gb");
        properties.put(mac.OSMacOS, "MacOS Catalina");
        properties.put(mac.RAM, "DDR3");
        properties.put(mac.VideoCard, "Intel Iris Pro 1536 MB");

        Laptop dell = new Laptop();

        properties.put(dell.memory,"64 Gb");
        properties.put(dell.OSMacOS, "Windows10");
        properties.put(dell.RAM, "DDR3");
        properties.put(dell.VideoCard, "Intel(R) UHD Graphics 620\n");

        String macMemory = properties.get(mac.memory);


    }
}
