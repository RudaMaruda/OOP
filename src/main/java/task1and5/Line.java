package task1and5;

public class Line {
    protected Point2D point1;
    protected Point2D point2;

    public Line(Point2D point1, Point2D point2) {
        this.point1 = point1;
        this.point2 = point2;
    }
public Line(float point1start, float point1end, float point2start, float point2end){
        this.point1 = new Point2D(point1start,point1end);
        this.point2 = new Point2D(point2start,point2end);
}

    public Point2D getPoint1() {
        return point1;
    }

    public void setPoint1(Point2D point1) {
        this.point1 = point1;
    }

    public Point2D getPoint2() {
        return point2;
    }

    public void setPoint2(Point2D point2) {
        this.point2 = point2;
    }

    public float getLength(){
        double length = Math.sqrt(Math.pow(point1.x- point2.x,2)+
                Math.pow(point1.y- point2.y, 2));
        return (float) length;
    }
    public Point2D middlePoint(){
        float pointXmid= (point2.x+ point1.x)/2;
        float pointYmid = (point1.y+point2.y)/2;
        return new Point2D(pointXmid,pointYmid);
    }
}
