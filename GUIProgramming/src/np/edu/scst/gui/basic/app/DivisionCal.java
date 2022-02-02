
package np.edu.scst.gui.basic.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DivisionCal extends JFrame {
    DivisionCal(){
        JLabel jLabel= new JLabel("Numerator");
        JTextField jTextField=new JTextField(15);
        JLabel jLabel1= new JLabel("Denomenator");
        JTextField jTextField1= new JTextField(15);
        JButton jButton=new JButton("Divide");
        JLabel jLabel2=new JLabel("Result");
        JTextField jTextField2= new JTextField("*",15);
        
        jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                
                 String val1=jTextField.getText();
                 String val2=jTextField1.getText();
                 int a=Integer.valueOf(val1);
                 int b=Integer.valueOf(val2);
                 
                 int result=a/b;
                 jTextField2.setText(result+"");
                }
                catch(Exception ex){
                    System.out.println("Cannot divide by zeor try again"+ex);
                }
                       
                 
                
            }
            
        });
        
        add(jLabel);
        add(jTextField);
        add(jLabel1);
        add(jTextField1);
        add(jButton);
        add(jLabel2);
        add(jTextField2);
        
                
        
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setTitle("Division Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[]args){
        DivisionCal d =new DivisionCal();
    }
    
}
