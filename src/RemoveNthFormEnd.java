/*LeetCode
day21 #19.
Remove Nth Node From End of List
Given a linked list, remove the nth node from the end of list and return its head.
        For example,
        Given linked list: 1->2->3->4->5, and n = 2.
        After removing the second node from the end, the linked list becomes 1->2->3->5.
        Note:
        Given n will always be valid.
        Try to do this in one pass.*/


public class RemoveNthFormEnd {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (remove(head, n) > 0) {
                return head.next;
            }

            return head;
        }

        private int remove(ListNode node, int n) {
            if (node.next == null) return 1;
            int rank;
            rank = remove(node.next, n) + 1;
            // the way to delete the nth node
            // is to set the (n-1)th node's next
            // as nth node's next
            // [tricky] return a very big negtive number
            // to indicate we are success
            if (rank == n + 1) {
                node.next = node.next.next;
                return Integer.MIN_VALUE;
            }
            return rank;
        }
    }
}
