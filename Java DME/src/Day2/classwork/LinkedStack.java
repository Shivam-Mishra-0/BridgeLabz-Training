package Day2;

public class LinkedStack {
    private static class Node{
        int data;    // data stored in node
        Node next;   // memory address of next element

        Node (int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public LinkedStack(){
        top = null;   // Stack is empty
    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;  // next is set to the value
        top = newNode;       // top is updated.
        System.out.println(value);
    }

    public int pop(){
        if( top == null){
            System.out.println("Stack is Empty");
            return -1;
        }

        int poppedValue = top.data;
        top = top.next;
        return poppedValue;
    }

    @Override
    public String toString(){
        if( top == null ){
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        Node current = top;
        while(current != null){
            sb.append(current.data);
            if( current.next != null){
                sb.append(",");
            }
            current = current.next;
        }
        sb.append("]");
        return sb.toString();

    }
    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        System.out.println("Removed: " + stack.pop());
        System.out.println(stack);
    }




}
