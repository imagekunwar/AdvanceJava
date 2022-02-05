
package np.edu.scst.gui.eventhandling;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionEventPro extends JFrame {
    ActionEventPro(){
    
    JButton jButton=new JButton("Button 1");
    JButton jButton2=new JButton("Button 2");
    JButton jButton3=new JButton("Button 3");
    
    jButton.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button 1 is clicked");
            

        }});
        jButton2.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button 2 is clicked");
        }
    });
        
        jButton3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("Button 3 is clicked");
            }
        
            
        });
        
            setLayout(new FlowLayout());
    
            add(jButton);
            add(jButton2);
            add(jButton3);
            
            
            
            
            setVisible(true);
            setSize(400,400);
            setTitle("Event Handling Ampmupis Inner Class");
            setDefaultCloseOperation(3);
            public static void main(String[]mains){
                new ActionEventPro();
            }
    
}
