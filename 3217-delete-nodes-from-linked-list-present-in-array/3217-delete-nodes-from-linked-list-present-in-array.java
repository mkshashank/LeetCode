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
    public ListNode modifiedList(int[] nums, ListNode head) {
        List<Integer> l1 = new LinkedList<Integer>();
        List<Integer> l2 = new LinkedList<Integer>();
        for(int x : nums)
        {
            l1.add(x);
        }
        ListNode temp = head;
        while(temp != null)
        {
            l2.add(temp.val);
            temp = temp.next;
        }
        l2.removeAll(l1);
        ListNode ans = new ListNode();
        temp = ans;
        for(int i = 0; i < l2.size(); i++)
        {
            temp.next = new ListNode(l2.get(i));
            temp = temp.next;
        }
        return ans.next;
    }
}