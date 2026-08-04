package Day3.DoublyLinkedList;

import Day3.SinglyLinkedList.InsertAtPosition;

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
public class InsertAtFirst {
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
    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        InsertAtFirst list = new InsertAtFirst();

        list.insertAtFirst(20);
        list.insertAtFirst(10);
        list.insertAtFirst(5);

        list.display();
    }
}
