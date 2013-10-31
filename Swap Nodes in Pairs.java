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
    public ListNode swapPairs(ListNode head) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode newHead = head.next, temp = null, after = null, prev = null;
        while (head != null && head.next != null) {
            temp = head.next;
            after = temp.next;
            if (prev != null)
                prev.next = temp;
            temp.next = head;
            head.next = after;
            prev = head;
            head = after;
        }
        
        return newHead;
    }
}