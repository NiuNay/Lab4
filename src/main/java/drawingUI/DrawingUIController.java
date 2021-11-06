package drawingUI;

import shapes.Drawing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingUIController {
    private JPanel controlsPanel;
    private JPanel mainPanel;

    public DrawingUIController() {
        controlsPanel = new JPanel();
        mainPanel = new JPanel();
        Drawing drawing = new Drawing();
        ShapeSelector sSel = new ShapeSelector();
        ColourSelector cSel  = new ColourSelector();
        CircleDimsSelector cdSel = new CircleDimsSelector();
        Stats stats = new Stats();
        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                Point p = e.getPoint();
                Color c = cSel.getCurrentColour();
                int shape = sSel.getCurrentShape();
                if (shape==1) {
                    int rad = cdSel.getCurrentRadius();
                    drawing.addCircle(p, c, rad);
                    stats.UpdateCircStats();
                }
                else if (shape==2) {
                    drawing.addRect(p, c,10, 20);
                    stats.UpdateRectStats();
                }
                else {
                    drawing.addSquare(p, c,5);
                    stats.UpdateSquareStats();
                }
                drawing.repaint();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        drawing.addCircle(new Point(200,200),new Color(0x992266),80);
        drawing.addRect(new Point(100,100),new Color(0x922266),80, 30);
        drawing.addSquare(new Point(200,100),new Color(0x552266),80);
        controlsPanel.setLayout(new GridLayout(3,1));
        controlsPanel.add(sSel);
        controlsPanel.add(cSel);
        controlsPanel.add(cdSel);
        controlsPanel.add(stats);
        mainPanel.setLayout(new GridLayout(2,1));
        mainPanel.add(controlsPanel);
        mainPanel.add(drawing);
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
