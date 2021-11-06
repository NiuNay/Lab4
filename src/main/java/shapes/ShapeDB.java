package shapes;

import java.awt.*;
import java.util.ArrayList;

public class ShapeDB {
    private ArrayList<Shape> shapes;

    public ShapeDB() {
        shapes=new ArrayList<Shape>();
    }

    public void addCircle(Point point, Color color, int rad) {
        Circle circle=new Circle(point,color,rad);
        shapes.add(circle);
    }

    public void addRect(Point point, Color color, int w, int h) {
        Rect rect=new Rect(point,color,w,h);
        shapes.add(rect);
    }

    public void addSquare(Point point, Color color, int side) {
        Square sqr=new Square(point,color,side);
        shapes.add(sqr);
    }

    public void drawShapes(Graphics g) {
        for (Shape s:shapes){
            s.draw(g);
        }
    }
}
