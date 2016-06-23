/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tableof10;
//import java.util.*;
//import static java.lang.System.out;

import javax.swing.JFrame;
import java.awt.*;
/**
 *
 * @author YasH
 */
public class TableOf10 {
    //Ch-5 -- 6
    public static void main(String[] args) {
        /*JFrame panel = new JFrame();
        panel.setSize(100,200);
        panel.setTitle("JFrame title");
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setVisible(true);*/
   //Rectangle rect = new Rectangle(5,10,50,60);
  // rect.setBackground(Color.MAGENTA);
    /* Graphics g = panel.getGraphics();
    Color green = new Color(10,50,100);
    panel.setBackground(green);
    g.setColor(Color.MAGENTA);
    g.fillOval(30,20,20,20);
    g.setColor(Color.yellow);
    g.drawLine(20,30,40,30);*/
        
        DrawingPanel panel = new DrawingPanel(100,200);
        Graphics g = panel.getGraphics();
        g.drawRect(10, 20, 20, 30);
    g.setColor(Color.yellow);
    g.fillRect(10, 20, 20, 30);
    panel.setBackground(Color.GREEN);
       }
    }
       
          
   
 
   
    
      
   

    



