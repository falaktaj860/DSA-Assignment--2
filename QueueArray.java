import java.util.Scanner;

public class QueueArray {
    private int[] arr;
    private int front, rear, capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
    }

    public boolean isFull()  { return rear == capacity - 1; }
    public boolean isEmpty() { return front > rear; }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        arr[++rear] = value;
        System.out.println(value + " enqueued to queue.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Nothing to dequeue.");
            return;
        }
        System.out.println(arr[front++] + " dequeued from queue.");
    }

    public void front() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("Front element: " + arr[front]);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue (front -> rear): ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter queue capacity: ");
        QueueArray queue = new QueueArray(sc.nextInt());

        int choice;
        do {
            System.out.println("\n--- QUEUE MENU ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Front");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    queue.enqueue(sc.nextInt());
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.front();
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

    }
}