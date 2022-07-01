package OOP.Lec1_WorkingWithAbstraction.LAB.Task2_PointOfRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rectCoordinates = getPointCoordinates(scanner);

        int bottomLeftX = rectCoordinates[0];
        int bottomLeftY = rectCoordinates[1];
        int topRightX = rectCoordinates[2];
        int topRightY = rectCoordinates[3];

        Point pointA = new Point(bottomLeftX, bottomLeftY);
        Point pointC = new Point(topRightX, topRightY);

        Rectangle rectangle = new Rectangle(pointA, pointC);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){
            int[] pointCoordinates = getPointCoordinates(scanner);
            int pointX = pointCoordinates[0];
            int pointY = pointCoordinates[1];
            Point point = new Point(pointX, pointY);

            System.out.println(rectangle.contains(point));
        }
    }

    private static int[] getPointCoordinates(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
