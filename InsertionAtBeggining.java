@SuppressWarnings("unused")
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

@SuppressWarnings("unused")
class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
        Node newNode = new Node(x);

               newNode.next = head;

               return newNode;
        
    }
}
