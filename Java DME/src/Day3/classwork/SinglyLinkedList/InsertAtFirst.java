package Day3.SinglyLinkedList;


class Node{
    int data;
    Node next;

    public Node( int data ){
        this.data = data;
        this.next = null;
    }
}
public class InsertAtFirst {
    Node head;

    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void display(){
        Node current = head;
        while( current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtFirst list = new InsertAtFirst();

        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);

        System.out.println("Singly Linked list: ");
        list.display();
    }
}
