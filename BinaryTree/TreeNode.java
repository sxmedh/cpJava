package BinaryTree;

public class TreeNode {

    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return this.value;
    }

    public TreeNode getLeftNode() {
        return this.left;
    }

    public TreeNode getRightNode() {
        return this.right;
    }

}
