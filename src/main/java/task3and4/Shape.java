package task3and4;

public abstract class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape() {
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {

        if (isFilled) {
            return "Shape with color of " + color + " and filled.";
        } else {
            return "Shape with color of " + color + " and it is not filled.";
        }
    }
}
