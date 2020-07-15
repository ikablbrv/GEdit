/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedit;
import gedit.shape.Queue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import  java.awt.image.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
/**
 *
 * @author Ika
 */
public class Canvas extends JPanel {
    private BufferedImage buf=null;
    private Graphics buffer=null;
    private Queue q = null;
    Canvas me;
    
    public Canvas(int width, int height, Queue q) throws IOException{
        this();
        this.q = q;
        buf = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        buffer=buf.getGraphics();
        buffer.setColor(Color.white);
        buffer.fillRect( 0, 0, width, height);
    };
    
    public Canvas() {
        super();
        me=this;
        this.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent e) {
                q.getLastShape().addFinishCoordinate(e.getPoint());
                me.paintToBuffer();
                me.repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {}
        });
        
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                q.getLastShape().addCoordinate(e.getPoint());      
                me.paintToBuffer();
                me.repaint();
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });  
    }
    
    public void paintToBuffer() {
        buffer.setColor(Color.white);
        buffer.fillRect(0,0,10000,10000);  
        q.paintShapes(buffer);    
    }
    
    @Override
    public void paint(Graphics g){   
       g.drawImage(buf, 0, 0, me); 
    }
     
    public BufferedImage getBuffer(){
       return buf; 
    } 
}