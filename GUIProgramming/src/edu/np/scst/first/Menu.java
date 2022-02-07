
package edu.np.scst.first;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame{
    Menu(){
        
        JMenuItem newItem=new JMenuItem("New");
        JMenuItem open=new JMenuItem("Open");
        JMenuItem pdf= new JMenuItem("pdf");
        JMenuItem docs=new JMenuItem("docs");
        
        JMenu file=new JMenu("File");
        JMenu view=new JMenu("View");
        JMenu saveAs=new JMenu("Save As");
        
        JMenuBar jMenuBar=new JMenuBar();
        
        saveAs.add(pdf);
        saveAs.add(docs);
        
        file.add(newItem);
        file.add(open);
        file.add(saveAs);
        
        jMenuBar.add(file);
        jMenuBar.add(view);
        
        
       add(jMenuBar);
       
       setLayout(new FlowLayout());
        
        
        
    setVisible(true);
    setSize(400,400);
    setTitle("Menu in Java Swing");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[]args){
        Menu m=new Menu();
    }
    
}
