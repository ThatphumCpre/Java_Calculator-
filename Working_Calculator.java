import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class Working_Calculator{

    private JTextField display = new JTextField("",10);  //create Text JTextField to collect text like entry
    private String equation = "", operator = "";           //create empty equation
    private String[][] strButton = { {"7","8","9","+"}   //array  of string in Button
                                    ,{"4","5","6","-"}
                                    ,{"1","2","3","x"}
                                    ,{"0",".","=","/"}};
    private String[] strBottomButton = {"Delete","Clear"};
    private float number1, number2, result;
    private int number2_index, operator_index = 0;

    public Working_Calculator(){  //constructor
        drawInterface();    //draw interface

    }

    public static void main(String[] args){
        new Working_Calculator();  //instance object
    }

    public  void drawInterface(){

        JFrame frame = new JFrame("Calculator");   //create window title="Calculator"
        JButton[][] button = new JButton[4][4];
        JButton[] bottomButton = new JButton[2];

        for(int i=0; i<4; i++){
            for(int j=0; j<4;j++){
                button[i][j] = new JButton(strButton[i][j]); //instance button in array obj 2 dimensional
                button[i][j].setBounds(10+110*j,120+50*i,100,40);
                button[i][j].setActionCommand(strButton[i][j]); //set attribute as strButton
                button[i][j].addActionListener(new ButtonClickListener());  //set Event Handling
                frame.add(button[i][j]); //add to window , frame
            }
        }

        for(int k=0; k<2; k++){
            bottomButton[k] = new JButton(strBottomButton[k]);  //instance btm button in array obj
            bottomButton[k].setBounds(10+220*k,320,210,40);     //place and shift space
            bottomButton[k].setActionCommand(strBottomButton[k]); //sett attribut each strBottomButton
            bottomButton[k].addActionListener(new ButtonClickListener()); //set Event Handling
            frame.add(bottomButton[k]);  //add to window, frame
        }

            
        display.setBounds(10,10,430,100);  //setposition of displayer
        display.setEditable(false);         //set text field can't edit with keyboard
        display.setFont(new Font("Calibri", Font.PLAIN, 50));  //set font size
        display.setHorizontalAlignment(JTextField.RIGHT);  //set allight as right side

        frame.add(display);  //add displayer to window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set close need to shut down frame only
        frame.setSize(450,400);  //set size of window
        frame.setLayout(null);
        frame.setVisible(true);  //display window
    }

    public boolean checkOperator(){
        if (equation.length() > 0){
            if (equation.indexOf("+") != -1){
                operator_index = equation.indexOf("+");
                return true;
            }
            else if (equation.indexOf("-") != -1){
                operator_index = equation.indexOf("-");
                return true;
            }
            else if (equation.indexOf("x") != -1){
                operator_index = equation.indexOf("x");
                return true;
            }
            else if (equation.indexOf("/") != -1){
                operator_index = equation.indexOf("/");
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }

    public float Calculate(){
        number2 = Float.parseFloat(equation.substring(number2_index));
        
        if (operator == "+"){
            result = number1 + number2;
            number2 = 0;
            return  result;
        }
        else if (operator == "-"){
            result = number1 - number2;
            number2 = 0;
            return  result;
        }
        else if (operator == "*"){
            result = number1 * number2;
            number2 = 0;
            return  result;
        }
        else{
            result = number1 / number2;
            number2 = 0;
            return  result;
        }
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
            else if (input == "+"){
                if (equation != ""){
                    if (!checkOperator()){
                        number1 = Float.parseFloat(equation);
                        equation = equation + input;
                        number2_index = equation.indexOf("+") + 1;
                        operator = "+";
                        display.setText(equation);
                    }
                    else{
                        if (operator_index == (equation.length() - 1)){
                            equation = equation.substring(0,equation.length()-1);
                            number1 =  Float.parseFloat(equation);
                            equation = equation + input;
                            number2_index = equation.indexOf("+") + 1;
                            operator = "+";
                            display.setText(equation);
                        }
                    }
                }
            }
            else if (input == "-"){
                if (equation != ""){
                    if (!checkOperator()){
                        number1 = Float.parseFloat(equation);
                        equation = equation + input;
                        number2_index = equation.indexOf("-") + 1;
                        operator = "-";
                        display.setText(equation);
                    }
                    else{
                        if (operator_index == (equation.length() - 1)){
                            equation = equation.substring(0,equation.length()-1);
                            number1 =  Float.parseFloat(equation);
                            equation = equation + input;
                            number2_index = equation.indexOf("-") + 1;
                            operator = "-";
                            display.setText(equation);
                        }
                    }
                }
            }
            else if (input == "x"){
                if (equation != ""){
                    if (!checkOperator()){
                        number1 = Float.parseFloat(equation);
                        equation = equation + input;
                        number2_index = equation.indexOf("x") + 1;
                        operator = "*";
                        display.setText(equation);
                    }
                    else{
                        if (operator_index == (equation.length() - 1)){
                            equation = equation.substring(0,equation.length()-1);
                            number1 =  Float.parseFloat(equation);
                            equation = equation + input;
                            number2_index = equation.indexOf("x") + 1;
                            operator = "*";
                            display.setText(equation);
                        }
                    }
                }
            }
            else if (input == "/"){
                if (equation != ""){
                    if (!checkOperator()){
                        number1 = Float.parseFloat(equation);
                        equation = equation + input;
                        number2_index = equation.indexOf("/") + 1;
                        operator = "/";
                        display.setText(equation);
                    }
                    else{
                        if (operator_index == (equation.length() - 1)){
                            equation = equation.substring(0,equation.length()-1);
                            number1 =  Float.parseFloat(equation);
                            equation = equation + input;
                            number2_index = equation.indexOf("/") + 1;
                            operator = "/";
                            display.setText(equation);
                        }
                    }
                }
            }
            else if (input == "="){
                if (equation != ""){
                    equation = Float.toString(Calculate());
                    display.setText(equation);
                }
            }
            else {
                equation = equation + input;  //Add Char to equation
                display.setText(equation);
            }
        }
    }


}
