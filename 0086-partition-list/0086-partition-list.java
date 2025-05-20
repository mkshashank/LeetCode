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
    public ListNode partition(ListNode head, int x) 
    {
        ListNode dummy1 = new ListNode();
        ListNode cur1 = dummy1;
        ListNode dummy2 = new ListNode();
        ListNode cur2 = dummy2;
        ListNode cur = head;
        while(cur != null)
        {
            if(cur.val < x)
            {
                cur1.next = new ListNode(cur.val);
                cur1 = cur1.next;
            }
            else
            {
                cur2.next = new ListNode(cur.val);
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        cur1.next = dummy2.next;
        head = dummy1.next;
        return head;
    }
}