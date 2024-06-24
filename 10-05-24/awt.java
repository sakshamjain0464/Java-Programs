import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class awt {
    public static void main(String[] args){

        Frame frame = new Frame("Example 2");

        Button button = new Button("Click Here");

        button.setBounds(80, 100, 64, 30);

        frame.add(button);

        
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);

        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
    }
}