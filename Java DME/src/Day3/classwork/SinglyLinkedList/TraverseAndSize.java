package Day3.SinglyLinkedList;

class Node {
    int data;
    Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }
}
public class TraverseAndSize {
    Node head;

    public void insertAtFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
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

        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);

        System.out.println("Traversal:");
        list.traverse();
        System.out.println("Size of list: " + list.size());

    }
}
