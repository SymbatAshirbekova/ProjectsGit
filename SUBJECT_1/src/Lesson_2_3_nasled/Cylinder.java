package Lesson_2_3_nasled;

public class Cylinder extends FiguraSuper {
    Cylinder(int h) {
        this.h = h;
    }



    public float vcylinder (int h){
        this.h = h;
        return pi*r*r*h;
    }

}
