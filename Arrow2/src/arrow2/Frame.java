/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrow2;

import java.awt.GridLayout;
import javax.swing.JFrame;

/**
 *
 * @author BMT
 */
public class Frame extends JFrame {
    
    Panel p = new Panel();
    
    
    Frame(){
        
        this.setTitle("Arrow Keys");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(new GridLayout());
        this.add(p);
    
    }
}
