
/**
 * Write a description of class GradesGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;    //Scanner, Arrays
import javax.swing.*;  //JFrame, JPanel, JButton, JTextBox, JLabel 
import java.awt.*;   //Dimension, Color, Font
import java.awt.event.*; //ActionListener, ActionEvent

public class GradesGUI implements ActionListener
{
    private JButton avg, getArray, sort, removeZeros;
    private JButton[] buttons;
    private double[] grades;
    private JFrame frame;
    private JPanel fullPanel, topPanel, bottomPanel;
    private JLabel inputGrades, chooseQuery, afterSet;
    private JTextField listOfGrades, output;
    public GradesGUI()
    {
        frame = new JFrame("ARRAY GUI!!!!");
        frame.setSize(600,500);  //(width, height)
        //frame.setResizable(false);

        topPanel = new JPanel();

        //call methods to instantiate all of the variables
        createButtons();
        formatButtons();
        createLabels();
        createTextBoxes();
        addListeners();

        //add all of assets to the JPanel
        loadPanel();

        //add the panel to the JFrame
        frame.add(topPanel);
        //make the Frame visible
        frame.setVisible(true);
        //define what to do with the GUI when close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * in this method, we will add a listener to each button
     * 
     * A user interface listener is a method which is called when the user does something (eg, click a button) 
     * that the programmer has indicated they want to be notified of. 
     * The listener method is passed an event parameter that may tell something about what happeened. 
     * Although events and listeners are used extensively in the user interface, they can have other 
     * sources (eg, a Timer) or in communicating between other parts of a program. 
     */
    public void addListeners()
    {
        for(JButton b: buttons)
        {
            b.addActionListener(this);
        }
    }
    /**
     * This method will instantiate all our our JButton instance variables
     */
    public void createButtons()
    {
        avg = new JButton("Find the Average");
        getArray = new JButton("Click to Add the New Grades");
        sort = new JButton("Sort Your Grades");
        removeZeros = new JButton("Remove All 0s from your grades");

        buttons = new JButton[4];
        buttons[0] = avg;
        buttons[1] = getArray;
        buttons[2] = sort;
        buttons[3] = removeZeros;
    }
    /**
     * This method will instantiate all our our JLabel instance variables
     */

    public void createLabels()
    {
        inputGrades = new JLabel("Add all of your grades seperated by commas");
        chooseQuery = new JLabel("Click the button for the task you want to perform");
        afterSet = new JLabel("Once you set your array, choose from the Following Functions");
        afterSet.setFont(new Font("Copperplate", 5, 20));
    }
    /**
     * This method will instantiate all our our JTextBox instance variables
     */    
    public void createTextBoxes()
    {
        listOfGrades = new JTextField(30);
        output = new JTextField(30);
    }
    /**
     * This method will instantiate all our our JLabel instance variables
     */

    public void loadPanel()
    {
        topPanel.add(inputGrades);
        topPanel.add(listOfGrades);
        topPanel.add(getArray);
        topPanel.add(afterSet);
        topPanel.add(avg);
        topPanel.add(sort);
        topPanel.add(removeZeros);
        topPanel.add(output);
    }

    public void formatButtons()
    {
        for(JButton b: buttons)
        {
            b.setBackground(new Color(235, 14,14));
            b.setFont(new Font("Serif", 1, 15));
        }
        buttons[1].setPreferredSize(new Dimension(400,40));
        buttons[1].setBackground(new Color(200, 50,50));
        buttons[1].setFont(new Font("Copperplate", 1, 20));
    }

    /**
     * In this section, we will write the methods to perform operations on grades
     */
    public double average()
    {
        double sum = 0;
        for(int k=0; k<grades.length; k++)
        {
            sum+=grades[k];
        }
        return sum/grades.length;
    }

    public String noZerosArray()
    {
        int counter = 0;
        for(double d: grades)
        {
            if (d==0.0)
            {
                counter++;
            }
        }
        double[] noZeros = new double[grades.length-counter];
        int spot = 0;
        for (int i = 0; i<grades.length; i++)
        {
            if(grades[i]!=0){
                noZeros[spot] = grades[i];
                spot++;
            }
        }
        double sum = 0;
        for(int k=0; k<noZeros.length; k++)
        {
            sum+=noZeros[k];
        }        
        return "The average of your grades without 0's is " + sum/noZeros.length;
    }

    /**
     * The action performed method define what to do when 
     * the listener alerts that an object has been clicked
     * 
     * The parameter ActionEvent e represents the even that occured
     * e.getSource defines which assets the action occured on
     * 
     * from there we use conditional logic to define what happens when an even occurs
     * 
     */
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == avg)
        {
            output.setText("The average of your grades is: " +String.valueOf(average()));
        }
        else if (e.getSource() == getArray)
        {
            String[] stringGrades = listOfGrades.getText().split("\\s*,\\s*");
            grades = new double[stringGrades.length];
            //System.out.println(Arrays.toString(stringGrades));
            for(int k=0; k<grades.length; k++)
            {
                grades[k] = Double.parseDouble(stringGrades[k]);
            }
            //System.out.println(Arrays.toString(grades));

        }
        else if(e.getSource() ==sort)
        {
            Arrays.sort(grades);
            output.setText(Arrays.toString(grades));
        }
        else if(e.getSource() == removeZeros)
        {
            output.setText(noZerosArray());
        }
    }
}

