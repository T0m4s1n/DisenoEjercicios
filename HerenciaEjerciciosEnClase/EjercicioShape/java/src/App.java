import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter radius for Circle:");
        double circleRadius = scanner.nextDouble();
        System.out.println("enter color for Circle:");
        String circleColor = scanner.next();
        System.out.println("is the circle filled? (true/false):");
        boolean circleFilled = scanner.nextBoolean();
        Circle circle = new Circle(circleRadius, circleColor, circleFilled);
        System.out.println(circle);
        int radius = (int) circleRadius;
        for (int y = -radius; y <= radius; y++) {
            for (int x = -radius; x <= radius; x++) {
            if (x * x + y * y <= radius * radius) {
                System.out.print(circleFilled ? String.valueOf(circleColor.charAt(0)) : String.valueOf(circleColor.charAt(0)));
            } else {
                System.out.print(" ");
            }
            }
            System.out.println();
        }

        System.out.println("enter width for Rectangle:");
        double rectangleWidth = scanner.nextDouble();
        System.out.println("enter length for Rectangle:");
        double rectangleLength = scanner.nextDouble();
        System.out.println("enter color for Rectangle:");
        String rectangleColor = scanner.next();
        System.out.println("is the rectangle filled? (true/false):");
        boolean rectangleFilled = scanner.nextBoolean();
        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleLength, rectangleColor, rectangleFilled);
        System.out.println(rectangle);
        int width = (int) rectangleWidth;
        int length = (int) rectangleLength;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
            if (rectangleFilled) {
                System.out.print(rectangleColor.charAt(0));
            } else {
                if (i == 0 || i == length - 1 || j == 0 || j == width - 1) {
                System.out.print(rectangleColor.charAt(0));
                } else {
                System.out.print(" ");
                }
            }
            }
            System.out.println();
        }

        System.out.println("enter side for Square:");
        double squareSide = scanner.nextDouble();
        System.out.println("enter color for Square:");
        String squareColor = scanner.next();
        System.out.println("is the square filled? (true/false):");
        boolean squareFilled = scanner.nextBoolean();
        Square square = new Square(squareSide, squareColor, squareFilled);
        System.out.println(square);
        int side = (int) squareSide;
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
            if (squareFilled) {
                System.out.print(squareColor.charAt(0));
            } else {
                if (i == 0 || i == side - 1 || j == 0 || j == side - 1) {
                System.out.print(squareColor.charAt(0));
                } else {
                System.out.print(" ");
                }
            }
            }
            System.out.println();
        }

        scanner.close();
    }
}