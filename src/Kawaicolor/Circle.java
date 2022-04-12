package Kawaicolor;

public class Circle extends Shape{
    private double radius;

    public Circle() {
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double dTich(double radius){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{"
                + "diện tích = "
                + dTich(radius)
                +"radius=" + radius + super.toString()+'}';
    }


}
