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
        ListNode next=null;
        ListNode curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
    public boolean match(ListNode head1,ListNode head2){
        while(head1!=null&&head2!=null){
            // System.out.println(head1.val+" "+head2.val);
            if(head1.val!=head2.val) return false;
            head1=head1.next;
            head2=head2.next;
        }
        return true;
    }
    
    public void display(ListNode head){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null) prev.next=null;
        // display(slow);
        slow=reverse(slow);
        // display(slow);
        return match(head,slow);
        
    }
}