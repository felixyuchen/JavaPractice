public class MyInteger {
    private int value;

    public MyInteger(int newValue) {
        this.value = newValue;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return this.value % 2 != 0;
    }

    public boolean isPrime() {
        boolean isPrime = true;
        for (int i = 2; i <= (int) Math.sqrt(this.value); i++) {
            if (this.value % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean isEven(int newValue) {
        return newValue % 2 == 0;
    }

    public static boolean isOdd(int newValue) {
        return newValue % 2 != 0;
    }

    public static boolean isPrime(int newValue) {
        boolean isPrime = true;
        for (int i = 2; i * i < newValue; i++) {
            if (newValue % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static boolean isEven(MyInteger newValue) {
        return newValue.getValue() % 2 == 0;
    }

    public static boolean isOdd(MyInteger newValue) {
        return newValue.getValue() % 2 != 0;
    }

    public static boolean isPrime(MyInteger newValue) {
        boolean isPrime = true;
        for (int i = 2; i * i < newValue.getValue(); i++) {
            if (newValue.getValue() % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public boolean equals(int newValue) {
        return this.value == newValue;
    }

    public boolean equals(MyInteger newValue) {
        return this.value == newValue.getValue();
    }

    public static int parseInt(char[] stringInt) {
        return Integer.parseInt(stringInt.toString());
    }

    public static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}
