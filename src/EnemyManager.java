import java.util.ArrayList;

public class EnemyManager {
    /**
     * Store all instances of the Enemy class
     * Assign Each enemy an ID of some sort
     */
    ArrayList<Enemy> enemyList = new ArrayList<>();

    public ArrayList<Enemy> getEnemyList() {
        return enemyList;
    }

    public void setEnemyList(ArrayList<Enemy> enemyList) {
        this.enemyList = enemyList;
    }

    public void addEnemy(Enemy x){
        enemyList.add(x);
    }
}
