public class Disk extends Content{
    private float length;
    private int priceDisk;

    public Disk(String title, float price, float length, int priceDisk) {
        super(title, price);
        this.length = length;
        this.priceDisk = priceDisk;
    }

    @Override
    public void showContent(){
        System.out.println("title of the content: " + getTitle());
        System.out.println("price of the content: " + getPrice());
        System.out.println("length of the disk: " + length);
        System.out.println("price of the disk: " + priceDisk);
    }
}