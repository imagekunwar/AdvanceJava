
package np.edu.scst.gui.eventhandling;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyboardEventsDemo extends JFrame {
    KeyboardEventsDemo(){
        JTextField jTextField=new JTextField(20);
        JTextField jTextField2=new JTextField(20);
        
        jTextField.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("The keyboard key is typed");
            
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("The keyboard key is pressed");
            }
            

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("The keyboard key is released");
            }
        });
        add(jTextField);
        add(jTextField2);
        
    setLayout(new FloatLayout);    
    setVisible(true);
    setSize(450,450);
    setTitle("Keyboard Events");
    setDefaultCloseOperation(3);
    }
    
    public static void main(String[]args){
        KeyboardEventsDemo k=new KeyboardEventsDemo();
    }
    
}
