
package np.edu.scst.gui.eventhandling;
import javax.swing.*;
import java.awt.*;
import java.awt.event;

public class AdapterDemo extends JFrame {
    AdapterDemo(){
        JButton jButton=new JButton("Click me");
        jButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseclicked(MouseEvent e){
                System.out.println("The mouse was clicked");
                        
            }
       
          });
        add(jButton);
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(3);
                
    public static void main(String[]args){
        new AdapterDemo();
    }
    
}
