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
   ListNode reverseL(ListNode head) {
        ListNode pre = null;
       ListNode nex = null;
        while(head != null){
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        return pre;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        //find the middle of LL
        while(fast.next != null &&/**
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
   ListNode reverseL(ListNode head) {
        ListNode pre = null;
       ListNode nex = null;
        while(head != null){
            nex = head.next;
            head.next = pre;
            pre = head;
            head = nex;
        }
        return pre;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        
        ListNode slow = head;
        ListNode fast = head;
        
        //find the middle of LL
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //reverse the LL
        slow.next = reverseL(slow.next);
        
        
        //place the slow on reverse
        slow = slow.next;
        
        //comparison between left and right halves
        while(slow != null){
            if(head.val != slow.val)
            return false;
            
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
} fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //reverse the LL
        slow.next = reverseL(slow.next);
        
        
        //place the slow on reverse
        slow = slow.next;
        
        //comparison between left and right halves
        while(slow != null){
            if(head.val != slow.val)
            return false;
            
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}