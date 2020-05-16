import java.awt.*;

public abstract class GameObject {

    /**
     * This is the base object that contains generic data that every object in the game requires.
     * This is unrealistic because any game with mild complexity wouldn't have every class inherit the same thing.
     */
    protected int x, y;
    protected ID id;
    protected int health;

    protected int moveStep = 32;

    public GameObject(int x, int y, ID id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public GameObject(int x, int y, ID id, int health) {
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
