public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;
    int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    // UC1: method to add node to BST
    public void insert(T data) {
        root = this.insertHelper(this.root, data);
        this.size++;
    }

    // helper function for insert method
    private Node<T> insertHelper(Node<T> root, T data) {
        if (root == null) {
            root = new Node<>(data);
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = this.insertHelper(root.left, data);
        } else {
            root.right = this.insertHelper(root.right, data);
        }

        return root;
    }

    // inorder traversal to print the nodes
    public void inorder() {
        this.inorderHelper(this.root);
    }

    // helper function for inorder traversal
    private void inorderHelper(Node<T> root) {
        if (root == null) {
            return;
        }

        inorderHelper(root.left);
        System.out.print(root.data + " ");
        inorderHelper(root.right);
    }

    // function to get tree size
    public int size(){
        return this.size;
    }
}
