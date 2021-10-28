public class QueueClass_10_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 20; i++) {
            queue.enqueue(i + 1);
        }
        int size = queue.getSize();
        for(int i = 0; i < size;i++){
            System.out.printf("%d, ",queue.dequeue());
        }
    }
}
