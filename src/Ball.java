import org.w3c.dom.css.RGBColor;

import java.awt.*;
public class Ball {
    private int size;
    private Color color;
    private int xspeed, yspeed;
    private int x, y;

    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
        size = (int) ((Math.random() * 20) + 30);
        color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        xspeed = (int) ((Math.random() * 6) + 1);
        yspeed = (int) ((Math.random() * 6) + 1);
//        xspeed = 1;
//        yspeed = 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void reverse() {
        xspeed *= -1;
        yspeed *= -1;
    }

    public void ranSpeed() {
        xspeed = (int) (Math.random() * 3) + 1;
        yspeed = (int) (Math.random() * 3) + 1;
    }

    public void move() {
        x += xspeed;
        y += yspeed;
    }

    public void draw(Graphics g2) {
        g2.setColor(color);
        g2.fillOval(x, y, size, size);
    }

    public void bounce(MyPanel panel) {
        if (x > (panel.getWidth() - size) || x < size) {
            ranSpeed();
            xspeed *= -1;
            if (x > panel.getWidth()) {
                x = panel.getWidth();
            } else if (x < size) {
                x = size;
            }
            color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        }
        if (y > (panel.getWidth() - size) || y < size) {
            ranSpeed();
            yspeed *= -1;
            if (y > panel.getHeight() - size) {
                y = panel.getHeight();
            } else if (y < size) {
                y = size;
            }
            color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
        }

    }
}
