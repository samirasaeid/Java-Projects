/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bouncing_ball;

import javax.swing.JFrame;


public class Bouncing_ball {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame f = new JFrame();
        
        f.setTitle("bouncing ball");
        Ball b = new Ball();
        f.getContentPane().add(b);
        f.setSize(600,600);
        f.setVisible(true);
    }
    
}
