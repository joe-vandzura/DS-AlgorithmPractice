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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        ListNode list = new ListNode();
        ListNode listTemp = list;
        int lastValue = 0;
        int length = 0;
        
        while (temp.next != null) {
            lastValue = temp.next.val;
            temp = temp.next;
            length++;
        }
        
        list.val = lastValue;

        int currMax = length-1;
        
        for (int i = 0; i < length; i++) {
            temp = head;
            listTemp.next = new ListNode();
            listTemp = listTemp.next;
            
            for (int j = 0; j < currMax; j++) {
                temp = temp.next;
            }
            currMax--;
            
            // while (temp.next.val != lastValue) {
            //     temp = temp.next;
            // }
            
            lastValue = temp.val;
            listTemp.val = lastValue;
        }
        
        return list;
    }
}