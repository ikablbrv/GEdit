/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedit.shape;
import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.awt.geom.Point2D;
import java.util.ArrayList;


/**
 *
 * @author Ika
 */
public class LomLiniya extends Shape{
    private ArrayList<Integer> x1 = new ArrayList<>();
    private ArrayList<Integer> y1 = new ArrayList<>();
    private List<Point2D> coordinates = new ArrayList<Point2D>();
    private Color shapeColor;
    private Shape shape=null;
    
    @Override
    public void paintShape(Graphics g){
        g.setColor(shapeColor);
        for (int i=1;i<x1.size();i++) {
            g.drawLine(x1.get(i-1), y1.get(i-1), x1.get(i) , y1.get(i));
            }
    }
    
    @Override
    public Color getColor() {
	return this.shapeColor;
    }
    
    @Override    
    public void setColor(Color color) {
	this.shapeColor=color;
    }

    @Override
    public void addCoordinate(Point2D point) {
        this.coordinates.add(point);
        this.x1.add((int)point.getX());
        this.y1.add((int)point.getY());
    }

    @Override
    public void addFinishCoordinate(Point2D point) {        
    }

    @Override
    public String getType() {
         return "LomLiniya";
    }

    @Override
    public List<Point2D> getPoints() {
        return this.coordinates;
    }

    @Override
    public void setCoordinates(List<Point2D> coordinates) {
       for(int i=0;i<coordinates.size();i++){
           addCoordinate(coordinates.get(i));
        }
    }
}
