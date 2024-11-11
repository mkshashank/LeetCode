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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null && n == 1) return null;
        ListNode temp = head;
        List<ListNode> al = new ArrayList<ListNode>();
        while(temp != null)
        {
            al.add(temp);
            temp = temp.next;
        }
        if(al.size() == n)
        {
            return head.next;
        }
        ListNode removedElePrev = al.get(al.size() - n - 1);
        removedElePrev.next = removedElePrev.next.next;
        return head;
    }
}