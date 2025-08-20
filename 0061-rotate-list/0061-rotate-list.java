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
    public void reverse(int[] arr, int i, int j)
    {
        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null || head.next == null || k == 0) return head;
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();

        while(temp != null)
        {
            list.add(temp.val);
            temp = temp.next;
        }

        int[] arr = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        k = k % arr.length;
        
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        k = 0;
        temp = head;
        while(temp != null)
        {
            temp.val = arr[k++];
            temp = temp.next;
        }
        return head;
    }
}