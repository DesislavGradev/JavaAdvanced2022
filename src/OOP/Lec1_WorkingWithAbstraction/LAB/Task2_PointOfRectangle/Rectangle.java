package OOP.Lec1_WorkingWithAbstraction.LAB.Task2_PointOfRectangle;

public class Rectangle {
    private Point a;
    private Point c;

    public Rectangle(Point a, Point c) {
        this.a = a;
        this.c = c;
    }


    public boolean contains(Point point) {
        return point.greaterOrEqual(a) && point.lesserOrEqual(c);
    }
}
