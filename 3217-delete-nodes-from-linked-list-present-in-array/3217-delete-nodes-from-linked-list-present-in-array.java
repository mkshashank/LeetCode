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
        Set<Integer> hs = new HashSet<Integer>();
        for(int x : nums)
        {
            hs.add(x);
        }
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        ListNode temp = head;
        while(temp != null)
        {
            if(!hs.contains(temp.val))
            {
                cur.next = new ListNode(temp.val);
                cur = cur.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}