package pl.imiajd.laska;
import java.awt.Rectangle;

public class BetterRectangle extends Rectangle{

    public BetterRectangle(int height, int width, int x, int y){
        super(x, y, width, height);
        setLocation(x,y);
        setSize(width, height);
    }

    public double getPerimeter(){
        return 2*height + 2*width;
    }
    public double getArea(){
        return height*width;
    }

}
