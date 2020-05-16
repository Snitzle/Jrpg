import java.util.Random;

/**
 * Manages the creation of Enemy Objects
 */

public class EnemyFactory {

    public Enemy createEnemy() {

        // ToDo: Write a function that assigns a unique ID to each Enemy

        Random r = new Random();
        int x = r.nextInt(Game.gridWidth);
        int y = r.nextInt(Game.gridHeight);
        return new Enemy(x,y, ID.Enemy);
    }
}
