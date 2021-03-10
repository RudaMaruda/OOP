package task6;

public class MovableCircle implements Movable{
    protected int radius;
    protected MovablePoint point1;


    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.point1 = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        point1.moveUp();
    }

    @Override
    public void moveDown() {
        point1.moveDown();
    }

    @Override
    public void moveRight() {
        point1.moveRight();
    }

    @Override
    public void moveLeft() {
        point1.moveLeft();
    }
    @Override
    public String toString(){
        return "Circle from movable circle has radius = "+radius+ " Was create on points x= "+ point1.x+" and y= "+point1.y;
    }
}
