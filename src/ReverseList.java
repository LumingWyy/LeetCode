
/*LeetCode
day22 #206.

Reverse Linked List
        Reverse a singly linked list.*/


//  Definition for singly-linked list.
class ReverseList {


public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode root = new ListNode(0);
        ListNode nextNode;
        while (head != null) {
            nextNode = head.next;
            head.next = root.next;
            root.next = head;
            head = nextNode;
        }
        return root.next;
    }
}
}
