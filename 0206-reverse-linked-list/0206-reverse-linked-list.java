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
class Solution 
{
    public ListNode reverseList(ListNode head) 
    {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        ListNode prev = null;
        ListNode cur = temp.next;
        while(cur != null)
        {
            cur = temp.next;
            temp.next = prev;
            prev = temp;
            temp = cur;
        }
        return prev;
    }
}