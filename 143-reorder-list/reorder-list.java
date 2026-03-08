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
    public void reorderList(ListNode head) {
        if(head==null)
            return;
        ListNode p1=head;
        ListNode p2=head;
        while(p2!=null && p2.next!=null)
        {
            p1=p1.next;
            p2=p2.next.next;
        }
        ListNode n=reverse(p1.next);
        p1.next=null;
        ListNode cur=head;
        ListNode mid=n;
        while(cur!=null && mid!=null)
        {
            ListNode t=cur.next;
            cur.next=mid;
            ListNode t1=mid.next;
            mid.next=t;
            cur=t;
            mid=t1;
        }
    }
    public ListNode reverse(ListNode c)
    {
        ListNode cur=c;
        ListNode next=null;
        ListNode prev=null;
        while(cur!=null)
        {
        next=cur.next;
        cur.next=prev;
        prev=cur;
        cur=next;
        }
        return prev;
    }
}