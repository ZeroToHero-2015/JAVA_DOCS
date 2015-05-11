package ro.teamnet.zerotohero.oop.runApp;

import ro.teamnet.zerotohero.canvas.Canvas;
import ro.teamnet.zerotohero.oop.graphicshape.*;

import java.util.Objects;

/**
 * Created by Taranu on 22/04/15.
 */
public class RunApp {
    public static void main(String[] args) {
        Circles circles = new Circles();
        System.out.println("The default circle area is " + circles.getAreaPub());
        circles.getAreaDef();
        Canvas canvas = new Canvas();
        System.out.println(canvas.getArea());
        Shape s = new Circle(10);
        System.out.println(s.area());
        ShapeBeahaviour sb = new Square(10);
        System.out.println(sb.area());
        Object p1 = new Point(10, 20);
        Object p2 = new Point(100, 200);
        Object p3= new Point(10,20);
        System.out.println("p1 equals p2 is "+ p1.equals(p2));
        System.out.println("p1 equals p3 is "+ p1.equals(p3));

    }
}
