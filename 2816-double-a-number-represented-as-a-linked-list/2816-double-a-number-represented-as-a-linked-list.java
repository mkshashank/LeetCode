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
    public ListNode doubleIt(ListNode head) {
        if(head == null) return head;
        if(head.next == null && head.val < 5)
        {
            head.val = 2*head.val;
            return head;
        }
        ListNode temp = head, cur = null, prev = null;
        int val = 0, lastDigit = 0;
        while(temp != null)
        {
            val = val * 10 + temp.val;
            temp = temp.next;
        }
        val = 2*val;
        temp = new ListNode();
        while(val > 0)
        {
            lastDigit = val % 10;
            val /= 10;
            temp.val = lastDigit;
            temp.next = prev;
            prev = temp;
            temp = new ListNode();
        }
        return prev;
    }
}