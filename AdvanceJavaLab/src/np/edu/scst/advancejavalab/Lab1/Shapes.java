
package np.edu.scst.advancejavalab.Lab1;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

public class Shapes extends JFrame {
    Shapes(){
        JPanel jPanel=new JPanel(){
        @Override
        public void paint(Graphics g){
            Graphics2D g2=(Graphics2D)g;
            
            int x[]={0,90,180,90,180};
            int y[]={90,180,90,0,180};
            g2.drawPolygon(x,y,3);
                    
             
            
            
            
            
            
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
