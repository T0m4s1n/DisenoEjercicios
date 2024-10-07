import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Book book = null;
        Disk disk = null;
        int option;

        do {
            System.out.println("// MENU for the content of the library //");
            System.out.println("1. add a book");
            System.out.println("2. add a disk");
            System.out.println("3. display the content of the library");
            System.out.println("4. exit");
            System.out.println("choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("enter the data of the book ");
                    System.out.print("enter the title of the book: ");
                    String title = scanner.nextLine();
                    System.out.println("enter the price of the book: ");
                    float price = scanner.nextFloat();
                    System.out.println("enter the number of pages of the book: ");
                    int pages = scanner.nextInt();
                    System.out.println("enter the year of publication of the book: ");
                    int yearPublished = scanner.nextInt();
                    book = new Book(title, price, pages, yearPublished);
                    System.out.println("the book has been added to the library");
                    break;
                case 2:
                    System.out.println("enter the data of the disk ");
                    System.out.print("enter the title of the disk: ");
                    title = scanner.nextLine();
                    System.out.println("enter the price of the content");
                    price = scanner.nextFloat();
                    System.out.print("enter the length of the disk: ");
                    float length = scanner.nextFloat();
                    System.out.print("enter the price of the disk: ");
                    int priceDisk = scanner.nextInt();
                    disk = new Disk(title, price, length, priceDisk);
                    System.out.println("the disk has been added to the library");
                    break;
                case 3:
                    if (book != null){
                        System.out.println("the content of the books is: ");
                        book.showContent();
                    }
                    if (disk != null){
                        System.out.println("the content of the disks is: ");
                        disk.showContent();
                    }
                    break;
                case 4:
                    System.out.println("goodbye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("invalid option");
            }
        } while (true);
    }
}