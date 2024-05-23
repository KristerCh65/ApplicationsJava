/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraphicsObjects;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;

/**
 *
 * @author Krister
 */
public class GreenBullet extends Graphic {
    
    public GreenBullet(int x, int y) {
        super(x, y);
        icon = new ImageIcon(getClass().getResource("/images/green-bullet.png"));
        imgGraphic = icon.getImage();
    }
    
    @Override
    public void move(){
        xCoord += 25;
    }
    
    @Override
    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(imgGraphic, xCoord, yCoord, 80, 110, null);
    }
    
}
