import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SampleDraw {
    public static void drawImage(Graphics graphics) {
        int size = WIDTH / 2;
        /*
        graphics.setColor(new Color(0, 49, 63));
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.yellow);
        */
        drawSomething(0, 0, size, graphics);
    }

    public static void drawSomething(int x, int y ,int size, Graphics graphics) {
        int step = size / 14;


        graphics.setColor(Color.green);

        for (int i = 0; i < 14; i++) {
            graphics.drawLine(5, 300-i*21, 300-i*21, 315);
        }
        graphics.setColor(Color.MAGENTA);
        for (int i = 0; i < 14; i++) {
            graphics.drawLine(20+i*21, 5, 315, 20+i*21);
        }

        /*graphics.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        graphics.fillRect((int) (Math.random() * (WIDTH - size)), (int) (Math.random() * (HEIGHT - size)), size, size);

        graphics.setColor(Color.green);
        graphics.drawOval(x, y, size, size);*/


    }

    // ezt a részt nem kell módosítani
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            drawImage(graphics);
        }
    }
}