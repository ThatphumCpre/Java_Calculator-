import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class Calculator{

    JTextField display = new JTextField("5",10);
    public Calculator(){
        drawInterface();

    }
    public static void main(String[] args){
        new Calculator();
    }

    public  void drawInterface(){

        JFrame frame = new JFrame("Calculator");

        JButton button1 = new JButton("1");
        button1.setBounds(10,120,100,40);

        JButton button2 = new JButton("2");
        button2.setBounds(120,120,100,40);

        JButton button3 = new JButton("3");
        button3.setBounds(120+110,120,100,40);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(120+220,120,100,40);

        JButton button4 = new JButton("4");
        button4.setBounds(10,120+50,100,40);

        JButton button5 = new JButton("5");
        button5.setBounds(120,120+50,100,40);

        JButton button6 = new JButton("6");
        button6.setBounds(120+110,120+50,100,40);

        JButton button7 = new JButton("7");
        button7.setBounds(10,120+100,100,40);

        JButton button8 = new JButton("8");
        button8.setBounds(120,120+100,100,40);

        JButton button9 = new JButton("9");
        button9.setBounds(230,120+100,100,40);

        JButton button0 = new JButton("0");
        button0.setBounds(10,120+150,100,40);

        JButton buttonDot = new JButton(".");
        buttonDot.setBounds(120,120+150,100,40);

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(120+110,120+150,100,40);
        buttonEqual.setBackground(Color.BLUE);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(120+220,120+150,100,40);

        JButton buttonMultiply = new JButton("x");
        buttonMultiply.setBounds(340,120+100,100,40);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(120+220,120+50,100,40);

        JButton buttonDelete = new JButton("<--");
        buttonDelete.setBounds(10,320,210,40);

        JButton buttonClear = new JButton("CE");
        buttonClear.setBounds(230,320,210,40);

        display.setBounds(10,10,430,100);
        display.setEditable(false);
        display.setFont(new Font("Calibri", Font.PLAIN, 50));
        display.setHorizontalAlignment(JTextField.RIGHT);

        frame.add(buttonDelete);
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
        frame.add(display);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450,400);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
