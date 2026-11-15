import java.util.Scanner;

public class StackArray {
    private int[] arr;
    private int top;
    private int capacity;

    public StackArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    public boolean isFull()  { return top == capacity - 1; }
    public boolean isEmpty() { return top == -1; }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        arr[++top] = value;
        System.out.println(value + " pushed to stack.");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Nothing to pop.");
            return;
        }
        System.out.println(arr[top--] + " popped from stack.");
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element: " + arr[top]);
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (bottom -> top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stack capacity: ");
        StackArray stack = new StackArray(sc.nextInt());

        int choice;
        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    stack.push(sc.nextInt());
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4:
                    stack.display();
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