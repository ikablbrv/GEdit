
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedit;
import gedit.instruments.ShapeButton;
import gedit.instruments.Load;
import gedit.instruments.Save;
import gedit.instruments.SaveProject;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import gedit.shape.Queue;

/**
 *
 * @author Ika
 */
@SuppressWarnings("serial")
public class SBPanel extends JPanel{
    private int buttonSize = 100;
	SBPanel(Dimension dim,Queue q, Canvas jp){
		super();
		this.setBounds(0, 0, dim.width, buttonSize);
                
		this.add(new ShapeButton("Krug",q));
                this.add(new ShapeButton("Karandash",q));
                this.add(new ShapeButton("LomLiniya",q));
                this.add(new ShapeButton("Mnogoygolnik",q));
                this.add(new ShapeButton("Pryamoygolnik",q));
                this.add(new Save(jp));
                this.add(new SaveProject(q));
                this.add(new Load(q,jp));
	}
}
