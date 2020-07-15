/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedit.shape;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
/**
 *
 * @author Ika
 */
public class Queue {
    private Color CurrColor = Color.black;
    ArrayList<Shape> shapes = new ArrayList<>();
       
    public void addShape(Shape bt){
        shapes.add(bt);
        this.getLastShape().setColor(CurrColor);
    }
    
    public Shape getLastShape(){
        if (shapes.size()==0) return null;
        return shapes.get(shapes.size()-1);
    }

    public void paintShapes(Graphics g){
       for (Shape bs:shapes){
           bs.paintShape(g);
        } 
    }
    
    public void setCurrColor(Color color) {
            this.CurrColor = color;
    }
    public  ArrayList<Shape> getQueue() {
        return shapes;
    }

    public void refresh() {
        shapes.clear();
    }
}
