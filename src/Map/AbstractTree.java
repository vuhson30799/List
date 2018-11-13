package Map;


interface AbstractTree<E> {
    boolean search (E e);
    boolean insert (E e);
    boolean delete (E e);
    void inorder (TreeNode<E> node);
    void preorder (TreeNode<E> node);
    void postorder (TreeNode<E> node);
    int getSize ();
    boolean isEmpty();
    void clear ();
}
