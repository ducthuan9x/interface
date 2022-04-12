package Kawaicolor;

public class Square extends Shape implements Colorrable{
    private double cd;
    private double cr;

    public Square() {
    }

    public Square(String color, double cd, double cr) {
        super(color);
        this.cd = cd;
        this.cr = cr;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }


    public double dTich(double cd, double cr){
        return this.cd*this.cr;
    }
    public double cVi(double cd,double cr){
        return (this.cd+this.cr)*2;
    }

    @Override
    public String toString() {
        return "Square{"
                + "diện tích = "+ dTich(cd,cr)
                + "cd=" + cd
                + ", cr=" + cr
                + super.toString()+ '}';
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sider");
    }
}
