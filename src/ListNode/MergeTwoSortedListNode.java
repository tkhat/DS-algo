package ListNode;

public class MergeTwoSortedListNode {

    public static ListNode mergeSortedListNodeList(ListNode[] lists) {
        int length = lists.length;
        int i = 0;
        while (i < length) {
            int l;
            int r;
            if (i == 0) {
                l = 0;
                r = 1;
            } else {
                l = i * 2;
                r = l + 1;
            }
            if (l < length && r < length) {
                lists[i] = merge(lists[l], lists[r]);
            } else if (l < length) {
                if (i > 0){
                    lists[i-1] = merge(lists[i-1],lists[l]);
                } else {
                    lists[i] = lists[l];
                }
                length = length / 2;
                i = -1;
            } else {
                length = length / 2;
                i = -1;
            }
            i++;
        }
        if (lists.length > 0) {
            return lists[0];
        } else {
            return null;
        }
    }

     static ListNode merge(ListNode first, ListNode second) {
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
