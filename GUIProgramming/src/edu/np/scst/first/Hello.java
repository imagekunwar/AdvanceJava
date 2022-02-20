package edu.np.scst.first;
import java.awt.FlowLayout;
import javax.swing.*;

public class Hello extends JFrame{
    
    public Hello(){
       // JPanel jPanel = new JPanel();
        //jPanel.setBackground(Color.red);
        JLabel jLabel=new JLabel("Hello World");
        JLabel jLabel1=new JLabel("Hello World");
        
        setLayout(new FlowLayout());
        add(jLabel);
        add(jLabel1);
        setVisible(true);
//        setDefaultCloseOperation(3);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250,150);
        setTitle("Hello world");
    }
    
    //psvm tab
    public static void main(String[] args) {
       Hello h = new Hello(); 
    }
}
