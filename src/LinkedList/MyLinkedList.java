package LinkedList;

public class MyLinkedList<E> {
    Node<E> head, tail;
    int numNodes = 0;
    public MyLinkedList() {}

    public void addFirst (E e){
        if ((head == null) && (tail == null)) {
            head = new Node<>(e);
            tail = head;
        }else {
            Node<E> temp = new Node<>(e);
            temp.next = head;
            head = temp;
        }
        numNodes++;
    }

    public void addLast (E e){

        if ((head == null) && (tail == null)) {
            head = new Node<>(e);
            tail = head;
        }else{
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        numNodes++;
    }

    public void add (int index, E e){
        if (index < 0 || index > numNodes){
            System.out.println("Error index out of Array");
            return;
        }else if (head == null && index != 0){
                System.out.println("Error array is empty");
                return;
        }else if (index == 0){
            addFirst(e);
        }else if (index == numNodes){
            addLast(e);
        }else {
            int i = 0;
            Node<E> current = head;
            while (i < index - 1){
                current = current.next;
                i++;
            }
            Node<E> temp = new Node<>(e);
            temp.next = current.next;
            current.next = temp;
            numNodes++;
        }
    }

    public E remove (int index){
        int i = 0;
        Node<E> current = head;
        if (head == null){
            System.out.println("Error array is empty");
            return null;
        }
        if (head == tail){
            head = null;
            tail = null;
            numNodes --;
            return (E)current.data;
        }
        if (index < 0 || index >= numNodes){
            System.out.println("Error index out of array");
            return null;
        }
        if (index == 0){
            Node<E> temp = head;
            head = head.next;
            numNodes--;
            return (E)temp.data;
        }
        if (index == numNodes - 1){
            while (i < numNodes - 2){
                current = current.next;
                i++;
            }
            tail = current;
            numNodes--;
            return (E) current.data;
        }
        while (i < index - 1){
            current = current.next;
            i++;
        }
        Node<E> temp = current.next;
        current.next = current.next.next;
        numNodes--;
        return (E) temp;
    }

    public boolean remove(Object e){
        boolean check = false;
        int i = 0;
        Node<E> current = head;
        if (head == null) return check;
        while (i< numNodes){
            if (current.data.equals(e)){
                remove(i);
                check = true;
            }
            current = current.next;
            i++;
        }
        return check;
    }

    public int size(){
        return numNodes;
    }

    public Object clone(){
        MyLinkedList<E> v = new MyLinkedList<>();
        v.head = this.head;
        v.tail = this.tail;
        v.numNodes = this.numNodes;
        return v;
    }

    public boolean contains(E o){
        int i = 0;
        Node<E> current = head;
        while (i < numNodes){
            // check for empty list
            if (head == null) {
                return false;
            }
            // Check for null
            if (current.data == o){
                return true;
            }
            if (current.data.equals(o)){
                return true;
            }
            current = current.next;
            i++;
        }
        return false;
    }

    public int indexOf (E o){
        int i = 0;
        Node<E> current = head;
        if (current == null) return -1;
        while (i < numNodes){
            if (current.data == o){
                return i;
            }else if (current.data.equals(o)){
                return i;
            }
            current = current.next;
            i++;
        }
        System.out.println("This element isn't exist");
        return -1;
    }

    public boolean add (E o){
        if (head == null && tail == null){
            head = new Node<>(o);
            tail = head;
            numNodes++;
            return true;
        }
        Node<E> temp = new Node<>(o);
        tail.next = temp;
        tail = tail.next;
        numNodes++;
        return true;
    }

    public E get(int index) {
        int i = 0;
        Node<E> current = head;
        if (current == null) return null;
        while (i < numNodes){
            current = current.next;
            i++;
        }
        return (E)current.data;
    }

    public E getFirst () {
        if ((head == null) && (tail == null)){
            return null;
        }
        return (E)head.data;
    }
    public E getLast () {
        if ((head == null) && (tail == null)){
            return null;
        }
        return (E)tail.data;
    }

    public void clear(){
        head = null;
        tail = null;
        numNodes = 0;
    }

    public void printList (){
        int i = 0;
        Node<E> current = head;
        if (current == null){
            System.out.println("This array is empty");
        }
        while (i < numNodes){
            System.out.print(current.data + " ");
            current = current.next;
            i++;
        }
        System.out.println();
    }
}
