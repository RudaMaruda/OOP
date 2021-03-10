package task3and4;

public class Circle extends Shape{
    protected int radius;

    public Circle(String color, boolean isFilled,int radius){
        super (color,isFilled);
        this.radius = radius;
    }

    public Circle() {
        this.radius = 1;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
@Override
    public double getArea(){
        double area;
        return area = Math.pow(radius,2)*Math.PI;
    }
    @Override
    public double getPerimeter(){
        double perimeter;
        return perimeter= 2*Math.PI*radius;
    }

    @Override
    public String toString(){
        return "Circle with radius "+radius+" which is subclass off "+super.toString();
    }
}
