package Pr8;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Window extends JFrame {
    Shape c;
    public Window () {
        setSize (new Dimension (700, 600));
        setVisible (true);
    }
    public void paint(Graphics g) {
        Random random = new Random();
        for (int i = 0; i<20; i++) {
            c = new Rectangle(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)),
                    random.nextInt(getPreferredSize().width), random.nextInt(getPreferredSize().height),
                    random.nextInt(100), random.nextInt(100));
            c.paint(g);
            }
        }

    public static void main (String [] args) {
        Window w = new Window();
    }
}