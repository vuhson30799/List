package Stack;

import java.util.LinkedList;

public class MyLinkedListStack<E> {
    LinkedList<E> stack = new LinkedList<>();
    public MyLinkedListStack (){

    }

    public void push (E e){
        stack.addLast(e);
    }

    public E pop (){
        E temp = stack.getLast();
        stack.removeLast();
        return temp;
    }

    public boolean isEmpty (){
        return stack.isEmpty();
    }

    public int size (){
        return stack.size();
    }
}
