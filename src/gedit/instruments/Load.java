/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedit.instruments;
import save.Loadd;
import save.Savee;
import gedit.Canvas;
import gedit.shape.Queue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
/**
 *
 * @author Ika
 */
public class Load extends Button{
    public Load(Queue q, Canvas jp){
        super("Load");
        this.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Loadd(q,jp);
                    
                } catch (IOException ex) {
                    Logger.getLogger(SaveProject.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }
}
