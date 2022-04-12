package TabgKichThuoc;

public class main {
    public static void main(String[] args) {
       KhoiVe[] khoiVes=new KhoiVe[3];
       khoiVes[0]=new Circle("blu",true,6);
       khoiVes[1]=new Rectangle(8,6);
       khoiVes[2]=new Rectangle("red",true,5,3);


        for (KhoiVe elements:
             khoiVes) {
            System.out.println(elements);

        }

       int randomNumber= (int) Math.floor(Math.random()*100);

        System.out.println("sau khi thay đổi element;");
        for (KhoiVe elements:
             khoiVes) {
             elements.resize(randomNumber);
            System.out.println(elements);
        }
    }
}
