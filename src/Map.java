import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map implements MapInterface {

    private int ID;
    private List<List<HashMap<String, Integer>>> Map;

    public Map(int ID,  List<List<HashMap<String, Integer>>> map) {
        this.ID = ID;
        this.Map = map;
    }

    public void setMapPosition(int x, int y, int key) {
        Map.get(x).get(y).put("key", key);
    }

    public int getMapKey(int x, int y) {
        return Map.get(x).get(y).get("key");
    }

    public int getMapRowWidth ( int x ) {
        return  Map.get(x).size();
    }

    public int getMapColumnHeight( int x, int y ) {
        return Map.get(x).get(y).size();
    }

    public int getID() {
        return ID;
    }

}
