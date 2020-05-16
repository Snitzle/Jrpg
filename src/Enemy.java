public class Enemy extends Actor {

    private int uniqeueID;

    public Enemy(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {

        /* Write the updates for the object per tick in this part of the object
         * Set new position based on some new logic once the grid is working
         * Abstract out to include different movement sets
         * */
    }
}