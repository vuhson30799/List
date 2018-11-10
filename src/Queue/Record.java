package Queue;

import java.util.Date;

public class Record {
    private String name;
    private boolean gioiTinh;
    private String date;
    public Record(String name, boolean gioiTinh, String date){
        this.name = name;
        this.gioiTinh = gioiTinh;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }
    public boolean getGioiTinh (){
        return gioiTinh;
    }

    public String getInfo (){
        return name + " " + gioiTinh + " " + date;
    }

}
