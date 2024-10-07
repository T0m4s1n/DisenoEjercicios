public class Name {
    private String name;
    private String lastName;
    private String secondLastName;

    public Name(String name, String lastName, String secondLastName) {
        this.name = name;
        this.lastName = lastName;
        this.secondLastName = secondLastName;
    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSecondLastName(){
        return secondLastName;
    }

    public void readName(String Name, String LastName, String SecondLastName) {
        this.name = Name;
        this.lastName = LastName;
        this.secondLastName = SecondLastName;
    }

    public void showName() {
        System.out.println("Name: " + name + " " + lastName + " " + secondLastName);
    }
}