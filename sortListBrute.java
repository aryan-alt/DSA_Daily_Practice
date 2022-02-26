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
    public ListNode sortList(ListNode head) {
        ListNode curr = head;
        ListNode index = null;
        int temp;
        
        if(head == null){
            return head;
        }
        
        while(curr != null){
            index = curr.next;
            while(index != null){
                if(curr.val > index.val){
                    temp = curr.val;
                    curr.val = index.val;
                    index.val = temp;
                }
                index = index.next;
            }
            curr = curr.next;
        }
        
        return head;
    }
}