/**
 * Definition for singly-linked list.
 */
public class Solution {
    public static class ListNode {
        private final int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
            next = null;
        }

        public int getVal() {
            return val;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = head;

        System.out.println(new Solution().hasCycle(head));
    }
}