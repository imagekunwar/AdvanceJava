
package edu.np.scst.gui.layouts;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame{
    BorderLayoutDemo(){
        
    JPanel jPanel= new JPanel();
    
    JLabel jLabel=new JLabel("East");
    JLabel jLabel1=new JLabel("West");
    JLabel jLabel2=new JLabel("North");
    JLabel jLabel3=new JLabel("South");
    JLabel jLabel4=new JLabel("Center");
    
    jPanel.setLayout(new BorderLayout());
    jPanel.add(jLabel,BorderLayout.EAST);
    jPanel.add(jLabel1,BorderLayout.WEST);
    jPanel.add(jLabel2,BorderLayout.NORTH);
    jPanel.add(jLabel3,BorderLayout.SOUTH);
    jPanel.add(jLabel4,BorderLayout.CENTER);
    
    
    
    
    
    add(jPanel);
    setVisible(true);
    setSize(500,500);
    setTitle("Border Layout in Swing");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
    
    public static void main(String[]args){
        BorderLayoutDemo b=new BorderLayoutDemo();
    }
}
    
    

