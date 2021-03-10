package task3and4;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length + 2 * width);
    }

    @Override
    public String toString() {
        return "Rectangle with width " + width + " and length " + length +
                "which is a subclass of " + super.toString();
    }
}
