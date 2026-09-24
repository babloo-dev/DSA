class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MergeSortedLists {

    static Node merge(Node head1, Node head2) {

        Node dummy = new Node(0);
        Node current = dummy;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }

            current = current.next;
        }

        if (head1 != null) {
            current.next = head1;
        } else {
            current.next = head2;
        }

        return dummy.next;
    }

    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);

        Node result = merge(head1, head2);

        System.out.println("Merged Linked List:");
        printList(result);
    }
}