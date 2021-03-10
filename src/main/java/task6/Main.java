package task6;

public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(5, 5, 1, 1);
        movablePoint.moveDown();
        System.out.println(movablePoint.y);

        Movable movablePoint2 = new MovableCircle(4, 4, 2, 3, 2);
        System.out.println(movablePoint2.toString());
        movablePoint2.moveRight();
        System.out.println(movablePoint2.toString());


    }
}
