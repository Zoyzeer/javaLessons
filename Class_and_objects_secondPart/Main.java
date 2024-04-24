package Class_and_objects_secondPart;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void info() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }
}

public class Main {
    public static void main(String[] args) {
        Point[] points = new Point[4];
        points[0] = new Point(1, 2);
        points[1] = new Point(3, 4);
        points[2] = new Point(6, 8);
        points[3] = new Point(5, 10);

        System.out.println("All points:");
        for (Point point : points) {
            point.info();
        }

        System.out.println("\nPoints with coordinates divisible by 2:");
        for (Point point : points) {
            if (point.x % 2 == 0 && point.y % 2 == 0) {
                point.info();
            }
        }
    }
}
