package LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        //ok
        System.out.println("1.Add Son Van Hoang");
        list.getFirst();
        list.add("Son");
        list.remove("Son");
        list.add("Van");
        list.remove(0);
        list.add("Hoang");
        list.printList();

        //ok
        System.out.println("2. Add first Vu Add last Loc: ");
        list.addFirst("Vu");
        list.addLast("Loc");
        list.printList();

        System.out.println("3. Add Dung at 0 then 6");
        list.add(0,"Dung");
        list.add(6,"Dung");
        list.printList();

        //ok
        System.out.println("4. Remove obj 0 then 4");
        list.remove(0);
        list.remove(4);
        list.printList();

        System.out.println("7. Remove obj Son then Mam");
        System.out.println("Remove = " + list.remove("Son"));
        System.out.println("Remove = " + list.remove("Mam"));
        list.printList();

        System.out.println("8. clone to v");
        MyLinkedList<String> v = (MyLinkedList<String>) list.clone();
        v.printList();

        System.out.println("9. Check list containing Van or Son");
        System.out.println(list.contains("Van"));
        System.out.println(list.contains("Son"));

        System.out.println("10. Index of Son and Hoang");
        System.out.println(list.indexOf("Son") + " and " + list.indexOf("Hoang"));
    }
}
