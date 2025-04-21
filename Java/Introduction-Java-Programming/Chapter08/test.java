import java.util.Random;

class Test {
    public void main(String[] args) {
        Random random = new Random(100);
        int[] array = new int[10];
        for(int i=0;i<10;i++){
            array[i] = random.nextInt(2);
        }
        for(int i = 0;i<10;i++)
            System.out.printf("%d ",array[i]);
    }
}

