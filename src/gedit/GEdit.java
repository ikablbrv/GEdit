/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedit;
import gedit.shape.Queue;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;
import java.io.IOException;
/**
 *
 * @author Ika
 */
public class GEdit extends JFrame{
    Canvas jp;
    Queue q = new Queue();
  
    public GEdit() throws IOException{
        super("Graph Edit");
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        this.setSize(screenSize.width,screenSize.height);
        this.setVisible(true);
        this.setLayout(null);
        jp = new Canvas(screenSize.width,screenSize.height,q);
        jp.setBounds(100,100,screenSize.width-200,screenSize.height);
        jp.setBackground(Color.pink);
        this.add(jp);
        JPanel buttonPanel = new SBPanel(screenSize,q,jp);
        this.add(buttonPanel);
        JPanel colorButtonPanel = new ColorPanel(screenSize,q);
        this.add(colorButtonPanel); 
        
            
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        GEdit app = new GEdit();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // TODO code application logic here
    }
    
}

