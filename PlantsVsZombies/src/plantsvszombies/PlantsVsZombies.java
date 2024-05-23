/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plantsvszombies;

import javax.swing.JFrame;

/**
 *
 * @author Krister
 */
public class PlantsVsZombies {

    /**
     * @param args the command line arguments
     */
    
    public PlantsVsZombies(){
        JFrame ventana = new JFrame();
        ventana.add(new VisualManager());
        ventana.setSize(1000,1000);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PlantsVsZombies ventana = new PlantsVsZombies();
    }
    
}
