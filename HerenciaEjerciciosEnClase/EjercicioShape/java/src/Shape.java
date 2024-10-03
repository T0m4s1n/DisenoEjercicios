public abstract class Shape{
    private String color = "red";
    private boolean filled = true;

    public Shape(){}

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    @Override
    public String toString(){
        return "shape[with color = " + this.color + " and is " + (this.filled ? "filled" : "not filled");
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}