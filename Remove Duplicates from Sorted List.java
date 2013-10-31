/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head == null)
            return null;
        
        ListNode curr = head, temp;
        while (curr != null) {
            temp = curr;
            while (temp.next != null) {
                if (temp.next.val == curr.val) {
                    temp.next = temp.next.next;
                } else {
                    temp = temp.next;
                }
            }
            
            curr = curr.next;
        }
        
        return head;
    }
}