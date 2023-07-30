/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bouncingball2;

import javax.swing.*;


public class Frame extends JFrame {
    
    MyPanel p = new MyPanel();
    
    public Frame(){
    
        this.setTitle("BouncingBall");
        this.setSize(400, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.add(p);
    }
    
    
    
}
