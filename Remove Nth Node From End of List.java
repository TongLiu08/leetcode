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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        if (head == null)
            return null;
        ListNode curr = head, post = head;
        while (n > 1) {
            post = post.next;
            if (post == null)
                return null;
            n--;
        }
        if (post.next == null)
            return head.next;
        post = post.next;
        while (post.next != null) {
            post = post.next;
            curr = curr.next;
        }
        curr.next = curr.next.next;
        
        return head;
    }
}