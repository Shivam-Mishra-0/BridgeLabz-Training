package Day2;

public class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity){
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front =0;
        this.rear = -1;
        this.size= 0;
    }

    public void add( int value){
        if( size == capacity){
            System.out.println("Circular queue is full");
            return;
        }

        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
        System.out.println(value);
    }
    public int poll(){
        if( size == 0){
            System.out.println("Circular queue is empty.");
            return -1;
        }

        int removed = arr[front];
        front = ( front + 1) % capacity;
        size--;
        return removed;
    }
    public int peek(){
        if ( size == 0){
            System.out.println("Circular queue is empty.");
            return -1;
        }
        return arr[front];
    }

    @Override
    public String toString(){
        if( size == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");
        for( int i =0; i < size; i++){
            int index = ( front + i) % capacity;
            sb.append(arr[index]);
            if( i < size -1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(4);

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
