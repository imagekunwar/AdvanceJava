
package advancejavalab.Lab1;
import javax.swing.*;

public class HelloWorld extends JFrame{
    HelloWorld(){
        JPanel jPannel=new JPanel();
        JLabel jLabel=new JLabel("Hello World");
        setBackground(jPannel.Black);
        
        
        
        
        
        add(jPannel);
        jPannel.add(jLabel);
        setVisible(true);
        setSize(400,400);
        setTitle("Hello World");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        HelloWorld hw=new HelloWorld();
        
    }
    
}
