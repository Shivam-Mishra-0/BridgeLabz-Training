package Day3.SinglyLinkedList;

class Node{
    int data;
    Node next;

    public Node(int value){
        this.data = value;
        this.next = null;
    }
}
public class InsertAtPosition {
    Node head;

    public void insertAtFirst(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtPosition(int value, int position){
        if ( position == 0){
            insertAtFirst(value);
            return ;
        }

        Node newNode = new Node(value);
        Node current = head;
        for ( int i = 0; i < position-1; i++){
            if ( current == null ){
                System.out.println("Position out of bounds.");
                return;
            }
            current = current.next;
        }

        if(current == null){
            System.out.println("Position out of bounds.");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void display(){
        Node current = head;
        while( current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtPosition list = new InsertAtPosition();

        list.insertAtFirst(10);
        list.insertAtFirst(20);
        list.insertAtFirst(30);
        System.out.println("Original Linked list: ");
        list.display();

        list.insertAtPosition(99, 1);
        System.out.println("After inserting: ");
        list.display();

    }
}
