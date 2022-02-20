
package np.edu.scst.advancejavalab.Lab1;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class HelloWorld extends JFrame{
    HelloWorld(){
        JPanel jPanel=new JPanel();
        JLabel jLabel=new JLabel("Hello World");
        jPanel.setBackground(Color.Cyne);
        
        
        
        
        
        add(jPanel);
        jPanel.add(jLabel);
        setVisible(true);
        setSize(400,400);
        setTitle("Hello World");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        HelloWorld hw=new HelloWorld();
        
    }
    
}
