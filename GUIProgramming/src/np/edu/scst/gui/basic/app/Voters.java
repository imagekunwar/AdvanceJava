
package np.edu.scst.gui.basic.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Voters extends JFrame {
    Voters(){
        
        JLabel jLabel= new JLabel("Enter the age of voter");
        JTextField jTextField= new JTextField(10);
        
        JButton jButton= new JButton("Submit");
        JTextField jTextField2=new JTextField("****",20);
        
        jButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                
                    String age= jTextField.getText();
                    int eligible=Integer.valueOf(age);
                    
                    if(eligible>18){
                        jTextField2.setText("eligible to vote");}
                
                        else {
                                jTextField2.setText("not eligible to vote");
                                }
                    }
                    
             

           
        });
        
        add(jLabel);
        add(jTextField);
        add(jButton);
        add(jTextField2);
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setTitle("Eligible Voters Check");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        Voters v=new Voters();
    }
    
}
