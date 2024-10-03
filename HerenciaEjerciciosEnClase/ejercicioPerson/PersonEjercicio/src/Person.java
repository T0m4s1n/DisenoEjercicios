public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddres() {
        return address;
    }

    public void setAddress(String addres) {
        this.address = addres;
    }

    @Override
    public String toString() {
        return "Person [name" + name + ", addres" + address + "]";
    }
}
