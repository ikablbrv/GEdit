/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;
import gedit.shape.Shape;
import gedit.shape.Queue;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Ika
 */
public class Savee {
    public Savee(Queue q) throws IOException {
        SaveShapeQueue Queueshape = new SaveShapeQueue();
        for(Shape shape: q.getQueue()) {
            Queueshape.addShape(new SaveShape(shape));
        }
        FileOutputStream outputStream = new FileOutputStream("save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(Queueshape);
        objectOutputStream.close();
    }
}
