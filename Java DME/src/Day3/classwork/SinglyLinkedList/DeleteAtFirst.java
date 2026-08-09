package Day3.SinglyLinkedList;

class Node{
    int data;
    Node next;

    public Node(int value){
        this.data = value;
        this.next = null;
    }
}
public class DeleteAtFirst {
    Node head;

    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }
    public void deleteAtFirst(){
        if(head == null){
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DeleteAtFirst list = new DeleteAtFirst();

        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        System.out.println("Singly Linked list: ");
        list.display();

        list.deleteAtFirst();
        System.out.println("After deleting an element at first: ");
        list.display();

    }
}
