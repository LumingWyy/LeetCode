/*LeetCode
day34 #83. Remove Duplicates from Sorted List
        Given a sorted linked list, delete all duplicates such that each element appear only once.
        Example :
        Input: 1->1->2
        Output: 1->2*/

public class DeleteDuplicates {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode list = head;

            while (list != null) {
                if (list.next == null) {
                    break;
                }
                if (list.val == list.next.val) {
                    list.next = list.next.next;
                } else {
                    list = list.next;
                }
            }
            return head;
        }
    }
}
