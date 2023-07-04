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
    public int getDecimalValue(ListNode head) {
        ListNode prev = null;  
        ListNode current = head;

        while(current != null) { 
            ListNode next = current.next; 
            current.next = prev;
            prev = current;
            current = next;
        }
        
        int exponent = 0;
        int ans = 0;
        
        while (prev.next != null) {
            System.out.println(prev.val);
            ans += Math.pow(2, exponent) * prev.val;
            exponent++;
            prev = prev.next;
        }
        
        ans += Math.pow(2, exponent) * prev.val;
        
        return ans;
    }
}