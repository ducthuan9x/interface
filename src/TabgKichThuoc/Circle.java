package TabgKichThuoc;

public class Circle extends KhoiVe {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  double Dtich(double radius){
        return radius*radius*Math.PI;
    }
    public double Cvi(double radius){
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "diện tích="+ Dtich(radius)
                +  "chu vi = "+ Cvi(radius)
                + "radius=" + radius
                + "," + super.toString() + '}';
    }

    @Override
    public void resize(double percent) {
        this.radius=(this.radius*(percent/100));

    }

}
