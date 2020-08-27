import javax.swing.*;


public class Calculator{
    public static void main(String[] args){
        drawInterface();
    }

    public static void drawInterface(){
        JFrame frame = new JFrame();

        JButton button = new JButton("Click");
        button.setBounds(130,100,100,40);

        frame.add(button);

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}
