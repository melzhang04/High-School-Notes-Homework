
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;    //Scanner, Arrays
import javax.swing.*;  //JFrame, JPanel, JButton, JTextBox, JLabel 
import java.awt.*;   //Dimension, Color, Font
import java.awt.event.*; //ActionListener, ActionEvent
public class GUI
{
    private JFrame frame;
    private JButton zero, one, two, three, four, five, six, seven, eight, nine, Yes, No;
    private JButton[] button;
    private JLabel lab;
    private JTextField text;
    public GUI()
    {
        JFrame frame = new JFrame("GUESSING GAME");
        frame.setSize(600,500);
        frame.setVisible(true);
    }
    public void createButtons()
    {
        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        Yes = new JButton("Yes");
        No = new JButton("No");
        button = new JButton[11];
        button[0] = zero;
        button[1] = one;
        button[2] = two;
        button[3] = three;
        button[4] = four;
        button[5] = five;
        button[6] = six;
        button[7] = seven;
        button[8] = eight;
        button[9] = nine;
        button[10] = Yes;
        button[11] = No;
        //int[] values = {0,1,2,3,4,5,6,7,8,9};
    }
    public void createTextField()
    {
      text = new JTextField(30);
    }
     public void addListeners()
    {
        for(JButton b: button)
        {
            b.addActionListener(this);
        }
    }
    public static int numbers(JButton[] button, int[] values)
    {
        int correct = (int)(Math.random()*9)+1;
        for(int i = 0; i<11; i++)
        {
            //if(correct == b.gettext[i)
            //{
                
            //}
        }
        return 0;
    }
    public void formatButtons()
    {
        for(JButton b: button)
        {
            b.setBackground(new Color(0,0,255));
            b.setFont(new Font("Oswald", 1,15));
        }
    }
    public void action(ActionEvent e)
    {
        if(e.getSource() == one)
        {
            System.out.println("You clicked number 1");
        }
    }
}
