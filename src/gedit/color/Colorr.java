/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedit.color;
import gedit.instruments.Button;
import gedit.instruments.Button;
import gedit.shape.Queue;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Ika
 */
public class Colorr extends Button{
    public Colorr (Queue q, Color color){
		super(""); 
                this.setBackground(color);
                this.setMargin(new Insets(15, 15, 15, 15));
                
		this.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
                                if (q.getLastShape()!=null){
                                    q.getLastShape().setColor(color);
                                }
				q.setCurrColor(color);
			}
		});
	}
}
