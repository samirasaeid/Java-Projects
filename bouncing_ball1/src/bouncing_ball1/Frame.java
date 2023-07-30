/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bouncing_ball1;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author BMT
 */
public class Frame extends JFrame {
    
    Panel p =new Panel(); 
    
    public Frame (){
        
        this.setTitle("Bouncing_Ball");
        this.setSize(400,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        p.setBackground(Color.black);
        this.add(p);
        
    
    }
    
}
