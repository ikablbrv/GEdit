/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package save;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ika
 */
public class SaveShapeQueue implements Serializable {
   private static final long serialVersionUID = 1L;
    private List<SaveShape> shapes;
    public SaveShapeQueue(){
        shapes=new ArrayList<SaveShape>();
    }

    public void addShape(SaveShape shape) {
        shapes.add(shape);
    }

    public List<SaveShape> getShapes() {
        return shapes;
    } 
}
