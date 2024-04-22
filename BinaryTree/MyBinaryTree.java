package BinaryTree;

public class MyBinaryTree {

    public TreeNode root;

    public TreeNode recursiveInsert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (root.value > value) {
            root.left = recursiveInsert(root.left, value);
        } else {
            root.right = recursiveInsert(root.right, value);
        }
        return root;
    }

    public void insert(int value) {
        root = recursiveInsert(root, value);
    }

}
