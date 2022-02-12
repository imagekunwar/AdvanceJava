
package np.edu.scst.gui.basic.app;
import javax.swing.*;
import java.awt.*;

public class Palindrome extends JFrame{
    
    Palindrome()
    {
        JLabel jLabel=new JLabel("Enter the number");
        JTextField jTextField=new JTextField("*");
        JButton jButton=new JButton("Result");
        
        new
        add(jLabel);
        add(jTextField);
        add(jButton);
        
        
        
        
        
        
        setVisible(true);
        setSize(450,450);
        setTitle("Palindrome Check");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
        
        
        
        
    }
    
    public static void main(String[]args){
        Palindrome p=new Palindrome();
    }
    
}
