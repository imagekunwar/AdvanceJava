
package edu.np.scst.first;
import javax.swing.*;

public class DisplayingImage extends JFrame{
    DisplayingImage(){
        ImageIcon image= new ImageIcon("img.png");
        JPanel jPanel=new JPanel();
        
        JLabel jLabel=new JLabel(image);
        
        
        add(jPanel);
        jPanel.add(jLabel);
        
        
        
        setVisible(true);
        setSize(450,450);
        setTitle("Displaying Image");
        setDefaultCloseOperation(3);
    }
    
    
    public static void main(String[]args){
        DisplayingImage d=new DisplayingImage();
    }
    
}
