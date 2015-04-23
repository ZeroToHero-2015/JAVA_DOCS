package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Taranu on 22/04/15.
 */
public class Circles {
    public double getAreaPub(){
        Circle c= new Circle();
        return c.area();
    }
    public void getAreaDef(){
        Circle cs=new Circle();
        cs.fillColour();
        cs.fillColour(2);
    }
}
