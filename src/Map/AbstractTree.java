package Map;


interface AbstractTree<E> {
    boolean search (E e);
    boolean insert (E e);
    boolean delete (E e);
    void inorder ();
    void preorder ();
    void postorder ();
    int getSize ();
    boolean isEmpty();
    void clear ();
}
