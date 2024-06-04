class Solution {
    
    public ListNode reverse(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        ListNode next=head;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        return prev;
    }
    
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        
        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;
            
            // Swapping the pairs
            first.next = second.next;
            second.next = first;
            prev.next = second;
            
            // Move to the next pair
            prev = first;
        }
        
        return dummy.next;
    }
}