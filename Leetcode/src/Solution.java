/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode current = head ;
    	while(true) {
    		ListNode temp = current ;
    		for(int i = 0 ; i < n ; i ++) {
    			temp = temp.next ;
    		}
    		if(temp.next == null) {
    			current.next = current.next.next ;
    			break ;
    		}
    		else {
    			current = current.next ;
    		}
    	}
    	return head ;
    }
}