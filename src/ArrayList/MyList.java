package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULD_CAPACITY = 10;
    Object elements[];
    public MyList () {
        this.elements = new Object[DEFAULD_CAPACITY];
    }
    public MyList (int capacity) {
        this.elements = new Object[capacity];
    }
    public void add (int index,E element){
        ensureCapacity(DEFAULD_CAPACITY);
        for (int i = size + 1; i > index; i--) {
            elements[i] = elements[i-1];
        }
        elements[index] = element;
        size++;
    }
    public E remove (int index){
        E removedElement = (E)elements[index];
        if (index < 0 || index > size){
            System.out.println("this element isn't exist");
            return null;
        }
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return removedElement;
    }
    public int size(){
        return size;
    }
    public Object clone (){
       MyList<E> v = new MyList<E>();
       v.elements = this.elements;
       return v;
    }

    public boolean contains (E o){
        if (o == null){
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) return true;
            }
        }else{
            for (Object x: elements) {
                if (x.equals(o)) return true;
            }
        }
        return false;
    }
    public int indexOf (E o){

        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) return i;
        }
        System.out.println("This element isn't exist");
        return -1;
    }
    public boolean add (E e){
        ensureCapacity(DEFAULD_CAPACITY);
        elements[size++] = e;
        return true;
    }
    public E get (int i) {
        if (i < 0 || i > size){
            System.out.println("This index isn't exist");
            return null;
        }
        return (E)(elements[i]);
    }
    public void clear (){
        elements = new Object[DEFAULD_CAPACITY];
    }
    public void ensureCapacity(int minCapacity) {
        if (size + 1 > elements.length){
            if (minCapacity < DEFAULD_CAPACITY){
                System.out.println("minCapacity isn;t Illegal. Develop this array with Default size");
                elements = Arrays.copyOf(elements,size * 2);
            }else{
                elements = Arrays.copyOf(elements,minCapacity);
            }

        }
    }
    public void getInfo (){
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}






