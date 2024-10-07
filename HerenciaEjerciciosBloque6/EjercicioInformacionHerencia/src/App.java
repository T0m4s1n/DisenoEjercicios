import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Direction direction = null;
        int option;
        do { 
            System.out.println("// MENU for the address of the person //");
            System.out.println("1. add data of person");
            System.out.println("2. modify name");
            System.out.println("3. modify the address of the person");
            System.out.println("4. display the data of the person");
            System.out.println("5. exit");
            System.out.println("choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option){
                case 1:
                System.out.print("input the name: ");
                String name = scanner.nextLine();
                System.out.print("input the last name: ");
                String lastName = scanner.nextLine();
                System.out.print("input the second last name: ");
                String secondLastName = scanner.nextLine();
                System.out.print("input the street: ");
                String street = scanner.nextLine();
                System.out.print("input the city: ");
                String city = scanner.nextLine();
                System.out.print("input the state: ");
                String state = scanner.nextLine();
                System.out.print("input the postal code: ");
                int postalCode = scanner.nextInt();
                direction = new Direction(name, lastName, secondLastName, street, city, state, postalCode);
                System.out.println("data added successfully");
                break;

                case 2:
                if (direction == null){
                    System.out.println("you must enter the data first");
                } else {
                    System.out.print("input the name: ");
                    name = scanner.nextLine();
                    System.out.print("input the last name: ");
                    lastName = scanner.nextLine();
                    System.out.print("input the second last name: ");
                    secondLastName = scanner.nextLine();
                    direction.readName(name, lastName, secondLastName);
                    System.out.println("name modified successfully");
                }
                break;

                case 3:
                if(direction == null){
                    System.out.println("you must enter the data first");
                } else {
                    System.out.print("input the street: ");
                    street = scanner.nextLine();
                    System.out.print("input the city: ");
                    city = scanner.nextLine();
                    System.out.print("input the state: ");
                    state = scanner.nextLine();
                    System.out.print("input the postal code: ");
                    postalCode = scanner.nextInt();
                    direction.newDirection(direction.getName(), direction.getLastName(), direction.getSecondLastName(), street, city, state, postalCode);
                    System.out.println("address modified successfully");
                }
                break;

                case 4:
                if(direction == null){
                    System.out.println("you must enter the data first");
                } else {
                    direction.showName();
                }
                break;

                case 5:
                System.out.println("bye");
                return;

                default:
                System.out.println("invalid option");
                break;
            }
        } while (true);
    }
}