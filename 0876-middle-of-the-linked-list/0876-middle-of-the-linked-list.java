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
    public ListNode middleNode(ListNode head) {
        ListNode check = head;
        int length = 0;
        
        while (check != null) {
            length++;
            check = check.next;
        }

        int middle = (int) Math.round(length / 2);
        
        ListNode ans = null;
        
        for (int i = 0; i < middle; i++) {
            ans = head;
            head = head.next;
        }
        
        return head;
    }
}