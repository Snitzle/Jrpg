public abstract class Actor {

    /**
     * This is the base object that contains generic data that every actor in the game requires.
     */
    private Position pos;
    protected int health;

    protected int moveStep = 32;

    public Actor(int x, int y, int key) {

        this.pos.setX(x);
        this.pos.setY(y);
        this.pos.setKey(key);

    }

    public Actor(int x, int y, int key, int health) {

        this.pos.setX(x);
        this.pos.setY(y);
        this.pos.setKey(key);

        this.health = health;
        
    }

    public abstract void tick();

}
