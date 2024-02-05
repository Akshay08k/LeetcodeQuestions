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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Merge two lists into a new list
        List<Integer> mergedList = new ArrayList<>();
        
        while (list1 != null) {
            mergedList.add(list1.val);
            list1 = list1.next;
        }
        
        while (list2 != null) {
            mergedList.add(list2.val);
            list2 = list2.next;
        }

        // Sort the merged list
        Integer[] mergedArray = mergedList.toArray(new Integer[0]);
        Arrays.sort(mergedArray);

        // Create a new ListNode for the sorted merged list
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for (int val : mergedArray) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }
}