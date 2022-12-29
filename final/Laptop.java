package Final;

import java.util.HashMap;
import java.util.Map;

public class Laptop {
    private int ram;
    private int hdd;
    private OSType os;
    private Color color;

    public Laptop(int ram, int hdd, OSType os, Color color) {
        this.color = color;
        this.os = os;
        this.hdd = hdd;
        this.ram = ram;
    }

    public Map<String, Object> GetProps(){
        var map = new HashMap<String,Object>();
        map.put("os", os);
        map.put("color", color);
        map.put("ram", ram);
        map.put("hdd", hdd);
        return map;
    }
    
    @Override
    public String toString() {
        return "OS: " + os + " RAM: " + ram + " HDD: " + hdd + " COLOR: " + color;
    }
}