package soSanhComparator;

import KhoiHinhVe.HinhTron;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        HinhTron[] circles = new HinhTron[3];
        circles[0] = new HinhTron(3.6);
        circles[1] = new HinhTron();
        circles[2] = new HinhTron(6, "indigo", false);

        System.out.println("Pre-sorted:");
        for (HinhTron circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new ComparatorCircle();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (HinhTron circle : circles) {
            System.out.println(circle);
        }
    }
}
