package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        ArrayList<Record> list = new ArrayList<>();
        list.add(new Record("Son",true,"21/10/2018"));
        list.add(new Record("Sang",false,"20/11/2018"));
        list.add(new Record("Dung",false,"19/12/2018"));
        list.add(new Record("Vu",true,"18/1/2019"));
        list.add(new Record("Hoang",true,"20/2/2019"));
        list.add(new Record("Van",true,"20/3/2019"));
        Queue<Record> MaleQueue = new ArrayDeque<>();
        Queue<Record> FemaleQueue = new ArrayDeque<>();
        for (Record x: list
             ) {
            if (x.getGioiTinh()){
                MaleQueue.add(x);
            }else {
                FemaleQueue.add(x);
            }
        }
        for (Record x: MaleQueue
             ) {
            System.out.print(x.getInfo() + " ");
        }
        System.out.println();
        for (Record x: FemaleQueue) {
            System.out.print(x.getInfo() + " ");
        }
        System.out.println();
    }

}
