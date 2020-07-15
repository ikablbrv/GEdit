/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;
import gedit.Canvas;
import gedit.shape.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 *
 * @author Ika
 */
public class Loadd {
    public Loadd(Queue q,Canvas jp) throws IOException {
        SaveShapeQueue shapes = new SaveShapeQueue();
        FileInputStream fileInputStream = new FileInputStream("save.ser");
        try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            try {
                shapes = (SaveShapeQueue) objectInputStream.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            q.refresh();
            for (SaveShape saveShape : shapes.getShapes()) {
                q.setCurrColor(saveShape.getColor());
                if (saveShape.getType().equals("Krug")) {
                    q.addShape(new Krug());
                } else if (saveShape.getType().equals("Pryamoygolnik")) {
                    q.addShape(new Pryamoygolnik());
                } else if (saveShape.getType().equals("Mnogoygolnik")) {
                    q.addShape(new Mnogoygolnik());
                } else if (saveShape.getType().equals("LomLiniya")) {
                    q.addShape(new LomLiniya());
                } else if (saveShape.getType().equals("Karandash")) {
                    q.addShape(new Karandash());    
                } else throw new RuntimeException("problem");
                if (saveShape.getPoints().size() != 0) {
                    q.getLastShape().setCoordinates(saveShape.getPoints());
                }
            }
            jp.paintToBuffer();
            jp.repaint();
        }
    }
}
