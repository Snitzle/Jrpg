import java.util.ArrayList;

/**
 * Temporarily make singleton
 */

public class Scene {

    private MapFactory mf;
    private static Scene Instance;


    ArrayList<Map> maps = new ArrayList<>();

    private Scene() {
        this.mf = new MapFactory();
    }

    public static Scene getInstance() {
        if (Instance == null) {
            Instance = new Scene();
        }

        return Instance;
    }

    public Map getCurrentMap() {

        try {
            maps.get(0);
        } catch(Exception e) {
            maps.add(0, mf.create());
            System.out.println("Map Created");
        }

        return maps.get(0);
    }

}
