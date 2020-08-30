import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class Calculator{

    private JTextField display = new JTextField("5",10);  //create Text JTextField to collect text like entry
    private String equation = "";           //create empty equation

    public Calculator(){  //constructor
        drawInterface();    //draw interface

    }
    public static void main(String[] args){
        new Calculator();  //instance object
    }

    public  void drawInterface(){

        JFrame frame = new JFrame("Calculator");   //create window title="Calculator"

        JButton button1 = new JButton("1");  //create button1 has text in button as  "1"
        button1.setBounds(10,120,100,40);
        button1.setActionCommand("1");  //set attribute getActionCommand="1"
        button1.addActionListener(new ButtonClickListener());  //set Event Handle

        JButton button2 = new JButton("2");
        button2.setBounds(120,120,100,40);
        button2.setActionCommand("2");
        button2.addActionListener(new ButtonClickListener());

        JButton button3 = new JButton("3");
        button3.setBounds(120+110,120,100,40);
        button3.setActionCommand("3");
        button3.addActionListener(new ButtonClickListener());

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(120+220,120,100,40);

        JButton button4 = new JButton("4");
        button4.setBounds(10,120+50,100,40);
        button4.setActionCommand("4");
        button4.addActionListener(new ButtonClickListener());

        JButton button5 = new JButton("5");
        button5.setBounds(120,120+50,100,40);
        button5.setActionCommand("5");
        button5.addActionListener(new ButtonClickListener());

        JButton button6 = new JButton("6");
        button6.setBounds(120+110,120+50,100,40);
        button6.setActionCommand("6");
        button6.addActionListener(new ButtonClickListener());

        JButton button7 = new JButton("7");
        button7.setBounds(10,120+100,100,40);
        button7.setActionCommand("7");
        button7.addActionListener(new ButtonClickListener());

        JButton button8 = new JButton("8");
        button8.setBounds(120,120+100,100,40);
        button8.setActionCommand("8");
        button8.addActionListener(new ButtonClickListener());

        JButton button9 = new JButton("9");
        button9.setBounds(230,120+100,100,40);
        button9.setActionCommand("9");
        button9.addActionListener(new ButtonClickListener());

        JButton button0 = new JButton("0");
        button0.setBounds(10,120+150,100,40);
        button0.setActionCommand("0");
        button0.addActionListener(new ButtonClickListener());

        JButton buttonDot = new JButton(".");
        buttonDot.setBounds(120,120+150,100,40);
        buttonDot.setActionCommand(".");
        buttonDot.addActionListener(new ButtonClickListener());

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(120+110,120+150,100,40);
        buttonEqual.setBackground(Color.BLUE); //set blue color

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(120+220,120+150,100,40);

        JButton buttonMultiply = new JButton("x");
        buttonMultiply.setBounds(340,120+100,100,40);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(120+220,120+50,100,40);

        JButton buttonDelete = new JButton("<--");
        buttonDelete.setBounds(10,320,210,40);
        buttonDelete.setActionCommand("Delete");
        buttonDelete.addActionListener(new ButtonClickListener());

        JButton buttonClear = new JButton("CE");
        buttonClear.setBounds(230,320,210,40);
        buttonClear.setActionCommand("Clear");
        buttonClear.addActionListener(new ButtonClickListener());

        display.setBounds(10,10,430,100);  //setposition of displayer
        display.setEditable(false);         //set text field can't edit with keyboard
        display.setFont(new Font("Calibri", Font.PLAIN, 50));  //set font size
        display.setHorizontalAlignment(JTextField.RIGHT);  //set allight as right side

        frame.add(buttonDelete);  // add all button in to window
        frame.add(buttonClear);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button0);
        frame.add(buttonDivide);
        frame.add(buttonDot);
        frame.add(buttonEqual);
        frame.add(buttonMinus);
        frame.add(buttonMultiply);
        frame.add(buttonPlus);
        frame.add(display);  //add displayer to window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set close need to shut down frame only
        frame.setSize(450,400);  //set size of window
        frame.setLayout(null);
        frame.setVisible(true);  //display window

    }
    private class ButtonClickListener implements ActionListener{
       public void actionPerformed(ActionEvent e) { //overide method 
          String input = e.getActionCommand(); //read getActionCommand attribute
          if (input == "Delete") {          //if Delete Button Active
              equation = equation.substring(0,equation.length()-1); // delete last char equations
              display.setText(equation); //set value to displayer
          }
          else if (input == "Clear"){  //if Clear Button Active
              equation = "";        //Clear Enrty
              display.setText(equation);
          }
          else {
          equation = equation + input;  //Add Char to equation
          display.setText(equation);
          }
       }
    }


}
