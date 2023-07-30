/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ipcutter;

/**
 *
 * @author BMT
 */
public class Ipcutter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String address = "163.121.12.30";
        
        System.out.println("Before Split: "+ address);
        String[] split_array = address.split("\\.");
        
        for(int i =0; i<split_array.length; i++){
            
            System.out.println(split_array[i]);
        }
    }
    
}
