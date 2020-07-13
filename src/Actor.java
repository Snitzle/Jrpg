public abstract class Actor {

    /**
     * This is the base object that contains generic data that every actor in the game requires.
     */
    protected int x, y;
    protected ID id;
    protected int health;

    protected int moveStep = 32;

    public Actor(int x, int y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public Actor(int x, int y, ID id, int health) {
        this.x = x;
        this.y = y;
        this.id = id;
        this.health = health;
    }

    public abstract void tick();
//    public abstract void render(Graphics g);

    public float getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }
}
