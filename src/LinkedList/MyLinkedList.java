package LinkedList;

public class MyLinkedList<E> {
    Node<E> head, tail;
    int numNodes = 0;
    public MyLinkedList() {}

    public void addFirst (E e){
        if ((head == null) && (tail == null)) {
            head.data = e;
            tail = head;
        }else {
            Node<E> temp = new Node<>(e);
            temp.next = head;
            head = temp;
        }
        numNodes++;
    }

    public void addLast (E e){
        Node<E> temp = new Node<>(e);
        if ((head == null) && (tail == null)) {
            head.data = e;
            tail = head;
        }else{
            tail.next = temp;
            tail = tail.next;
        }
        numNodes++;
    }

    public void add (int index, E e){
        if (index < 0 || index > numNodes){
            System.out.println("Error");
            return;
        }else if (head == null && index != 0){
                System.out.println("Error");
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
        }
        numNodes++;
    }

    public E remove (int index){
        int i = 0;
        Node<E> current = head;
        if (index < 0 || index > numNodes){
            System.out.println("Error!!");
            return null;
        }
        if (index == 0){
            Node<E> temp = head;
            head = head.next;
            numNodes--;
            return (E)temp.data;
        }
        if (index == numNodes){
            while (i < numNodes - 1){
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
            // Check for null
            if (current == o){
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
        while (i < numNodes){
            if (current.data == o){
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
        while (i < numNodes){
            current = current.next;
            i++;
        }
        return (E)current.data;
    }

    public E getFirst () {
        return (E)head.data;
    }
    public E getLast () {
        return (E)tail.data;
    }

    public void clear(){
        head = null;
        tail = null;
    }

    public void printList (){
        int i = 0;
        Node<E> current = head;
        while (i < numNodes){
            System.out.print(current.data + " ");
            current = current.next;
            i++;
        }
        System.out.println();
    }
}
