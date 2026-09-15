/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }

        ListNode t1 = head;
        ListNode t2 = head;

        while (t2 != null && t2.next != null) {
            t1 = t1.next;
            t2 = t2.next.next;
        }

        ListNode t3 = null;
        ListNode t4 = t1.next;
        t1.next = null;

        while (t4 != null) {
            ListNode nxt = t4.next;
            t4.next = t3;
            t3 = t4;
            t4 = nxt;
        }

        ListNode first = head;
        ListNode second = t3;

        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
