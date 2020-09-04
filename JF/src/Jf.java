import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Jf implements ActionListener{
    JButton button;
    public static void main(String[] args) {
        Jf gui = new Jf();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        MyDrawPanel drawPanel = new MyDrawPanel();
        button = new JButton("CLICK");
        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("Beeep");
    }

}
