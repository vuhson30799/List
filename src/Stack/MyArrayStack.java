package Stack;

public class MyArrayStack<E> {
    int size;
    Object[] arr;
    int index = 0;

    public MyArrayStack (int size){
        this.size = size;
        this.arr = new Object[size];
    }
    public void push (E num){
        if (index == size){
            return;
        }
        for (int i = index; i >0 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = num;
    }
    public boolean isFull (){
        return index == size;
    }

    public boolean isEmpty (){
        return index == 0;
    }
    public E pop(){
        index--;
        return (E)arr[index + 1];
    }
    public int size (){
        return index;
    }
}
