import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapFactory {

    int mapID = 0;

    public Map create() {
        Map map = new Map(mapID, createMapList());
        mapID += 1;
        return map;
    }

    public List<List<HashMap<String, Integer>>> createMapList() {

        List<List<HashMap<String, Integer>>> map = new ArrayList<>();

        for (int i = 0; i < Game.gridWidth; i++) {

            ArrayList<HashMap<String, Integer>> column = new ArrayList<>();

            for (int j = 0; j < Game.gridHeight; j++) {

                HashMap<String, Integer> cell = new HashMap<>();
                cell.put("key", 0);
                cell.put("enemyID", 0);

                column.add(j, cell);

            }
            map.add(i, column);
        }

        return map;
    }

}
