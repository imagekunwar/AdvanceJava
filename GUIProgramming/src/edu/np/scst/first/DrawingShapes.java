
package edu.np.scst.first;
import javax.swing.*;
import java.awt.*;


public class DrawingShapes extends JFrame {
    
  DrawingShapes(){  
      // anoymous inner class
      
      JPanel jPanel= new JPanel(){
          @Override
          public void paint(Graphics g){
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
    
    
    add(jPanel);
    setVisible(true);
    setSize(400,400);
    setTitle("DrawingShapes");
    setDefaultCloseOperation(3);
}
          
public static void main(String[]args){
    DrawingShapes d= new DrawingShapes();
}   

}


