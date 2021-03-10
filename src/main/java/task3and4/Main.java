package task3and4;

public class Main {
    public static void main(String[] args) {


        Shape shape1 = new Rectangle("blue",false,6,5);
        System.out.println(shape1.toString());


        Square square = new Square("blue", true,4);
        square.setWidth(7);
        System.out.println(square.getArea());
    }
}
