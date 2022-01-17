
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
              
              g2.drawLine(10, 10, 40, 40);
              g2.drawRect(50,10,30,50);
              g2.drawOval(70,70,55,55);
              g2.drawRect(180,180,180,180);
              g2.drawOval(10,90,50,30);
              g2.drawArc(95,95,190,190,0,90);
              
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


