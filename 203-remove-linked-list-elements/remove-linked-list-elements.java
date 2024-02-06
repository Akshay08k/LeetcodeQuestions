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
    public ListNode removeElements(ListNode head, int val) {
        // Handle the case where the list is empty
        if (head == null) {
            return null;
        }

        // Create a dummy node to simplify the removal process
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode current = dummy;

        // Traverse the linked list
        while (current.next != null) {
            if (current.next.val == val) {
                // Remove the node with the given value
                current.next = current.next.next;
            } else {
                // Move to the next node
                current = current.next;
            }
        }

        return dummy.next; // Return the modified linked list
    }
}
