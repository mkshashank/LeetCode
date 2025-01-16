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
    public int gcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head;
        while(temp.next != null)
        {
            int a = temp.val, b = temp.next.val;
            ListNode mid = new ListNode(gcd(a,b));
            mid.next = temp.next;
            temp.next = mid;
            temp = temp.next.next;
        }
        return head;
    }
}