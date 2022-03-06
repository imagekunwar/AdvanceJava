
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
            
            
//           /? public void paint(Graphics g){
              Graphics2D g2=(Graphics2D)g;//typecast
              
              Color c=new Color(0,255,255);
              g2.setColor(c);
              Color red=new Color(255,0,0);
              g2.setPaint(red);
              
              g2.drawLine(10, 10, 40, 40);
              g2.drawRect(50,10,30,50);
              g2.drawOval(70,70,55,55);
              g2.drawRect(180,180,180,180);
              g2.drawOval(10,90,50,30);
            //g2.drawArc(95,95,190,190,0,90);
            g2.fillArc(95,95,190,190,0,90);
              
              int[]x={200,400,800};
              int[]y={200,500,300};
              g2.drawPolygon(x, y,3);
              
                    
             
            
            
            
            
            
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
