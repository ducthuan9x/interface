package KhoiHinhVe;

public class KhoiHinhVe {
    String color = "green";
    boolean filled = true;

    public void KhoiHinhve() {
    }

    public void KhoiHinhve(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return
                " ,color='" + color + '\'' +
                        ", filled=" + filled +
                        '}';
    }
}
