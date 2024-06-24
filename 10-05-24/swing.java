import java.io.*;
import javax.swing.*;

class swing {
 
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
 
        JButton button = new JButton("Click Here");
 
        button.setBounds(15, 20, 80, 50);
 
        frame.add(button);

        frame.setSize(200, 300);
 
        frame.setLayout(null);

        frame.setVisible(true);
    }
}