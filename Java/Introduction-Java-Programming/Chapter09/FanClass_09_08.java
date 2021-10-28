public class FanClass_09_08 {
    public static void main(String[] args) {
        Fan firstFan = new Fan();
        firstFan.setSpeed(Fan.FAST);
        firstFan.setRadius(10);
        firstFan.setColor("yellow");
        firstFan.setOn(true);
        //firstFan.toString(true);
        System.out.println(firstFan.toString());

        Fan secondFan = new Fan();
        secondFan.setSpeed(Fan.MEDIUM);
        secondFan.setRadius(5);
        secondFan.setColor("blue");
        //secondFan.toString(false);
        System.out.println(secondFan.toString());

    }
}
