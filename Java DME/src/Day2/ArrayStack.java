package Day2;

public class ArrayStack {

    private int[] arr;
    private int top;
    private int capacity;

    public ArrayStack(int size){
        this.capacity = size;
        arr = new int[capacity];
        top = -1;
    }

    public void push(int value){
        if( top == capacity - 1){
            System.out.println("Stack is overflowed");
            return;
        }

        top++;
        arr[top] = value;
        System.out.println(value);

    }

    public int pop(){
        if ( top == -1){
            System.out.println("Stack is underflow");
            return -1;
        }

        int poppedvalue = arr[top];

        top--;
        return poppedvalue;
    }

    @Override
    public String toString(){
        if ( top == -1){
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        //System.out.println("[");
        for( int i = 0; i < top; i++){
            sb.append(arr[i]);
            if( i < top) {
                sb.append(",");
            }
        }
        sb.append("]");

        return sb.toString();
    }
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(4);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        System.out.println("Removed: " + stack.pop());
        System.out.println(stack);


    }
}
