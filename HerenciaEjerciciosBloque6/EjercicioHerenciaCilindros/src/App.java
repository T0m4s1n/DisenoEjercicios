import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("choose an option:");
            System.out.println("1. create a Circle");
            System.out.println("2. create a Cylinder");
            System.out.println("3. create an Empty Cylinder");
            System.out.println("4. exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("enter radius: ");
                    double circleRadius = scanner.nextDouble();
                    Circle circle = new Circle(circleRadius);
                    break;
                case 2:
                    System.out.print("enter radius: ");
                    double cylinderRadius = scanner.nextDouble();
                    System.out.print("enter height: ");
                    double cylinderHeight = scanner.nextDouble();
                    Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
                    break;
                case 3:
                    System.out.print("enter external radius: ");
                    double extRadius = scanner.nextDouble();
                    System.out.print("enter height: ");
                    double emptyCylinderHeight = scanner.nextDouble();
                    System.out.print("enter internal radius: ");
                    double intRadius = scanner.nextDouble();
                    CylinderEmpty emptyCylinder = new CylinderEmpty(extRadius, emptyCylinderHeight, intRadius);
                    break;
                case 4:
                    System.out.println("exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("invalid choice");
            }
        }
    }
}