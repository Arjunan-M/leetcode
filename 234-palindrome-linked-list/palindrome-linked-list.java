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
    public boolean isPalindrome(ListNode head) {
        ListNode p1=head,p2=head;
        while(p2!=null && p2.next!=null)
        {
            p1=p1.next;
            p2=p2.next.next;
        }
        ListNode cur=p1;
        ListNode prev=null;
        while(cur!=null)
        {
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        ListNode mid=prev;
        ListNode y=head;
        while(mid!=null)
        {
            if(y.val==mid.val)
            {
                y=y.next;
                mid=mid.next;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}