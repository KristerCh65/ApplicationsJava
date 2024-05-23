/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantsvszombies;

import GraphicsObjects.Graphic;
import GraphicsObjects.GreenBullet;
import GraphicsObjects.SilverBullet;
import GraphicsObjects.Zombie;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

/**
 *
 * @author Krister
 */
public class VisualManager extends JPanel {
    
    private ArrayList<Graphic> graphicsList;
    
    public VisualManager(){
        
        setSize(500,500);
        setBackground(Color.WHITE);
        
        graphicsList = new ArrayList<Graphic>();
        
        graphicsList.add(new Zombie(900,10));
        graphicsList.add(new Zombie(850,100));
        graphicsList.add(new Zombie(800,200));
        graphicsList.add(new Zombie(910,300));
        graphicsList.add(new Zombie(920,400));
        graphicsList.add(new Zombie(850,500));
        graphicsList.add(new Zombie(710,600));
        graphicsList.add(new Zombie(860,700));
        graphicsList.add(new Zombie(900,800));
        graphicsList.add(new GreenBullet(10,10));
        graphicsList.add(new GreenBullet(15,50));
        graphicsList.add(new GreenBullet(25,90));
        graphicsList.add(new GreenBullet(5,140));
        graphicsList.add(new GreenBullet(9,190));
        graphicsList.add(new GreenBullet(13,240));
        graphicsList.add(new GreenBullet(16,290));
        graphicsList.add(new SilverBullet(1,350));
        graphicsList.add(new SilverBullet(5,400));
        graphicsList.add(new SilverBullet(30,450));
        graphicsList.add(new SilverBullet(10,500));
        graphicsList.add(new SilverBullet(10,550));
        graphicsList.add(new SilverBullet(0,600));
        graphicsList.add(new SilverBullet(-2,650));
        graphicsList.add(new SilverBullet(15,700));
        graphicsList.add(new GreenBullet(13,750));
        graphicsList.add(new GreenBullet(16,800));
        graphicsList.add(new SilverBullet(1,852));
        graphicsList.add(new SilverBullet(5,900));
        
        TimerTask timerTask = new TimerTask(){
            @Override
            public void run(){
                moveGraphics();
                repaint();
            }
        };
        
        Timer timer = new Timer();
        timer.schedule(timerTask, 0, 700);
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintChildren(g);
        
        for(Graphic graphic : graphicsList){
            graphic.draw(g);
        }
    }
    
    public void moveGraphics(){
        for(Graphic g : graphicsList){
            g.move();
        }
    }
}
