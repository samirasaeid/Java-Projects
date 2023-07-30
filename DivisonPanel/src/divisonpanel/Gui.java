/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package divisonpanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author BMT
 */
public class Gui extends JFrame {
    
    JPanel b1 = new JPanel();
    JPanel b2 = new JPanel();
    JTextField t1 = new JTextField();
    JButton p1 = new JButton(" 1 ");
    JButton p2 = new JButton(" 2 ");
    JButton p3 = new JButton(" 3 ");
    JButton p4 = new JButton(" 4 ");
    JButton p5 = new JButton(" 5 ");
    JButton p6 = new JButton(" 6 ");
    JButton p7 = new JButton(" 7 ");
    JButton p8 = new JButton(" 8 ");
    JButton p9 = new JButton(" 9 ");
    JButton p10 = new JButton(" 0");
    JButton p11 = new JButton(" + ");
    JButton p12 = new JButton(" - ");
    
    
    public Gui(){
        this.setTitle("Panel");
        this.setSize(300,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(new GridLayout(2,1));
        this.add(b1);
        b1.setBackground(Color.GRAY);
        //b1.add(t1);
        //b1.setLayout(new BorderLayout());
        //b1.add(t1,BorderLayout.CENTER);
        b1.setLayout(null);
        t1.setBounds(50, 100, 150, 30);
        b1.add(t1);
        
        b2.setLayout(new GridLayout(3,4,2,2));
        this.add(b2);
        b2.setBackground(Color.blue);
        b2.add(p1);b2.add(p2);b2.add(p3);b2.add(p4);b2.add(p5);
        b2.add(p6);b2.add(p7);b2.add(p8);b2.add(p9);b2.add(p10);
        b2.add(p11);b2.add(p12);
        p1.setBackground(Color.BLACK);
        p1.setForeground(Color.white);
        p2.setBackground(Color.BLACK);
        p2.setForeground(Color.white);
        p3.setBackground(Color.BLACK);
        p3.setForeground(Color.white);
        p4.setBackground(Color.BLACK);
        p4.setForeground(Color.white);
        p5.setBackground(Color.BLACK);
        p5.setForeground(Color.white);
        p6.setBackground(Color.BLACK);
        p6.setForeground(Color.white);
        p7.setBackground(Color.BLACK);
        p7.setForeground(Color.white);
        p8.setBackground(Color.BLACK);
        p8.setForeground(Color.white);
        p9.setBackground(Color.BLACK);
        p9.setForeground(Color.white);
        p10.setBackground(Color.BLACK);
        p10.setForeground(Color.white);
        p11.setBackground(Color.BLACK);
        p11.setForeground(Color.white);
        p12.setBackground(Color.BLACK);
        p12.setForeground(Color.white);
        
        
        
        
        
    
    
    }
    
    
}
