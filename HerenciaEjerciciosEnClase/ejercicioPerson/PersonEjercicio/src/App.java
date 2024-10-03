import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("choose an option:");
            System.out.println("1. create Person");
            System.out.println("2. create Staff");
            System.out.println("3. create Student");
            System.out.println("4. exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("enter name for Person:");
                    String personName = scanner.nextLine();
                    System.out.println("enter address for Person:");
                    String personAddress = scanner.nextLine();
                    Person person = new Person(personName, personAddress);
                    System.out.println(person);
                }
                case 2 -> {
                    System.out.println("enter name for Staff:");
                    String staffName = scanner.nextLine();
                    System.out.println("enter address for Staff:");
                    String staffAddress = scanner.nextLine();
                    System.out.println("enter school for Staff:");
                    String staffSchool = scanner.nextLine();
                    System.out.println("enter pay for Staff:");
                    double staffPay = scanner.nextDouble();
                    scanner.nextLine();
                    Staff staff = new Staff(staffName, staffAddress, staffSchool, staffPay);
                    System.out.println(staff);
                }
                case 3 -> {
                    System.out.println("enter name for Student:");
                    String studentName = scanner.nextLine();
                    System.out.println("enter address for Student:");
                    String studentAddress = scanner.nextLine();
                    System.out.println("enter program for Student:");
                    String studentProgram = scanner.nextLine();
                    System.out.println("enter year for Student:");
                    int studentYear = scanner.nextInt();
                    System.out.println("enter fee for Student:");
                    double studentFee = scanner.nextDouble();
                    scanner.nextLine();
                    Student student = new Student(studentName, studentAddress, studentProgram, studentYear, studentFee);
                    System.out.println(student);
                }
                case 4 -> exit = true;
                default -> System.out.println("invalid choice. please try again.");
            }
        }

        scanner.close();
    }
}