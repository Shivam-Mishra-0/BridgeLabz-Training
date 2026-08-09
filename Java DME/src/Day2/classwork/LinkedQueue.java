package Day2;

public class LinkedQueue {
    private static class Node{
        int data;
        Node next;

        Node( int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;

    public LinkedQueue(){
        front = null;
        rear = null;
    }

    public void add(int value){
        Node newNode = new Node(value);

        if( rear == null){
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(value);
    }

    public int poll(){
        if( front == null){
            System.out.println("Queue is Empty");
            return -1;
        }

        int removedValue = front.data;
        front = front.next;

        if( front == null) {
            rear = null;
        }
        return removedValue;
    }

    public int peek(){
        if( front == null){
            System.out.println("Queue is Empty");
            return -1;
        }

        return front.data;
    }

    @Override
    public String toString(){
        if ( front == null ){
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        Node current = front;
        while ( current != null){
            sb.append(current.data);
            if(current .next !=  null){
                sb.append(", ");
            }
            current = current.next;
        }

        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);

        System.out.println("Peek : " + queue.peek());

        int removed = queue.poll();
        System.out.println("Removed : " + removed);
        System.out.println(queue);
    }
}
