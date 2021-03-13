import java.awt.*;

public class ManhattanDistance {

    public static void main(String args[]) {

        // used these values to test my code
        Point a = new Point(-1,2);
        Point b = new Point(1,-2);

        System.out.println(getManhattanDistance(a, b));

    }

    public static int getManhattanDistance(Point a, Point b) {

        double aX = a.getX();
        double aY = a.getY();
        double bX = b.getX();
        double bY = b.getY();

        double xDistance = Math.abs(bX - aX);
        double yDistance = Math.abs(bY - aY);

        return (int) (xDistance + yDistance);

    }

}
