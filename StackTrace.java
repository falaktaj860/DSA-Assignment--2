public class StackTrace {
    private int[] arr;
    private int top;

    public StackTrace(int capacity) {
        arr = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        arr[++top] = value;
        System.out.print("Push(" + value + ")  -> ");
        show();
    }

    public void pop() {
        int removed = arr[top--];
        System.out.print("Pop() [" + removed + "] -> ");
        show();
    }

    public void show() {
        System.out.print("Stack: [");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i]);
            if (i < top) System.out.print(", ");
        }
        System.out.println("]  Top: " + (top == -1 ? "none" : arr[top]));
    }

    public static void main(String[] args) {
        StackTrace stack = new StackTrace(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.push(40);
        stack.pop();

        System.out.println("\nFinal contents:");
        stack.show();
    }
}
