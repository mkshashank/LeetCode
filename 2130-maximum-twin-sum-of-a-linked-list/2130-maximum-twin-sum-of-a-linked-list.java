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
    public ListNode reverse(ListNode head)
    {
        ListNode temp = head, cur = head, prev = null;
        while(cur != null)
        {
            temp = temp.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public int pairSum(ListNode head) 
    {
        ListNode temp = head;
        int count = 0;
        while(temp != null)
        {
            count++;
            temp = temp.next;
        }
        temp = head;
        ListNode prev = temp;
        for(int i = 0; i < count/2; i++)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        ListNode firstHead = head;
        ListNode secondHead = reverse(temp);
        int maxi = Integer.MIN_VALUE;
        while(firstHead != null)
        {
            maxi = Math.max(maxi,firstHead.val + secondHead.val);
            firstHead = firstHead.next;
            secondHead = secondHead.next;
        }

        return maxi;
    }
}