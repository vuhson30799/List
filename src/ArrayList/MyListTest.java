package ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> arr = new MyList();
        arr.add("Son");
        arr.add("Sang");
        arr.add("Loc");
        arr.add("Vu");
        arr.add(1,"Van");
        arr.add(6,"Hoang");
        arr.getInfo();

        System.out.println("Does this array has Van " + arr.contains("Van"));

        System.out.println("Remove first element " + arr.remove(1));
        arr.getInfo();
        System.out.println("Index of Loc " + arr.indexOf("Loc"));

        System.out.println("Get first element: " + arr.get(1));

        arr.clear();

        arr.getInfo();


    }

}


