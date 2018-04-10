/*LeetCode
day23 #21. Merge Two Sorted Lists
        Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
        Example:
        Input: 1->2->4, 1->3->4
        Output: 1->1->2->3->4->4
*/


public class MergeTwoLists {

    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode p = dummyHead;
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    p.next = l1;
                    l1 = l1.next;
                } else {
                    p.next = l2;
                    l2 = l2.next;
                }
                p = p.next;
            }
            p.next = l1 != null ? l1 : l2;
            return dummyHead.next;
        }
    }
}
