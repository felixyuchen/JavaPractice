public class Queue {
    private int[] elements;
    private int size;

    public Queue() {
        this.elements = new int[8];
        // this.size = 8;
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        int popNumber = elements[0];
        for (int i = 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }
        size--;
        return popNumber;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize(){
        return this.size;
    }
}
