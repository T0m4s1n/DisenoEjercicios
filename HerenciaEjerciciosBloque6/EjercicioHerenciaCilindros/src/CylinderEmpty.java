public class CylinderEmpty extends Cylinder{
    private double internRadius;

    public CylinderEmpty(double radius, double height, double internRadius) {
        super(radius, height);
        this.internRadius = internRadius;
    }

    public double lenght(){
        return 2 * Math.PI * (super.readRadius() + internRadius);
    }
    
    @Override
    public double area(){
        double extenalArea = super.area();
        double internalArea = Math.PI * Math.pow(internRadius, 2);
        return extenalArea - internalArea + lenght() * super.getHeight();
    }

    @Override
    public double volume(){
        return super.volume() - (Math.PI * Math.pow(internRadius, 2) * super.getHeight());
    }
}