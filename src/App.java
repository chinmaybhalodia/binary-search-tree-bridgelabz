public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Binary Search Tree Program.");

        // UC1: creating binary tree and adding nodes
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.insert(22);
        bst.insert(40);
        bst.insert(60);
        bst.insert(95);
        bst.insert(11);
        bst.insert(65);
        bst.insert(3);
        bst.insert(16);
        bst.insert(63);
        bst.insert(67);

        System.out.print("\nInorder Traversal: ");
        bst.inorder();

        // UC2: Displaying size of bst
        System.out.print("\nSize of BST is: " + bst.size() + "\n");

        // Uc3: Searching node 63 in bst
        bst.search(63);
    }
}
