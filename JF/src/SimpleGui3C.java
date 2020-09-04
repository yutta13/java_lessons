import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui3C{
    JFrame frame;
    JLabel label;
    JButton colorButton;
    JButton labelButton;

    public static void main(String[] args) {

        SimpleGui3C gui = new SimpleGui3C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        label = new JLabel("Im a lable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        colorButton = new JButton("Change color");
        labelButton = new JButton("Change label");

        colorButton.addActionListener(new ColorListener());
        labelButton.addActionListener(new LabelListener());

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
        frame.getContentPane().add(BorderLayout.EAST, labelButton);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    class LabelListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            label.setText("Ouch!");
        }
    }
    class ColorListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            frame.repaint();
        }
    }

}

