package Final;

public class Filter {
    public int MinRamSize = 0;
    public int MinHDDSize = 0;
    public OSType OSType;
    public Color Color;

    public Filter() {
        MinRamSize = 0;
        MinHDDSize = 0;
        OSType = OSType.All;
        Color = Color.All;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if(MinRamSize > 0)
            sb.append("Min RAM: " + MinRamSize + "\r\n");
        if(MinHDDSize > 0)
            sb.append("Min HDD: " + MinHDDSize + "\r\n");
        sb.append("OS: " + OSType + "\r\n");
        sb.append("Color: " + Color + "\r\n");
        return sb.toString();
    }
}