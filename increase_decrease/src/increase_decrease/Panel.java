/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package increase_decrease;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class Panel extends JPanel {
    
    int x;
    public Panel(){
        this.setBackground(Color.DARK_GRAY);
        
    }
    
    @Override
            public void paintComponent(Graphics g){
                
                super.paintComponent(g);
                
               // g.setColor(Color.red);
                
               // g.drawString("x= "+x,130,150);
            
            }
    
    
    
    
   
    
}
