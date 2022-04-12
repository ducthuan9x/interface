package soSanhComparator;

import KhoiHinhVe.HinhTron;

import java.util.Comparator;

public class ComparatorCircle extends HinhTron implements Comparator<HinhTron> {

    @Override
    public int compare(HinhTron o1, HinhTron o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }


}
