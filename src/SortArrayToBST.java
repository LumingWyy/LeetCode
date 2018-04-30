/*day40 108. Convert Sorted Array to Binary Search Tree
        Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
        For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
        Example:
        Given the sorted array: [-10,-3,0,5,9],
        One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
        0
        / \
        -3   9
        /   /
        -10  5*/


public class SortArrayToBST {

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Solution {
        public TreeNode sortedArrayToBST(int[] num) {
            if (num.length == 0) {
                return null;
            }
            TreeNode head = helper(num, 0, num.length - 1);
            return head;
        }

        public TreeNode helper(int[] num, int low, int high) {
            if (low > high) { // Done
                return null;
            }
            int mid = (low + high) / 2;
            TreeNode node = new TreeNode(num[mid]);
            node.left = helper(num, low, mid - 1);
            node.right = helper(num, mid + 1, high);
            return node;
        }
    }
}
