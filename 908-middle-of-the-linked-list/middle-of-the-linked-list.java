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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int i = 0;
        while(temp != null){
            temp=temp.next;
            i++;
        }
        int div = i/2;
        ListNode res = head;
        for(int j=1;j<=div;j++){
            res = res.next;
        }
        return res;
    }
}