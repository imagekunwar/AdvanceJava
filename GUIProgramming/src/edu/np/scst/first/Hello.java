package edu.np.scst.first;
import java.awt.Color;
import javax.swing.*;

public class Hello extends JFrame{
    
    public Hello(){
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.red);
        
        add(jPanel);
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
