public class Position {
    int x;
    int y;
    int key;

    public Position() {
    }

    public Position(int x, int y, int key) {
        this.x = x;
        this.y = y;
        this.key = key;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

}