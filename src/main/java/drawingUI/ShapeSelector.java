package drawingUI;

import javax.swing.*;
import java.awt.*;

public class ShapeSelector extends JPanel {
    JRadioButton bCirc;
    JRadioButton bRect;
    JRadioButton bSquare;

    public ShapeSelector() {
        bCirc = new JRadioButton("Circle");
        bRect = new JRadioButton("Rectangle");
        bSquare = new JRadioButton("Square");

        ButtonGroup bg = new ButtonGroup();
        bg.add(bCirc);
        bg.add(bRect);
        bg.add(bSquare);

        add(bCirc);
        add(bRect);
        add(bSquare);

        bCirc.setSelected(true);
    }

    public int getCurrentShape(){
       if(bCirc.isSelected()){
           System.out.println("Circle");
           return 1;
        }

        else if(bRect.isSelected()){
            System.out.println("Rectangle");
            return 2;
        }

        else{
            System.out.println("Square");
            return 3;
        }
    }

}
