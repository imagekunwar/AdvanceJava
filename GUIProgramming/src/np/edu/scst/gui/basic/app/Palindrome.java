
package np.edu.scst.gui.basic.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;

public class Palindrome extends JFrame{
    
    Palindrome()
    {
        JLabel jLabel=new JLabel("Enter the number");
        JTextField jTextField=new JTextField(20);
        JButton jButton=new JButton("Check for palindrome");
        JLabel jLabel1=new JLabel("*");
        
        jButton.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                String input=jTextField.getText();
                if(isPalindrome(input)){
                    jLabel.setText("It is palindrome");
                }else{
                    jLabel.setText("It is not palindrome");
                }
            }
        });
        
        add(jLabel);
        add(jTextField);
        add(jButton);
        add(jLabel1);
        
        
        
        
        
        
        setVisible(true);
        setSize(450,450);
        setTitle("Palindrome Check");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        public boolean isPalindrome(String str){
            StringBuilder temp=new StringBuilder(str);
            temp=temp.reverse();
            return str.equals(temp.toString());
        }
    
    public static void main(String[]args){
        Palindrome p=new Palindrome();
    }
    
}
