package applications;
import java.util.ArrayList;

import circlePlugin.Circle;
import interfaces.IShape;
import rectanglePlugin.Rectangle;
import squarePlugin.Square;
import trapezePlugin.Trapeze;
import trianglePlugin.Triangle;
public class SampleShape implements IShape {

    @Override
    public void draw() {
        System.out.println("draw");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void read() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

