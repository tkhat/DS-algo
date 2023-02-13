package ListNode;

public class ReverseListNode {


    static ListNode rev() {
        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reverseHead = reverseListNode(head);
        while (reverseHead != null) {
            System.out.println(reverseHead.val);
            reverseHead = reverseHead.next;
        }
        return head;
    }

    static ListNode reverseListNode(ListNode node) {
        return reverse(node, null, null);
    }

    static ListNode reverse(ListNode curr, ListNode prev, ListNode next) {
        if (curr == null) {
            return prev;
        } else {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            return reverse(curr, prev, next);
        }
    }
}
