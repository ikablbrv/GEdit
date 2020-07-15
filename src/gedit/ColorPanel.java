/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedit;
import gedit.color.Colorr;
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
public class ColorPanel extends JPanel{
    private int buttonSize = 60;
	ColorPanel(Dimension dim,Queue q){
		super();
		this.setBounds(0, buttonSize, dim.width, buttonSize);
                                
		this.add(new Colorr(q, Color.RED));
                this.add(new Colorr(q, Color.YELLOW));
		this.add(new Colorr(q, Color.GREEN));
                this.add(new Colorr(q, Color.BLACK));
		this.add(new Colorr(q, Color.WHITE));
	}
}
