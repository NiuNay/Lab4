package drawingUI;

import javax.swing.*;
import java.awt.*;

public class CircleDimsSelector extends JPanel {
    JSlider sld1;
    int rad;

    public CircleDimsSelector() {
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(2,1));
        JLabel label = new JLabel("Circle Radius");
        sld1 = new JSlider(1, 100);
        controls.add(label);
        controls.add(sld1);
        add(controls);
    }

    public int getCurrentRadius() {
        rad = sld1.getValue();
        return rad;
    }
}
