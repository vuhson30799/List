package Map;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
      /*  BST<String> tree = new BST<>();
        tree.insert("George");
        tree.insert("Michael");
        tree.insert("Tom");
        tree.insert("Adam");
        tree.insert("Jones");
        tree.insert("Peter");
        tree.insert("Daniel");
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder(tree.root);
        System.out.println("PreOrder (sorted): ");
        tree.preorder(tree.root);
        System.out.println("PostOrder (sorted): ");
        tree.postorder(tree.root);
        System.out.println("The number of nodes is: " + tree.getSize());

        System.out.println("Is George and Son exist in tree?" + tree.search("George") + tree.search("Son"));

        System.out.println("Delete Micheal: " + tree.delete("Michael"));
        System.out.println("Delete Son: " + tree.delete("Son"));
        System.out.println("Inorder (sorted): ");
        tree.inorder(tree.root);*/
        BST<Integer> tree1 = new BST<>();
        tree1. insert(8);
        tree1. insert(5);
        tree1. insert(9);
        tree1. insert(1);
        tree1. insert(7);
        tree1.breadthFirstOrder();
    }
}
