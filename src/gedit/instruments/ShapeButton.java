/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedit.instruments;
import gedit.shape.Karandash;
import gedit.shape.Krug;
import gedit.shape.LomLiniya;
import gedit.shape.Mnogoygolnik;
import gedit.shape.Pryamoygolnik;
import gedit.shape.Queue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Ika
 */
public class ShapeButton extends Button{
    public ShapeButton (String s, Queue q){
    super (s);
    this.addActionListener(new ActionListener() {
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(s){
            case "Krug":
                q.addShape(new Krug());
                break;
            case "Karandash":
                q.addShape(new Karandash());
                break;
            case "LomLiniya":
                q.addShape(new LomLiniya());
                break; 
            case "Mnogoygolnik":
                q.addShape(new Mnogoygolnik());
                break;  
            case "Pryamoygolnik":
                q.addShape(new Pryamoygolnik());
                break;
            }
        }
    });
    }
}
