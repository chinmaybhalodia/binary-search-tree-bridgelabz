public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Binary Search Tree Program.");

        // UC1: creating binary tree and adding nodes
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(56);
        bst.insert(30);
        bst.insert(70);

        System.out.print("\nInorder Traversal: ");
        bst.inorder();
    }
}
