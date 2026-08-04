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
public class InsertAtEnd {
    Node head;
    Node tail;

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtEnd list = new InsertAtEnd();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.display();
    }
}
