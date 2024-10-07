public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double area(){
        return 2 * Math.PI * radius * height + 2 + super.area();
    }

    public double volume(){
        return super.area() * height;
    }  
}