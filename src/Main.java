import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
//        JPanel panel = new JPanel();
        MyPanel panel = new MyPanel();
        frame.setSize(500,500);
//        panel.setBackground(Color.PINK);
//        System.out.println("Hello world!");
//        frame.add(panel);
        frame.add(panel);

        frame.setVisible(true);
    }
}