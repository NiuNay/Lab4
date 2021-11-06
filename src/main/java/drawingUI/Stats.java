package drawingUI;

import javax.swing.*;
import java.awt.*;

public class Stats extends JPanel {
    int Circnum;
    int Rectnum;
    int Squarenum;
    JLabel CircnumL;
    JLabel RectnumL;
    JLabel SquarenumL;

    public Stats() {
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3,1));
        Circnum = 1;
        Rectnum = 1;
        Squarenum = 1;
        CircnumL = new JLabel("Circles: "+ Circnum);
        RectnumL = new JLabel("Rectangles: "+ Rectnum);
        SquarenumL = new JLabel("Squares: " + Squarenum);
        controls.add(CircnumL);
        controls.add(RectnumL);
        controls.add(SquarenumL);
        add(controls);
    }

    public void UpdateCircStats() {
        Circnum = Circnum + 1;
        CircnumL.setText("Circles: "+ Circnum);
    }

    public void UpdateRectStats() {
        Rectnum = Rectnum + 1;
        RectnumL.setText("Rectangles: "+ Rectnum);
    }

    public void UpdateSquareStats() {
        Squarenum = Squarenum + 1;
        SquarenumL.setText("Squares: "+ Squarenum);
    }
}
