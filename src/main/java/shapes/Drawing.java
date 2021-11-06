package shapes;


import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {
    // A private field called f of class Frame. This is also in the AWT.
    private ShapeDB shapeDB;

    // Constructor
    public Drawing() {
        shapeDB=new ShapeDB();
    }

    public void addCircle(Point pos, Color col, int rad){
        shapeDB.addCircle(pos, col, rad);
    }

    public void addRect(Point pos, Color col, int w, int h){
        shapeDB.addRect(pos, col, w, h);
    }

    public void addSquare(Point pos, Color col, int side){
        shapeDB.addSquare(pos, col, side);
    }

    public void paint(Graphics g){ // WHEN DOES THIS EVER GET CALLED?
        shapeDB.drawShapes(g);
    }
}

