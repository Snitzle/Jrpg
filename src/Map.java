import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Map implements MapInterface {

    private List<List<HashMap<String, Integer>>> Map;

    public List<List<HashMap<String, Integer>>> getMap() {
        if (Map == null) {
            Map = new ArrayList<>();
            for (int i = 0; i < Game.gridWidth; i++) {

                ArrayList<HashMap<String, Integer>> column = new ArrayList<>();

                for (int j = 0; j < Game.gridHeight; j++) {

                    HashMap<String, Integer> cell = new HashMap<>();
                    cell.put("key", 0);
                    cell.put("enemyID", 0);

                    column.set(j, cell);

                }
                Map.set(i, column);
            }
        }
        return Map;
    }

    public void setMapPosition(int x, int y, int key) {
        Map.get(x).get(y).put("key", key);
    }

    public int getMapKey(int x, int y) {
        return Map.get(x).get(y).get("key");
    }

}
