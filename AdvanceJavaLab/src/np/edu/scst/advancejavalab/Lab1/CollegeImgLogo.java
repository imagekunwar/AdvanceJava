
package np.edu.scst.advancejavalab.Lab1;
import javax.swing.*;

public class CollegeImgLogo extends JFrame {
    CollegeImgLogo(){
        
        ImageIcon image=new ImageIcon("sagarmatha.jpg");
        JLabel jLabel=new JLabel(image);
        
        add(jLabel);
        
        
        
        setVisible(true);
        setSize(400,400);
        setTitle("Image on Java Swing background");
        setDefaultCloseOperation(3);
        
    }
    
    
    public static void main(String[]args){
        CollegeImgLogo cg=new CollegeImgLogo();
    }
    
}
