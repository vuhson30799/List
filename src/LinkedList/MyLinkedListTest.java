package LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        System.out.println("1.Add Son Van Hoang");
        list.add("Son");
        list.add("Van");
        list.add("Hoang");
        list.printList();

        System.out.println("2. Add first Vu Add last Loc: ");
        list.addFirst("Vu");
        list.addLast("Loc");
        list.printList();

        System.out.println("3. Add Dung at 6 and 3");
        list.add(6,"Dung");
        list.add(3,"Dung");
        list.printList();

        System.out.println("4. Remove obj 3 and 10");
        list.remove(3);
        list.remove(10);
        list.printList();

        System.out.println("7. Remove obj Son and Mam");
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
