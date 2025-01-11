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
    public ListNode swapPairs(ListNode head) {
        ListNode d=new ListNode(0,head);
        ListNode prev=d,cur=head;

        while(cur!=null && cur.next!=null)
        {
            ListNode npn=cur.next.next;
            ListNode second=cur.next;

            second.next=cur;
            cur.next=npn;
            prev.next=second;

            prev=cur;
            cur=npn;
        }
return d.next;
    }
}