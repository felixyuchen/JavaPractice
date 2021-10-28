public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    String color;

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public boolean getOn() {
        return this.on;
    }

    public void setOn(boolean newOn) {
        this.on = newOn;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    public String toString() {
        String fanStatus = "";
        if (this.on) {
            fanStatus = fanStatus + "The fan speed " + speed + ". The color is " + color + ". The radius is " + radius + ".";
            //System.out.printf("The %s fan's speed is %d and the radius is %4.2f.%n", getColor(), getSpeed(), getRadius());
        } else {
            fanStatus = fanStatus + "The fan is off and the color is " + color + ". The radius is " + radius + ".";
            //System.out.printf("The %s fan's radius is %4.2f and the fan is %s.%n", getColor(), getRadius(),getOn());
        }
        return fanStatus;
    }
}
