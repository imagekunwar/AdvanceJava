
package edu.np.scst.gui.layouts;
import javax.swing.*;
import java.awt.*;

public class LayoutDemo extends JFrame {
    LayoutDemo(){
        
         JLabel jLabel=new JLabel("Labelone");
         JLabel jLabel1=new JLabel("Laveltwo");
         JLabel jLabel2=new JLabel("Lavelthree");
         JLabel jLabel3=new JLabel("Labelfour");
         
         JPanel jPanel=new JPanel();
         jPanel.setLayout(new GridLayout(2,4,10,10));
         add(jPanel);
         jPanel.add(jLabel);
         jPanel.add(jLabel1);
         jPanel.add(jLabel2);
         jPanel.add(jLabel3);
         
         
         
        
        setVisible(true);
        setSize(400,400);
        setTitle("Layouts in JavaSwing");
        setDefaultCloseOperation(3);
        
                
        
    }
    
    public static void main(String[]args){
        LayoutDemo l=new LayoutDemo();
    }
    
}
