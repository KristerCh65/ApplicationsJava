/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphicsObjects;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Krister
 */
public class Graphic {
    protected Image imgGraphic;
    protected ImageIcon icon;
    protected int xCoord;
    protected int yCoord;
    
    public Graphic(int x, int y){
        xCoord = x;
        yCoord = y;
    }
    
    public void move(){
        xCoord -= 10;
    }
    
    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        if(imgGraphic != null){
            g2.drawImage(imgGraphic, xCoord, yCoord, 80, 100, null);
        }
    }
}
