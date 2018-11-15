package Map;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class BST<E extends Comparable<E>> implements AbstractTree<E> {
    TreeNode<E> root;
    int size;
    public BST () {
        this.size = 0;

    };
    public BST (E[] objects){
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    };
    @Override
    public boolean search(E e) {
        if (root == null) {
            System.out.println("this tree is empty");
            return false;
        }else {
            TreeNode<E> current = root;
            while (current != null){
                if (e.compareTo(current.element) < 0){
                    current = current.left;
                }else if (e.compareTo(current.element) > 0) {
                    current = current.right;
                }else {
                    return true;
                }
            }
        }
        System.out.println("This element isn't exist in tree");
        return false;
    }

    @Override
    public boolean insert(E e) {
        if (size == 0) {
            this.root = new TreeNode<>(e);
        }else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null){
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                }else {
                    System.out.println("Error!! Insert the exist element");
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = new TreeNode<>(e);
            }else if (e.compareTo(parent.element) > 0) {
                parent.right = new TreeNode<>(e);
            }else {
                System.out.println("Error!! Insert the exist element");
                return false;
            }
        }
        size++;
        return true;
    }

    @Override
    public boolean delete(E e) {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null && current.element.compareTo(e) != 0){
                if (e.compareTo(current.element) < 0){
                    parent = current;
                    current = current.left;
                }else {
                    parent = current;
                    current = current.right;
                }
            }
            if (current == null) {
                return false;
            }
            if (current.left == null){
                if (parent.left == current.element) {
                    parent.left = current.right;
                }else {
                    parent.right = current.right;
                }
            }else {
                //find the max value in left tree
                TreeNode<E> rightMost = current.left;
                TreeNode<E> parentRightMost = current;
                while (rightMost.right != null){
                    parentRightMost = rightMost;
                    rightMost = rightMost.right;
                }
                // assign the rightMost value to current and delete the rightMost out of tree
                current.element = rightMost.element;
                if (rightMost.left != null){
                    parentRightMost.right = rightMost.left;
                }else if (parentRightMost != current){
                    parentRightMost.right = null;
                }else {
                    parentRightMost.left = null;
                }
            }
        size--;
        return true;
    }

    @Override
    public void inorder(TreeNode<E> current) {
        if (current == null) {
            System.out.println("This tree is empty");
            return;
        }
        TreeNode<E> temp;
        if (current.left != null) {
            temp = current.left;
            inorder(temp);
        }

        System.out.println(current.element);

        if (current.right != null) {
            temp = current.right;
            inorder(temp);
        }
    }

    @Override
    public void preorder(TreeNode<E> current) {
        if (current == null) {
            System.out.println("This tree is empty");
            return;
        }
        TreeNode<E> temp = current;
        System.out.println(temp.element);

        if (current.left != null) {
            temp = current.left;
            inorder(temp);
        }

        if (current.right != null) {
            temp = current.right;
            inorder(temp);
        }
    }

    @Override
    public void postorder(TreeNode<E> current) {
        if (current == null) {
            System.out.println("This tree is empty");
            return;
        }
        TreeNode<E> temp = current;
        if (current.left != null) {
            temp = current.left;
            inorder(temp);
        }

        if (current.right != null) {
            temp = current.right;
            inorder(temp);
        }

        System.out.println(current.element);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    public void breadthFirstOrder () {
        LinkedList<TreeNode<E>> arr = new LinkedList<>();
        arr.add(root);
        int i = 0;
        while (arr.size() != size){
            if (arr.get(i).left != null){
                arr.add(arr.get(i).left);
            }
            if (arr.get(i).right != null){
                arr.add(arr.get(i).right);
            }
            i++;
        }
        for (TreeNode<E> x :
                arr) {
            System.out.print(x.element + " ");
        }
    }
}
