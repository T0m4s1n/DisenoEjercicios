public class Direction extends Name{
    private String street;
    private String city;
    private String state;
    private int postalCode;

    public Direction(String name, String lastName, String secondLastName, String street, String city, String state, int postalCode) {
        super(name, lastName, secondLastName);
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public void newDirection(String Name, String LastName, String SecondLastName, String Street, String City, String State, int PostalCode) {
    }

    @Override
    public void showName() {
        super.showName();
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Postal Code: " + postalCode);
    }
}