/*LeetCode
day41 #110. Balanced Binary Tree
        Given a binary tree, determine if it is height-balanced.
        For this problem, a height-balanced binary tree is defined as:
        a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
        Example 1:
        Given the following tree [3,9,20,null,null,15,7]:
        3
        / \
        9  20
        /  \
        15   7
        Return true.*/
public class BalanceBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return height(root) != -1;

    }

    public int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int lH = height(node.left);
        if (lH == -1) {
            return -1;
        }
        int rH = height(node.right);
        if (rH == -1) {
            return -1;
        }
        if (lH - rH < -1 || lH - rH > 1) {
            return -1;
        }
        return Math.max(lH, rH) + 1;
    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
