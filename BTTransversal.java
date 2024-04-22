import BinaryTree.MyBinaryTree;
import BinaryTree.TreeNode;

public class BTTransversal {

    static void inorder(TreeNode root) {
        if (root == null) {
            return;
        }
        inorder(root.getLeftNode());
        System.out.println(root.getValue());
        inorder(root.getRightNode());

    }

    static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getValue());
        preorder(root.getLeftNode());
        preorder(root.getRightNode());
    }

    static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.getLeftNode());
        postorder(root.getRightNode());
        System.out.println(root.getValue());
    }

    public static void main(String[] args) {
        MyBinaryTree bt = new MyBinaryTree();
        int[] array = { 3, 5, 4, 1, 64 };
        for (int it : array) {
            bt.insert(it);
        }
        System.out.println("inorder");
        inorder(bt.root);
        System.out.println("preorder");
        preorder(bt.root);
        System.out.println("postorder");
        postorder(bt.root);
    }
}
