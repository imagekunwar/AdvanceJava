
package edu.np.scst.first;
import javax.swing.JFrame;


public class GuiFirst extends JFrame{
    
    public GuiFirst(){
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);// (width, height)
        setTitle("JavaSwing");
        
    }
    
    public static void main(String[] args){
        GuiFirst g= new GuiFirst();
        
    }
    
}
