package S5;

public class Ex2Entity implements Comparable {
    private String fio;
    private Integer qtty;

    public Ex2Entity(String fio, Integer qtty) {
        this.fio = fio;
        this.qtty = qtty;
    }

    @Override
    public String toString() {
        return fio + " - " + qtty.toString();
    }

    @Override
    public int compareTo(Object o) {
        var obj = ((Ex2Entity) o);
        if(this.qtty == 1 || (this.qtty == obj.qtty && this.fio == obj.fio))
            return 0;
        if(this.qtty > obj.qtty)
            return -1;    
        return 1;
    }

}