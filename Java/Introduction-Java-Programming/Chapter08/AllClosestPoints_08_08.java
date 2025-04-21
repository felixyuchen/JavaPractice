import java.util.Scanner;

public class AllClosestPoints_08_08 {
    public static void main(String[] args) {
        System.out.print("Enter the number of points: ");
        Scanner scanner = new Scanner(System.in);
        int numberOfPoints = scanner.nextInt();

        System.out.printf("Enter %d points: ", numberOfPoints);
        double[][] points = new double[numberOfPoints][2];
        for (int i = 0; i < points.length; i++) {
            points[i][0] = scanner.nextDouble();
            points[i][1] = scanner.nextDouble();
        }
        scanner.close();
        double shortestDistance = distance(points[0][0], points[0][1], points[1][0], points[1][1]);
        //initial an array to store all of distance
        double[] twoPointsDistance = new double[(numberOfPoints * (numberOfPoints - 1) / 2)];
        //initial an 2-dimen array to store the index of 2 points
        int[][] indexOf2Points = new int[(numberOfPoints * (numberOfPoints - 1) / 2)][2];
        int t = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                twoPointsDistance[t] = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                indexOf2Points[t][0] = i;
                indexOf2Points[t][1] = j;
                if (shortestDistance > twoPointsDistance[t]) {
                    shortestDistance = twoPointsDistance[t];
                }
                t++;
            }
        }
        for (int i = 0; i < twoPointsDistance.length; i++) {
            if (twoPointsDistance[i] == shortestDistance) {
                int firstPoint = indexOf2Points[i][0];
                int secondPoint = indexOf2Points[i][1];
                System.out.printf("The closest two points are (%2.1f,%2.1f) and (%2.1f,%2.1f)%n",
                        points[firstPoint][0], points[firstPoint][1], points[secondPoint][0], points[secondPoint][1]);
            }
        }
        System.out.println("Their distance is " + shortestDistance);
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
