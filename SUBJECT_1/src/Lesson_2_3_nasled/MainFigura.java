package Lesson_2_3_nasled;
public class MainFigura {

    public static void main(String[] args) {
        Cylinder cn = new Cylinder(5);
        System.out.println(cn.vcylinder(8));
        Rectangle rn = new Rectangle();
        System.out.println(rn.vrect(5, 3, 4));
        Circle cr = new Circle();
        System.out.println(cr.vcircle());


    }
}
