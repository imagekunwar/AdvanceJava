
package np.edu.scst.advancejavalab.Lab1;
import java.awt.Graphics;
import javax.swing.*;

public class Shapes extends JFrame {
    Shapes(){
        JPanel jPanel=new JPanel(){
        @Override
        public void paint(Graphics g){
            
            
        }
        };
        
        
        
        
        
        
        setVisible(true);
        setSize(400,400);
        setTitle("Java Swing Shapes");
        setDefaultCloseOperation(3);
    }
    public static void main(String[]args){
        Shapes s=new Shapes();
    }
    
}
