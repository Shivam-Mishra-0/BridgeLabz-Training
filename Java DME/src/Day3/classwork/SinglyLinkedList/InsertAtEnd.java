package Day3.SinglyLinkedList;

class Node{
    int data;
    Node next;

    public Node(int value){
        this.data = value;
        this.next = null;
    }
}
public class InsertAtEnd {
    Node head;

    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void display(){
     Node current = head;
     while(current != null){
         System.out.print(current.data + " -> ");
         current = current.next;
     }
        System.out.println("null");
    }
    public static void main(String[] args) {
        InsertAtEnd list = new InsertAtEnd();

        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        System.out.println("Original Linked list: ");
        list.display();

        list.insertAtEnd(99);
        System.out.println("After inserting: ");
        list.display();
    }
}
