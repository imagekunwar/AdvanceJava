
package np.edu.scst.gui.basic.app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionCal extends JFrame {
    AdditionCal(){
        JPanel jPanel=new JPanel();
        
        JLabel jLabel= new JLabel("FirstNumber");
        JTextField jTextField=new JTextField(10);
        JLabel jLabel1= new JLabel("SecondNumber");
        JTextField jTextField1=new JTextField(10);
        JLabel jLabel2=new JLabel("Result");
        JTextField jTextField2=new JTextField(10);
        JButton jButton= new JButton("Calculate");
        
        
        
        
                
        
        
        add(jPanel);
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jLabel1);
        jPanel.add(jTextField1);
        jPanel.add(jLabel2);
        jPanel.add(jTextField2);
        jPanel.add(jButton);
        
        jButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String val1=jTextField.getText();
                String val2=jTextField1.getText();
                
                int a=Integer.valueOf(val1);
                int b=Integer.valueOf(val2);
                
               int Result=a+b;
                jTextField2.setText(Result+"");
               
            }
        });
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setTitle("Addition Calculator");
        setDefaultCloseOperation(3);
        
    }
    public static void main(String[]args){
        AdditionCal add=new AdditionCal();
    }
    
}
