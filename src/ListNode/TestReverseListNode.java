package ListNode;

import static ListNode.MergeTwoSortedListNode.merge;
import static ListNode.MergeTwoSortedListNode.mergeSortedListNodeList;

public class TestReverseListNode {
    public static void main(String[] args) {

        ListNode[] nodes = new ListNode[]{
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),

                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),


                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),


                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),


                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))),
        };

        ListNode merged = mergeSortedListNodeList(nodes);
        while (merged != null) {
            System.out.println(merged.val);
            merged = merged.next;
        }
    }


}
