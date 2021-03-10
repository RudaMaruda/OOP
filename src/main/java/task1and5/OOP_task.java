package task1and5;

public class OOP_task {

    public static void main(String[] args) {


        Point2D point2D = new Point2D(5, 4);
        Point2D point2D1 = new Point2D(10, 4);
        System.out.println(point2D.getX());
        point2D.setXY(14, 34);
        float[] newArray = point2D.getXY();
        System.out.println(point2D.toString());
        System.out.println(newArray[0]);
        Point3D point3D = new Point3D(55, 65, 100);
        point3D.setXYZ(149, 341, 111);
        System.out.println(point3D.toString());

        Line line = new Line(10, 10, 20, 20);
        System.out.println(line.getLength());
        System.out.println(line.middlePoint());


    }
}
