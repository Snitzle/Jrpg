public class Map {

    private static int[][] Map;

    public static int[][] getMap() {
        if (Map == null) {
            Map = new int[Game.gridWidth][Game.gridHeight];
        }
        return Map;
    }

    public static void setMapPosition(int x, int y, int key) {
        Map[x][y] = key;
    }

    public static int getMapKey(int x, int y) {
        return Map[x][y];
    }

}
