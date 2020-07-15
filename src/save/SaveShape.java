/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;
import gedit.shape.Shape;
import java.awt.*;
import java.awt.geom.Point2D;
import java.io.Serializable;
import java.util.List;
/**
 *
 * @author Ika
 */
public class SaveShape implements Serializable {
    private static final long serialVersionUID = 1L;
    private String type;
    private List<Point2D> points;
    private Color color;

    public SaveShape(Shape shape){
        setType(shape.getType());
        setPoints(shape.getPoints());
        setColor(shape.getColor());
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPoints(List <Point2D> points) {
        this.points = points;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public List<Point2D> getPoints() {
        return points;
    }

    public Color getColor() {
        return this.color;
    }
}
