package ListNode;

public class MergeTwoSortedListNode {

    public static ListNode merge(ListNode first, ListNode second) {
        ListNode head = new ListNode();
        ListNode curr = new ListNode();
        head.next = curr;

        while (first != null && second != null) {
            if (first.val <= second.val) {
                curr.next = first;
                first = first.next;
            } else {
                curr.next = second;
                second = second.next;
            }
            curr = curr.next;

        }
        while (first != null) {
            curr.next = first;
            first = first.next;
            curr = curr.next;
        }
        while (second != null) {
            curr.next = second;
            second = second.next;
            curr = curr.next;
        }
        head = head.next.next;
        return head;
    }
}
