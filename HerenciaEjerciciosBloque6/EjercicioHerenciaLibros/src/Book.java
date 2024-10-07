public class Book extends Content{
    private int pages;
    private int yearPublished;

    public Book(String title, float price, int pages, int yearPublished) {
        super(title, price);
        this.pages = pages;
        this.yearPublished = yearPublished;
    }

    @Override
    public void showContent(){
        System.out.println("title of the content: " + getTitle());
        System.out.println("price of the content: " + getPrice());
        System.out.println("pages of the book: " + pages);
        System.out.println("year published: " + yearPublished);
    }
}