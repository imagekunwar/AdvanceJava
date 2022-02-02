
package np.edu.scst.gui.basic.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Voters extends JFrame {
    Voters(){
        
        JLabel jLabel= new JLabel("Enter the age of voter");
        JTextField jTextField= new JTextField(10);
        
        JButton jButton= new JButton("Submit");
        
        jButton.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent e) {
                try{
                    if(int age>18){
                        System.out.println("eligible to vote");
                
                        else{
                                System.out.println("not eligible to vote");
                                }
                    }
                    
                }
                catch(Exception ex){
                    System.out.println("Invalid Number");
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        add(jLabel);
        add(jTextField);
        add(jButton);
        
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
