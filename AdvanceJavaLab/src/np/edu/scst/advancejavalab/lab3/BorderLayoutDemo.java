
package np.edu.scst.advancejavalab.lab3;
import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame{
    
    BorderLayoutDemo(){
       
        JPanel jPanel=new JPanel();
        JButton jButton1=new JButton("East");
        JButton jButton2=new JButton("West");
        JButton jButton3=new JButton("North");
        JButton jButton4=new JButton("South");
        JButton jButton5=new JButton("Center");
        
        jPanel.setLayout(new BorderLayout(2,3));

        jPanel.add(jButton1,BorderLayout.NORTH);
        jPanel.add(jButton2,BorderLayout.EAST);
        jPanel.add(jButton3,BorderLayout.WEST);
        jPanel.add(jButton4,BorderLayout.SOUTH);
        jPanel.add(jButton5,BorderLayout.CENTER);
        
        
        
                
        add(jPanel);
       setVisible(true);
       setSize(400,400);
       setTitle("Border Layout Demo");
       setDefaultCloseOperation(3);
   } 
    

   public static void main (String[]args){
       
       BorderLayoutDemo bd=new BorderLayoutDemo();
}
}
