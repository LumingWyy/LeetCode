/*LeetCode
day25 #141.
        Linked List Cycle
        Given a linked list, determine if it has a cycle in it.
        Follow up:
        Can you solve it without using extra space?*/


public class HasCycle {
    //Definition for singly-linked list.
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    class Solution {
        public boolean hasCycle(ListNode head) {
            if (head == null || head.next == null)
                return false;
            ListNode bicycle = head;
            ListNode car = head.next;
            while (bicycle != car) {
                if (car == null || car.next == null)
                    return false;
                bicycle = bicycle.next;
                car = car.next.next;
            }
            return true;
        }
    }
}
