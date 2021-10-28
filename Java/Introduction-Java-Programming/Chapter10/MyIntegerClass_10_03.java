
public class MyIntegerClass_10_03 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(12);
        //boolean isPrime = false;
        System.out.println("This number is " + myInteger.getValue());
        if (myInteger.isPrime()) {
            System.out.println("The number is prime.");
        } else System.out.println("The number is not prime.");

        if (myInteger.isEven()) {
            System.out.println("The number is even.");
        } else System.out.println("The number is not even.");

        if (myInteger.isOdd(15)) {
            System.out.println("The new number is odd.");
        } else System.out.println("The new number is not odd.");

        if(myInteger.equals(12)){
            System.out.println("The new number equals this one.");
        }else System.out.println("The new number does not equal this one.");

//        char[] stringInt = {'a'};
//        System.out.println("The number of the character is " + myInteger.parseInt(stringInt));

        String string = "A string here.";
        System.out.println("The number of the string is " + myInteger.parseInt(string));
    }
}
