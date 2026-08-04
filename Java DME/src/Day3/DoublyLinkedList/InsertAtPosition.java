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
public class InsertAtPosition {
    Node head;
    Node tail;

    public void insertAtFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }
    public void insertAtPosition(int value, int position){
        if (position == 0){
            insertAtFirst(value);
            return;
        }
        Node newNode = new Node(value);
        Node current = head;
        for( int i = 0; i < position; i++){
            if( current == null){
                break;
            }
            current = current.next;
        }
        if( current == null){
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            return;
        }
        Node prevNode = current.prev;
        newNode.next = current;
        newNode.prev = prevNode;

        prevNode.next = newNode;
        current.prev = newNode;
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
        InsertAtPosition list = new InsertAtPosition();

        list.insertAtFirst(20);
        list.insertAtFirst(10);
        list.insertAtFirst(30);
        list.insertAtFirst(10);

        list.insertAtPosition(15, 1);
        list.display();
    }
}
