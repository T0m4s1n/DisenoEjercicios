public class Content {
    private String title;
    private float price;

    public Content(String title, float price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public float getPrice() {
        return price;
    }

    public void showContent(){
        System.out.println("title of the content: " + title);
        System.out.println("price of the content: " + price);
    }
}