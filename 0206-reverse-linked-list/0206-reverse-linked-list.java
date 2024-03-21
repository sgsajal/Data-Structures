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
    public ListNode reverseList(ListNode head) {
        ListNode data=head;
        ListNode curr=null;
        ListNode prev=null;
        while(data!=null){
            curr=data;
            data=data.next;
            curr.next=prev;
            prev=curr;
        }
        head=curr;
        return head;
    }
}