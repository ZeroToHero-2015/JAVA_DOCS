package ro.teamnet.zerotohero.oop.graphicshape;

/**
 * Created by Taranu on 22/04/15.
 */
public class Shape extends AbstractShape implements ShapeBeahaviour{
    protected int color;
    protected float saturation;

    public double area(){
        return 0;
    }

    public void setSaturation(float saturation) {
        this.saturation = saturation;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
