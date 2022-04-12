package Kawaicolor;

public class Main {
    public static void main(String[] args) {
        Shape[] shape1=new Shape[2];
        shape1[0]=new Square("blu",10,6);
        shape1[1]=new Circle("red",8);

        Square square1=new Square();
        for (Shape element:
             shape1) {
            if(element instanceof Square){
              square1.howToColor();
            }
            else{
                System.out.println(element);
            }
        }
    }
}
