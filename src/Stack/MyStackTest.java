package Stack;


import LinkedList.MyLinkedList;

public class MyStackTest {
    public static void main(String[] args) {
        stackOfIntegers();
        stackOfStrings();
    }

    public static void stackOfStrings (){
        MyLinkedListStack<String> myLinkedListStack = new MyLinkedListStack<>();
        myLinkedListStack.push("Son");
        myLinkedListStack.push("Sang");
        myLinkedListStack.push("Vu");
        myLinkedListStack.push("Loc");
        myLinkedListStack.push("Hoang");
        myLinkedListStack.push("Dung");
        System.out.println(myLinkedListStack.pop());
        System.out.println(myLinkedListStack.isEmpty());
    }

    public static void stackOfIntegers () {
        MyLinkedListStack<Integer> myLinkedListStack = new MyLinkedListStack<>();
        myLinkedListStack.push(1);
        myLinkedListStack.push(2);
        myLinkedListStack.push(3);
        myLinkedListStack.push(4);
        myLinkedListStack.push(5);
        System.out.println(myLinkedListStack.pop());
        System.out.println(myLinkedListStack.isEmpty());
    }
}
