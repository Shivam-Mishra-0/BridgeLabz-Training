package Day3.DoublyLinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int value) {
        this.data = value;
        this.next = null;
        this.prev = null;
    }
}
public class TraverseAndSize {
    Node head;
    Node tail;

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void traverseForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        System.out.print("Forward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public void traverseBackward() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = tail;
        System.out.print("Backward: ");
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.prev;
        }
        System.out.println("null");
    }
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        TraverseAndSize list = new TraverseAndSize();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.traverseForward();
        list.traverseBackward();
        System.out.println("Size: " + list.size());
    }

}
