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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        int carry = 0;
        ListNode addedNode = new ListNode(0);
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head = addedNode;
        while(temp1!=null && temp2!=null){
            sum = temp1.val+temp2.val+carry;
            addedNode.next = new ListNode(sum%10);
            carry = sum/10;
            temp1 = temp1.next;
            temp2 = temp2.next;
            addedNode = addedNode.next;
        }
        while (temp1 != null) {
    sum = temp1.val + carry;
    addedNode.next = new ListNode(sum % 10);
    carry = sum / 10;
    temp1 = temp1.next;
    addedNode = addedNode.next;
}
        while (temp2!=null){
            sum = temp2.val+carry;
            addedNode.next = new ListNode(sum%10);
            carry =sum/10;
            temp2 = temp2.next;
            addedNode = addedNode.next;
        }
        if (carry>0){
            addedNode.next = new ListNode(carry);
        }

    
        return head.next;
        
    }
}