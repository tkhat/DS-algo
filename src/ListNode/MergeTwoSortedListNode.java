package ListNode;

public class MergeTwoSortedListNode {

    public static ListNode mergeSortedListNodeList(ListNode[] lists) {
        ListNode curr;
        if (lists.length > 1) {
            curr = merge(lists[0], lists[1]);
        } else {
            return lists[0];
        }
        for (int i = 2; i < lists.length; i++) {
            curr = merge(curr, lists[i]);
        }
        return curr;
    }

    private static ListNode merge(ListNode first, ListNode second) {
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
