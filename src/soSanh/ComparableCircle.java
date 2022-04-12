package soSanh;

import KhoiHinhVe.HinhTron;

    public class ComparableCircle extends HinhTron implements Comparable<ComparableCircle>{

     public ComparableCircle(){

     }
        public ComparableCircle( double radius){
          this.radius=radius;
        }


        public ComparableCircle(String color, boolean filled, double radius) {
            super(radius, color, filled);
        }

        @Override
        public int compareTo(ComparableCircle o) {
            if (getRadius() > o.getRadius()) return 1;
            else if (getRadius() < o.getRadius()) return -1;
            else return 1;

        }
    }
