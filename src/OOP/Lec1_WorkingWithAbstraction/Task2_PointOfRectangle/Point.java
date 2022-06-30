package OOP.Lec1_WorkingWithAbstraction.Task2_PointOfRectangle;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean greaterOrEqual(Point other) {
        return x >= other.getX() && y >= other.getY();
    }

    public boolean lesserOrEqual(Point other) {
        return x <= other.getX() && y <= other.getY();
    }
}
