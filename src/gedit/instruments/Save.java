/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedit.instruments;
import gedit.GEdit;
import gedit.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import gedit.shape.Queue;
import gedit.shape.Pryamoygolnik;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
/**
 *
 * @author Ika
 */
public class Save extends Button{
    public Save(Canvas jp){
		super("Save");
		this.addActionListener(new ActionListener() {
			@Override
                    public void actionPerformed(ActionEvent e) {
                        File f = new File("image.png");
                        try {
                            ImageIO.write(jp.getBuffer(),"png", f);
                        } catch (IOException ex) {
                            Logger.getLogger(GEdit.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                });
	}
}
