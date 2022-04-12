package KhoiHinhVe;

public class HinhTron extends KhoiHinhVe {
    public double radius;

    public HinhTron() {
    }

    public HinhTron(double radius) {
        this.radius = radius;
    }

    public HinhTron(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color=color;
        this.filled=filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double Dtich(){
        return radius*Math.PI;
    }
    public double Cvi(double radius){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "HinhTron có diện tích" +Dtich()+","+
                "radius=" + radius +
                super.toString() ;
    }
}
