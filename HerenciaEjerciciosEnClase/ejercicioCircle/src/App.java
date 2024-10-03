import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter radius for circle:");
        double circleRadius = scanner.nextDouble();
        System.out.println("enter color for circle:");
        String circleColor = scanner.next();
        Circle circle = new Circle(circleRadius, circleColor);
        System.out.println("created Circle: " + circle);
        System.out.println("area of Circle: " + circle.getArea());
        

        //this is my signature for certifie that i did my code, Tomasiiiin

        
        System.out.println("enter radius for cylinder:");
        double cylinderRadius = scanner.nextDouble();
        System.out.println("enter height for cylinder:");
        double cylinderHeight = scanner.nextDouble();
        System.out.println("enter color for cylinder:");
        String cylinderColor = scanner.next();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight, cylinderColor);
        System.out.println("created Cylinder: " + cylinder);
        System.out.println("volume of Cylinder: " + cylinder.getVolume());

        scanner.close();
    }
}