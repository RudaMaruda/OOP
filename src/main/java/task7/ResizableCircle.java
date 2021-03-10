package task7;

public class ResizableCircle extends Circle implements Resizeable{


    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
       radius = radius*percent/100;
    }
    @Override
    public String toString(){
        return "Now the radius is: "+ radius;
    }
}
