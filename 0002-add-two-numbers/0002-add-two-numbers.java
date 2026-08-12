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
        int sum=0,carry=0;
        ListNode newHead=null,tail=null;
        while(l1!=null && l2!=null){
            sum=l1.val+l2.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode newNode = new ListNode(sum);
            if(newHead==null) newHead=tail=newNode;
            else tail=tail.next=newNode;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            sum=l1.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode newNode = new ListNode(sum);
            tail=tail.next=newNode;
            l1=l1.next;
        }
        while(l2!=null){
            sum=l2.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode newNode = new ListNode(sum);
            tail=tail.next=newNode;
            l2=l2.next;
        }
        if(carry==1){
            ListNode newNode = new ListNode(carry);
            tail=tail.next=newNode;
        }
        return newHead;
    }
}