// Last updated: 7/15/2026, 2:09:24 PM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next; // Remove duplicate
            } else {
                current = current.next; // Move to next node
            }
        }

        return head;
    }
}