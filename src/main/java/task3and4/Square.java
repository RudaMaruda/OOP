package task3and4;

public class Square extends Rectangle{


    public Square(String color, boolean isFilled, double size) {
        super(color,isFilled,size,size);
    }

    public void setWidth(double width) {
        super.width = width;
        super.length = width;
    }

    public void setLength(double length) {
        super.length = length;
        super.width = length;
    }
    @Override
    public String toString(){
        return "Square with width "+width+" and length "+length+
                "which is a subclass of " + super.toString();
    }

}
