
/**
 * Write a description of class TestFrams here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;    //Scanner, Arrays
import javax.swing.*;  //JFrame, JPanel, JButton, JTextBox, JLabel 
import java.awt.*;   //Dimension, Color, Font
import java.awt.event.*; //ActionListener, ActionEvent
public class TestFrams
{
    public TestFrams()
    {
        JFrame f = new JFrame("Hello World ");
        JPanel p = new JPanel();
        JButton b = new JButton("This is my Button");
        JTextField t =new JTextField(25);
        p.add(b);
        p.add(t);
        f.add(p);
        
        f.setSize(1000,500);
        f.setVisible(true);
    }
}
