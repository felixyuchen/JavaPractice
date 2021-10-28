public class StackOfIntegers {
    private int[] elements;
    private int stackSize;
    public static final int DEFAULT_CAPACITY = 2;

    public StackOfIntegers() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public void push(int number) {
        if (stackSize >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[stackSize++] = number;
    }

    public int pop() {
        return elements[--stackSize];
    }

    public int getSize() {
        return stackSize;
    }

    public boolean empty() {
        return stackSize == 0;
    }
}
