import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel{
int xLoc = 200;
int yLoc = 200;
int xVel = 2;
int yVel = 3;
Ball myBall;
Ball[] wow;

    public MyPanel(){
        setBackground(Color.PINK);
        myBall = new Ball(200,200);
        wow = new Ball[1000];
        for (int i = 0; i<wow.length;i++){
            wow[i]=new Ball((int)(Math.random()*500),(int)(Math.random()*500));
        }
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
//        g.setColor(Color.CYAN);
//        g.fillOval(xLoc,yLoc,50,50);
        myBall.draw(g);
        for (int i = 0; i<wow.length;i++){
//            for (int j = 0; j < wow.length; j++){
//                if (i == j){
//                }
//                else if (((wow[i].getX()>=wow[j].getY()-wow[j].getSize())&&(wow[i].getX()<=wow[j].getY()+wow[j].getSize()))&&((wow[i].getY()>=wow[j].getY()-wow[j].getSize())&&(wow[i].getY()<=wow[j].getY()+wow[j].getSize()))){
//                    wow[i].reverse();
//                    wow[j].reverse();
//                }
//            }
            wow[i].draw(g);
            wow[i].move();
            wow[i].bounce(this);

        }

        myBall.move();
        myBall.bounce(this);
        xLoc+=xVel;
        yLoc+=yVel;
        if (xLoc >= getWidth()-50||xLoc < 0){
         xVel = xVel * -1;

        }
        if (yLoc >= getHeight()-50||yLoc < 0){
            yVel = yVel * -1;
        }
        try {
            Thread.sleep(20);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        //calls paintComponent again
        repaint();
        g.setColor(Color.yellow);
        g.drawString("hi",250,250);
    }
}
