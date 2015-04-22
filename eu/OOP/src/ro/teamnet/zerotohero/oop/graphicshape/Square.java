package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Taranu on 22/04/15.
 */
public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }
    public double area(){
        return side*side;
    }
}
