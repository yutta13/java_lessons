import javax.swing.*;
import java.awt.*;

class MyDrawPanel extends JPanel {
public void paintComponent (Graphics g){
   /* Image image = new ImageIcon("pict.jpeg").getImage();
    g.drawImage(image,3,4,this);

    g.setColor(Color.BLUE);
    g.fillRect(20,50,100,100);

    */
    Graphics2D g2d = (Graphics2D) g;
    /*GradientPaint gradient = new GradientPaint(70,70,Color.green, 150,150,Color.MAGENTA);
    g2d.setPaint(gradient);
   */
    int red = (int)(Math.random()*255);
    int green = (int)(Math.random()*255);
    int blue = (int)(Math.random()*255);
    Color startColor = new Color(red, green, blue);

    red = (int)(Math.random()*255);
    green = (int)(Math.random()*255);
    blue = (int)(Math.random()*255);
    Color endColor = new Color(red, green, blue);

    GradientPaint gradient = new GradientPaint(70,70,startColor, 150,150,endColor);
    g2d.setPaint(gradient);
    g2d.fillRect(50,50,80,100);
    g2d.fillOval(100,80,100,100);
    g2d.drawLine(10,130,290,130);

}
}
