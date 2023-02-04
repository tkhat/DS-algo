package mergeTwoListsNode;

import java.util.List;

public class MergeTwoListsNode {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode mergedList = new ListNode();
        ListNode current = null;
        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current = list1;
                    list1 = list1.next;
                } else {
                    current = list2;
                    list2 = list2.next;
                }
            } else if (list1 != null) {
                current = list1;
                list1 = list1.next;
            } else {
                current = list2;
                list2 = list2.next;
            }
            mergedList.next = current;
        }
        return mergedList;
    }
}
