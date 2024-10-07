public class Circle {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double readRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }
}