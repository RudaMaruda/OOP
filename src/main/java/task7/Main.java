package task7;

public class Main {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(5);
        System.out.println(resizableCircle.toString());

        resizableCircle.resize(50);
        System.out.println(resizableCircle.toString());
    }
}
