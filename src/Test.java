import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        char s = 'a';
        arr.add("son");
        arr.add("sang");
        arr.add("loc");
        arr.add("vu");
        arr.clone();
        System.out.println("Array list before: " + arr.toString() + arr.size());
        arr.ensureCapacity(5);
        arr.remove(0);
        System.out.println("Array list after: " + arr.toString() );
        arr.remove("A");
        System.out.println("Array list after: " + arr.toString() + arr.size());
        arr.trimToSize();
        System.out.println("Array list after: " + arr.toString() + arr.size());
        arr.clear();

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Son");
        linkedList.add("Sang");
        linkedList.add("Loc");
        linkedList.add("Vu");
        linkedList.clone();
        System.out.println("Element at third: " + linkedList.get(3));
    }
}
