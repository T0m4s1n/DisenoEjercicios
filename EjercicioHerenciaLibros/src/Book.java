public class Book extends Content{
    private int pages;
    private int yearPublished;
    private float priceBook;

    public Book(String title, float price, int pages, int yearPublished, float priceBook){
        super(title, price);
        this.pages = pages;
        this.yearPublished = yearPublished;
        this.priceBook = priceBook;
    }

    @Override
    public void showContent(){
        System.out.println("title of the content: " + getTitle());
        System.out.println("price of the content: " + getPrice());
        System.out.println("pages of the book: " + pages);
        System.out.println("year published: " + yearPublished);
    }
}