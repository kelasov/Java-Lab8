package Pr8;

import javax.swing.*;
import java.awt.*;

public class Shape extends JComponent {
    protected Color color;
    protected int x,y;

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
    }
}