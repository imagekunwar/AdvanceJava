
package edu.np.scst.first;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.Font;

public class Fonts extends JFrame {
    
    Fonts(){
        JButton serif= new JButton("serif");
        JButton sanSerif= new JButton("sanSerif");
        JButton dialog= new JButton("Dialog");
        JButton dialogInput= new JButton("Dialog Input");
        JButton monoSpace= new JButton("Monospace");
        
        Font serifFont= new Font(Font.SERIF, Font.BOLD |Font.ITALIC,12);
        Font sanSerifFont= new Font(Font.SANS_SERIF, Font.BOLD | Font.ITALIC, 12);
        Font dialogFont =new Font(Font.DIALOG_INPUT, Font.BOLD | Font.ITALIC, 12);
        Font dialogInputFont= new Font(Font.DIALOG_INPUT, Font. BOLD | Font. ITALIC, 12);
        Font monospaceFont= new Font(Font.MONOSPACED, Font.BOLD | Font. ITALIC,12);
        
        serif.setFont(serifFont);
        sanSerif.setFont(sanSerifFont);
        dialog.setFont(dialogFont);
        dialogInput.setFont(dialogInputFont);
        monoSpace.setFont(monospaceFont);
        
        
        add(serif);
        add(sanSerif);
        add(dialog);
        add(dialogInput);
        add(monoSpace);
        
        
       
        
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(450,450);
        setTitle("Fonts in Java Swing");
        setDefaultCloseOperation(3);
        
    }
    public static void main(String[]args){
        Fonts fo=new Fonts();
    }
}
