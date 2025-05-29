/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution 
{
    public void deleteNode(ListNode node) 
    {
        ListNode temp = node.next;
        ListNode prev = node;
        while(temp != null)
        {
            node.val = temp.val;
            temp = temp.next;
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }
}