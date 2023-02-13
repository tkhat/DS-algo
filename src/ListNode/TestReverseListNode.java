package ListNode;

public class TestReverseListNode {
    public static void main(String[] args) {

        ListNode first =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode second =
                new ListNode(2, new ListNode(2, new ListNode(2, new ListNode(3, new ListNode(6)))));

        ListNode merged = MergeTwoSortedListNode.merge(first,second);

        while (merged != null){
            System.out.println(merged.val);
            merged = merged.next;
        }
    }


}
