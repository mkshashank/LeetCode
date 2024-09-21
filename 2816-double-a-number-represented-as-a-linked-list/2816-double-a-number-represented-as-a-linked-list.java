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
 import java.math.BigInteger;
class Solution {
    public ListNode doubleIt(ListNode head) {
        if(head == null) return head;
        
        StringBuilder sb = new StringBuilder();
        ListNode temp = head;
        while (temp != null)
        {
            sb.append(temp.val);
            temp = temp.next;
        }

        BigInteger number = new BigInteger(sb.toString());
        BigInteger doubled = number.multiply(BigInteger.valueOf(2));
        String result = doubled.toString();

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(char c : result.toCharArray())
        {
            current.next = new ListNode(c - '0');
            current = current.next;
        }
        
        return dummy.next;
    }
}