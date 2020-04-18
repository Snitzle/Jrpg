import java.awt.*;
import java.util.LinkedList;

public class Handler {

    /**
     * This class contains the logic for updating class variables.
     * These variables are used to make things move or could be used for HP.
     *
     * Updates every object in the game.
     *
     * Referenced in the main game loop.
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
