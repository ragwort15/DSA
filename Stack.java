

public class  Stack {
     int maxSize;
    int[] stackArray;
    int topElement;

    public Stack(int size) {
        int[] stackArray = new int[size];
        int topElement = -1;
    }


    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full" + value);


        } else {
            stackArray[++topElement] = value;
        }

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stck is Empty, Cannot pop");
            return -1;
        } else {
            return stackArray[topElement--];
        }

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stck is Empty, nothing to peek");
            return -1;
        } else {
            return stackArray[topElement];
        }
    }

    public boolean isEmpty() {
        return (topElement == -1);
    }

    public boolean isFull() {
        return (topElement == maxSize  -1);

    }

    public int size() {
        return topElement + 1;
    }

    public static void main(String args[]) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());


    }


}
