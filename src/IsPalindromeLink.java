/*LeetCode
day24  #234.
Palindrome Linked List
        Given a singly linked list, determine if it is a palindrome.
        Follow up:
        Could you do it in O(n) time and O(1) space?*/

public class IsPalindromeLink {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) return true;
            ListNode fast = head;
            ListNode slow = head;
            // 寻找中点
            while (fast.next != null && fast.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            // 记录第二段链表的第一个节点
            ListNode secondHead = slow.next;
            ListNode p1 = secondHead;
            ListNode p2 = p1.next;
            // 将第一段链表的尾巴置空
            slow.next = null;
            while (p1 != null && p2 != null) {
                ListNode tmp = p2.next;
                p2.next = p1;
                p1 = p2;
                p2 = tmp;
            }
            // 将第二段链表的尾巴置空
            secondHead.next = null;
            // 依次判断
            while (p1 != null) {
                if (head.val != p1.val) return false;
                head = head.next;
                p1 = p1.next;
            }
            return true;
        }
    }
}
