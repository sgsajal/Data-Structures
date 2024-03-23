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

    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if(head==null||head.next==null||head.next.next==null) return;
        ListNode ans=new ListNode(-1);
        ListNode temp=new ListNode(-1);
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode secondList=reverse(slow);
        ListNode firstList=head;
        while(firstList!=null||secondList!=null){
            if(firstList!=null){
                temp.next=firstList;
                firstList=firstList.next;
                temp=temp.next;
            }
            if(secondList!=null){
                temp.next=secondList;
                secondList=secondList.next;
                temp=temp.next;
            }
        }
        head=ans.next;

    }
}