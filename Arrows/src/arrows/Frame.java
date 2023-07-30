/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrows;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicArrowButton;

/**
 *
 * @author BMT
 */
public class Frame extends JFrame {
    int x=50;
    int y=50;

   
   
    Panel p = new Panel();
    listener l2 = new listener();
    BasicArrowButton b1 = new BasicArrowButton(BasicArrowButton.EAST);
    BasicArrowButton b2 = new BasicArrowButton(BasicArrowButton.NORTH);
    BasicArrowButton b3 = new BasicArrowButton(BasicArrowButton.SOUTH);
    BasicArrowButton b4 = new BasicArrowButton(BasicArrowButton.WEST);
    JLabel l1 = new JLabel("Hello Java");
    
    Frame(){
        
        this.setTitle("Arrow Keys");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(new GridLayout());
        this.add(p);
        p.setLayout(null);
        this.setFocusable(true);
//        b1.setBounds(210, 130, 50, 50);
//        p.add(b1);
//        b2.setBounds(160, 80, 50, 50);
//        p.add(b2);
//        b3.setBounds(160, 180, 50, 50);
//        p.add(b3);
//        b4.setBounds(110, 130, 50, 50);
//        p.add(b4);
        l1.setBounds(x, y, 90, 20);
        if(x>this.getWidth()){
            x=-x;
        }
        else if(y>=this.getHeight()){
            y=-y;
            
        }
        else if(x<0){
            x=this.getWidth();
        }
        else if(y<0){
        y=this.getHeight();
        }
        
        p.add(l1);
        this.addKeyListener(l2);
        setFocusable(true);
        setFocusTraversalKeysEnabled(true);
//        

        
        
    } 
       private class listener implements KeyListener{

        

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            System.out.println("Key code "+code);
            switch(code){
                case KeyEvent.VK_UP:{
                    //if(y>Frame.this.getHeight()){
                       // y=0;
                    //}else{ 
                        y-=5;
                     l1.setBounds(x, y, 90, 20);
                     break;//}
                }  
                 
                case KeyEvent.VK_DOWN:
               // {if(y<0){
                       // y=Frame.this.getHeight();
                    //}
                  //  else{ 
                        y+=5;
                     l1.setBounds(x, y, 90, 20);
                     break;
                   // }}
                   
                    
                case KeyEvent.VK_LEFT:
                    x-=5;
                    l1.setBounds(x, y, 90, 20);
                    break;
                    
                case KeyEvent.VK_RIGHT:
                    x+=5;
                    l1.setBounds(x, y, 90, 20);
                    break;
            }
           
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
           
       
       
       }
       
         
    }
    

