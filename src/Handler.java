import java.util.ArrayList;
import java.util.LinkedList;

public class Handler {

    private static Handler Instance;

    public static Handler getInstance() {
        if (Instance == null) {
            Instance = new Handler();
        }
        return Instance;
    }

    public ArrayList<Actor> object = new ArrayList<>();

    public void tick() {
        for ( Actor obj : object ) {
            obj.tick();
        }
    }

    public void addObject(Actor obj) {
        object.add(obj);
    }

    public void removeObject ( Actor obj ) {
        object.remove(obj);
    }

}
