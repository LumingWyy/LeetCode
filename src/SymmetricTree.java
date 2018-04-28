/*dLeetCode
day37 #101. Symmetric Tree
        DescriptionHintsSubmissionsDiscussSolution
        Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
        For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
        1
        / \
        2   2
        / \ / \
        3  4 4  3
        But the following [1,2,2,null,3,null,3] is not:
        1
        / \
        2   2
        \   \
        3    3
        Note:
        Bonus points if you could solve it both recursively and iteratively.*/
public class SymmetricTree {

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            if (null == root)
                return true;

            return isSym(root.left, root.right);
        }

        private boolean isSym(TreeNode node1, TreeNode node2) {

            if (null == node1 && null == node2)
                return true;
            if (null == node1 && null != node2)
                return false;
            if (null != node1 && null == node2)
                return false;

            if (node1.val != node2.val)
                return false;

            return isSym(node1.left, node2.right) && isSym(node1.right, node2.left);

        }
    }
}
