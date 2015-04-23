package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Taranu on 22/04/15.
 */
public class Circle extends Shape {
    private int xPos;
    private int yPos;
    private int radius;

    public Circle() {
        xPos = 1;
        yPos = 2;
        radius = 30;
    }

    public Circle(int xPos) {
        this.xPos = xPos;
        yPos = 2;
        radius = 3;
    }

    public Circle(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        radius = 3;
    }

    public Circle(int yPos, int xPos, int radius) {
        this.yPos = yPos;
        this.xPos = xPos;
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "center = ("+ xPos +","+ yPos+") and radius ="+radius;
    }
    public void fillColour(){
        System.out.println(super.color);
    }
    public void fillColour(int f){
        super.setColor(f);
        System.out.println("The circle color is now "+super.color);
    }

}
