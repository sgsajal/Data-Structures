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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list1;
        for(int i=0;i<b+1;i++){
            temp2=temp2.next;
        }
        for(int i=0;i<a-1;i++){
            temp1=temp1.next;
        }
        temp1.next=list2;
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=temp2;
        System.gc();
        return list1;
    }
}