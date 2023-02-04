package myLinkedList;

public class MyLinkedList {
    private ListNode head;
    private ListNode tail;
    int length = 0;

    public MyLinkedList() {
        head = new ListNode();
        tail = head;
    }

    private class ListNode {
        private int value;
        private ListNode next;

        public ListNode() {

        }

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public int get(int index) {
        if (index <= length) {
            if (index == 0) {
                return head.value;
            } else {
                ListNode curr = head;
                for (int i = 0; i <= index; i++) {
                    if (i == index) {
                        return curr.value;
                    }
                    curr = curr.next;
                }
            }
        }
        return -1;
    }

    public void addAtHead(int val) {
        if (length == 0) {
            this.head.value = val;
        } else if (length == 1) {
            ListNode holder = head;
            this.head = new ListNode(val, holder);
            this.tail = holder;
        } else {
            ListNode holder = head;
            this.head = new ListNode(val, holder);
        }
        length++;
    }

    public void addAtTail(int val) {
        if (!tail.equals(head)) {
            tail.next = new ListNode(val);
            tail = tail.next;
        } else {
            head = new ListNode(val);
            tail = head;
        }
        length++;
    }

    public void addAtIndex(int index, int val) {
        if (index == length) {
            addAtTail(val);
        } else if (index == 0) {
            addAtHead(val);
        } else if (index < length) {
            ListNode cur = head;
            for (int i = 0; i < index; i++) {
                if (index - i == 1) {
                    ListNode holder = cur.next;
                    cur.next = new ListNode(val, holder);
                    length++;
                    return;
                }
                cur = cur.next;
            }
        }
    }

    public void deleteAtIndex(int index) {
        if (index == 0) {
            length--;
            head = head.next;
            return;
        }
        if (index < length) {
            ListNode curr = head;
            for (int i = 0; i < index; i++) {
                if (i == index - 1) {
                    length--;
                    curr.next = curr.next.next;
                    return;
                }
                curr = curr.next;
            }
        }
    }
}