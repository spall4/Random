//Name: Pallav Shah Date: 7/27/15 Title: DrawFigures
//Description: draws different figures in drawing panel.   
package drawfig;

import java.awt.*;


public class DrawFig {

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(400, 400);
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.CYAN);
        draw(g);
        drawGrid(g, 10, 120, 24, 5);
        drawGrid(g, 150, 20, 40, 6);
        bottomRight(g);
    }

    public static void draw(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(0, 0, 100, 100);
        g.setColor(Color.green);
        g.fillRect(0, 0, 100, 100);

        g.setColor(Color.yellow);
        g.fillOval(0, 0, 100, 100);
        g.setColor(Color.black);
        for (int i = 0; i <= 50; i += 10) {
            g.drawOval(i, i, 100 - (2 * i), 100 - (2 * i));
        }

        g.drawLine(0, 0, 100, 100);
        g.drawLine(0, 100, 100, 0);
        g.drawLine(0, 50, 100, 50);
        g.drawLine(50, 0, 50, 100);
    }

    public static void drawGrid(Graphics g, int x, int y, int size, int nor) {

        for (int j = 0; j < size * nor; j += size) {
            for (int k = 0; k < size * nor; k += size) {

                g.setColor(Color.green);
                g.fillRect(x + k, y + j, size, size);

                g.setColor(Color.yellow);
                g.fillOval(x + k, y + j, size, size);
                g.setColor(Color.black);
                for (int i = 0; i < size; i += nor - 2) {
                    g.drawOval(x + i + k, y + i + j, size - 2 * i, size - 2 * i);
                }

                g.drawLine(x + k, y + j, x + size + k, y + size + j);
                g.drawLine(x + k, y + size + j, x + size + k, y + j);
                g.drawLine(x + k, y + (size / 2) + j, x + size + k, y + (size / 2) + j);
                g.drawLine(x + (size / 2) + k, y + j, x + (size / 2) + k, y + size + j);
                g.setColor(Color.black);
                g.drawRect(x + k, y + j, size, size);
            }
            System.out.println();
        }

    }

    public static void bottomRight(Graphics g) {
        for (int j = 0; j < 36 * 3; j += 36) {
            for (int k = 0; k < 36 * 3; k += 36) {

                g.setColor(Color.green);
                g.fillRect(130 + k, 275 + j, 36, 36);

                g.setColor(Color.yellow);
                g.fillOval(130 + k, 275 + j, 36, 36);
                g.setColor(Color.black);
                for (int i = 0; i < 36; i += 6) {
                    g.drawOval(130 + i + k, 275 + i + j, 36 - 2 * i, 36 - 2 * i);
                }

                g.drawLine(130 + k, 275 + j, 166 + k, 275 + 36 + j);
                g.drawLine(130 + k, 275 + 36 + j, 166 + k, 275 + j);
                g.drawLine(130 + k, 275 + 18 + j, 166 + k, 275 + 18 + j);
                g.drawLine(148 + k, 275 + j, 148 + k, 275 + 36 + j);
                g.setColor(Color.black);
                g.drawRect(130 + k, 275 + j, 36, 36);
            }
            System.out.println();
        }

    }
}
