import java.awt.*;
import java.util.LinkedList;

public class Handler {

    /**
     * Updates every object in the game
     */

    public LinkedList<GameObject> object = new LinkedList<GameObject>();

    public void tick() {
        for ( GameObject obj : object ) {
            obj.tick();
        }
    }

    public void render(Graphics g) {
        for ( GameObject obj : object ) {
            obj.render(g);
        }
    }

    public void addObject(GameObject obj) {
        object.add(obj);
    }

    public void removeObject ( GameObject obj ) {
        object.remove(obj);
    }

}
