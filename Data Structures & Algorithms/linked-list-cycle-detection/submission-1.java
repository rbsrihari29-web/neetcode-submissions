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
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ListNode t=head;
        while(t!=null && t.next!=null){
            temp=temp.next;
            t=t.next.next;
            if(t==temp){
                return true;
            }
        }
        return false;
    }
}
