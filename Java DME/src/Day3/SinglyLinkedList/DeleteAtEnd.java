package Day3.SinglyLinkedList;

class Node {
    int data;
    Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }
}

public class DeleteAtEnd {
    Node head;

    public void insertAtFirst(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteAtEnd list = new DeleteAtEnd();

        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        System.out.println("Singly Linked list: ");
        list.display();

        list.deleteAtEnd();
        System.out.println("After deleting an element at 1: ");
        list.display();
    }
}
