public class QueueTrace {
    private int[] arr;
    private int front, rear;

    public QueueTrace(int capacity) {
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        arr[++rear] = value;
        System.out.print("Enqueue(" + value + ") -> ");
        show();
    }

    public void dequeue() {
        int removed = arr[front++];
        System.out.print("Dequeue() [" + removed + "] -> ");
        show();
    }

    public void show() {
        System.out.print("Queue: [");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i]);
            if (i < rear) System.out.print(", ");
        }
        System.out.println("]  Front: " + (front > rear ? "none" : arr[front]));
    }

    public static void main(String[] args) {
        QueueTrace queue = new QueueTrace(10);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.enqueue(40);
        queue.dequeue();

        System.out.println("\nFinal contents:");
        queue.show();
    }
}
