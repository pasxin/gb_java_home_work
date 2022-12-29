package Final;

import java.util.ArrayList;

public class LaptopFilter {

    private ArrayList<Laptop> laptops;

    public LaptopFilter() {
        laptops = new ArrayList<>();

        laptops.add(new Laptop(8, 256, OSType.Windows, Color.Grey));
        laptops.add(new Laptop(16, 512, OSType.Windows, Color.Black));
        laptops.add(new Laptop(8, 512, OSType.Linux, Color.Black));
        laptops.add(new Laptop(4, 128, OSType.Windows, Color.Red));
    }

    public ArrayList<Laptop> GetByFilter(Filter filter){
        var lst = new ArrayList<Laptop>();

        for (Laptop laptop : laptops) {
            var props = laptop.GetProps();
            if(filter.MinRamSize <= (int)props.get("ram") 
            && filter.MinHDDSize <= (int)props.get("hdd")
            && (filter.Color == Color.All || filter.Color == (Color)props.get("color"))
            && (filter.OSType == OSType.All|| filter.OSType == (OSType)props.get("os"))){
                lst.add(laptop);
            }
        }
        return lst;
    }
}