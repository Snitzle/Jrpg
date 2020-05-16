import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapFactory {

    public Map create() {
        Map map = new Map(0, createMapList() );
    }

    public int generateMapID() {
        int x = 0;
        return x;
    }

    public List<List<HashMap<String, Integer>>> createMapList() {

        List<List<HashMap<String, Integer>>> map = new ArrayList<>();

        for (int i = 0; i < Game.gridWidth; i++) {

            ArrayList<HashMap<String, Integer>> column = new ArrayList<>();

            for (int j = 0; j < Game.gridHeight; j++) {

                HashMap<String, Integer> cell = new HashMap<>();
                cell.put("key", 0);
                cell.put("enemyID", 0);

                column.set(j, cell);

            }
            map.set(i, column);
        }

        return map;
    }

}
