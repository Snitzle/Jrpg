import java.awt.*;
import java.util.LinkedList;

public class Handler {

    private static Handler Instance;


    /**
     * Maybe make this the game state class.
     *
     * This class contains the logic for updating class variables.
     * These variables are used to make things move or could be used for HP.
     *
     * Updates every object in the game.
     *
     * Referenced in the main game loop.
     */

    public static Handler getInstance() {
        if (Instance == null) {
            Instance = new Handler();
        }

        return Instance;
    }

    public LinkedList<GameObject> object = new LinkedList<GameObject>();

    public void tick() {
        for ( GameObject obj : object ) {
            obj.tick();
        }
    }

    public void addObject(GameObject obj) {
        object.add(obj);
    }

    public void removeObject ( GameObject obj ) {
        object.remove(obj);
    }

}
