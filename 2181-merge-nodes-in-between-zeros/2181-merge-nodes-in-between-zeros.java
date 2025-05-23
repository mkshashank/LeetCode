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
    public ListNode mergeNodes(ListNode head) 
    {
        if(head == null || head.next == null) return head;
        ListNode cur = head;
        ListNode dummyNode = new ListNode(0);
        ListNode ans = dummyNode;
        int sum = 0;
        while(cur != null)
        {
            if(cur.val == 0)
            {
                if(sum == 0)
                    cur = cur.next;
                else
                {
                    ans.next = new ListNode(sum);
                    ans = ans.next;
                    sum = 0;
                    cur = cur.next;
                }
            }
            else
            {
                sum += cur.val;
                cur = cur.next;
            }
        }
        return dummyNode.next;
    }
}