/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gedit.shape;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.List;
/**
 *
 * @author Ika
 */
public abstract class Shape implements Serializable{
    abstract public void addCoordinate(Point2D point);  
    
    abstract public void addFinishCoordinate (Point2D point);
    
    abstract public String getType ();  
    
    abstract public List<Point2D> getPoints();    
    
    abstract public void setCoordinates(List<Point2D> coordinates);   
    
    abstract public void paintShape(Graphics g);    
    
    abstract public Color getColor();    
    
    abstract public void setColor(Color color);
}
