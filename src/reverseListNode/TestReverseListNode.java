package reverseListNode;

import java.util.HashSet;

public class TestReverseListNode {
    public static void main(String[] args) {

        ListNode head =
                new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

        HashSet<Character> ss = new HashSet();
        String str  = "sada";

        for (int i = 0; i < str.length(); i++){
            ss.add(str.charAt(0));
        }
    }


}
