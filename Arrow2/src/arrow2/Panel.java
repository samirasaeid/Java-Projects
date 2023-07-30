/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrow2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicComboBoxUI.KeyHandler;

/**
 *
 * @author BMT
 */
public class Panel extends JPanel {
   
    int x=10;
    int y=10;
    int code;
    Panel(){
        this.setFocusable(true);
        this.setBackground(Color.CYAN);
        this.addKeyListener{new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
            int code = e.getKeyCode();
            System.out.println("Key code "+code);
            switch(code){
                case KeyEvent.VK_UP:{
                    
                        y-=5;
                    
                     break;//}
                }  
                 
                case KeyEvent.VK_DOWN:
               
                        y+=5;
                     
                     break;
                 
                   
                    
                case KeyEvent.VK_LEFT:
                    x-=5;
                    
                    break;
                    
                case KeyEvent.VK_RIGHT:
                    x+=5;
                   
                    break;
            }
           
        }

    
             updateUI();  
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        };
}            
                
            
        
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
       
        
        g.setColor(Color.black);
        g.drawString("Hello Java", 150, 150);
        if(x>=this.getWidth()){
            x=0;
        }
        else if(x<0){
            x=this.getwidth();
        }

}
}

}
   