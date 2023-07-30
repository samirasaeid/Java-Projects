/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package increase_decrease;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author BMT
 */
public class Frame extends JFrame {
    
    int x;
    Panel p = new Panel();
    
    JButton b1 = new JButton("++");
    JButton b2 = new JButton("--");
    JLabel l1 = new JLabel("x ="+x);
    vn v = new vn();
    
    
           
    Frame (){
        
        this.setTitle("INCREASE||DECREASE");
        this.setSize(300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(new GridLayout());
        this.add(p);
        p.setLayout(null);
        b1.setBounds(40, 40,50,50);
        p.add(b1);
        b2.setBounds(180, 40,50,50);
        p.add(b2);
        
        l1.setBounds(120, 90,50,50);
        l1.setForeground(Color.red);
        //l1.setFont(font);
        p.add(l1);
        
        b1.addActionListener(v);
        b2.addActionListener(v);
        
    }
    
    private class vn implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()==b1){
            
                x++;
            l1.setText("x = "+" "+x);
            if(x==10)    x=0;
            
            //System.out.println("x= "+x);
            //updateUI();
            }
            if(e.getSource()==b2){
                if(x>0&&x<=10){
            x--;
            l1.setText("x = "+" "+x);}
            
            }
            
        }
    
    
    }
    
    
}
