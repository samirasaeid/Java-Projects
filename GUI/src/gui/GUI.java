/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gui;

import java.awt.Color;
import java.awt.Font;
 import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
 import java.util.Date;
 import javax.swing.JPanel;
 import javax.swing.JFrame;
 
 class MyPanel extends JPanel{
     
     public MyPanel(){
         this.setBackground(Color.cyan);
     }
     
     @Override
     public void paintComponent(Graphics g){
         super.paintComponent(g);
         
         g.drawString(new Date().toLocaleString(),100,100);
     }
 
 }

    class FontList extends JPanel{
        
        @Override
        public void paint(Graphics g){
           String [] families =Toolkit.getDefaultToolkit().getFontList();
            
          //String [] families =GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
            
            for(int f = 0; f<families.length; f++){ 
                Font font = new Font(families[f], Font.BOLD, 18);
                g.setFont(font);
                String name = families[f];
                g.drawString("samira", 20, (f*2+1)*20);
            }
        }

    }
  
public class GUI {
    
    public static void main(String[] args) {
        JFrame f = new JFrame();
        
        f.setTitle("MY Frame");
        MyPanel mp = new MyPanel();
        f.setContentPane(mp);
        FontList font = new FontList();
        f.setContentPane(font);
        f.setSize(500, 300);
        f.setVisible(true);
    }
    
}
