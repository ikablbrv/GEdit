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
public class Karandash extends Shape{
    private ArrayList<Integer> xf = new ArrayList<>();
    private ArrayList<Integer> yf = new ArrayList<>();
    private Color shapeColor;
    private List<Point2D> coordinates = new ArrayList<Point2D>();
    private Shape shape=null;

    @Override
    public void paintShape(Graphics g){
        int r=5;
     g.setColor(shapeColor);
             for (int i=1;i<xf.size();i++) {
                g.fillOval(xf.get(i)-r, yf.get(i)-r, r*2, r*2);
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
    public void addCoordinate(Point2D point) {}

    @Override
    public void addFinishCoordinate(Point2D point) {
        this.coordinates.add(point);
        this.xf.add((int)point.getX());
        this.yf.add((int)point.getY());
    }

    @Override
    public String getType() {
       return "Karandash";
    }

    @Override
    public List<Point2D> getPoints() {
      return this.coordinates;
    }

    @Override
    public void setCoordinates(List<Point2D> coordinates) {
        for(int i=0;i<coordinates.size();i++){
           addFinishCoordinate(coordinates.get(i));
        }
    } 
}
