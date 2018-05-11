/*LeetCode
day42 #111. Minimum Depth of Binary Tree
        Given a binary tree, find its minimum depth.
        The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
        Note: A leaf is a node with no children.
        Example:
        Given binary tree [3,9,20,null,null,15,7],
        3
        / \
        9  20
        /  \
        15   7
        return its minimum depth = 2.*/

public class MinDepth {
    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public int minDepth(TreeNode root) {
            if (root == null)
                return 0;
            int depth = 1;
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            TreeNode temp, magic = new TreeNode(0);
            queue.add(root);
            queue.add(magic);
            while (!queue.isEmpty()) {
                temp = queue.poll();
                if (temp.equals(magic)) {
                    if (!queue.isEmpty()) {
                        depth++;
                        queue.add(magic);
                    }
                    continue;
                }
                if (temp.left == null && temp.right == null)
                    return depth;
                if (temp.left != null)
                    queue.add(temp.left);
                if (temp.right != null)
                    queue.add(temp.right);
            }
            return depth;
        }
    }
}
