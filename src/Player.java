public class Player extends Actor {

    private static int key = 0;
    private int[] nextPos = new int[3]; //
    private boolean keyPressed = false;

    private static Player Instance;

    protected KeyInput input;

    private Player(int x, int y, ID id) {
        super(x, y, id);
    }

    private Scene currentScene = Scene.getInstance();
    private Map gameMap = currentScene.getCurrentMap();

    public static Player getInstance() {
        if (Instance == null) {
            Instance = new Player(0,0, ID.Player);
        }

        return Instance;
    }

    public void init(KeyInput input) {
        this.input = input;
    }

    @Override
    public void tick() {

        movement();
        updateState();
        boundCollision();

    }

    private void movement() {

        /*
            Legend:
            0 = up
            1 = left
            2 = down
            3 = right
        */

        if ( input.keys[3] ) {
            if(!keyPressed) {
                if ( gameMap.getMapKey(x + 1, y) != 2) {
                    setNextPos(this.x, this.y, gameMap.getMapKey(x + 1, y));
                    x += 1; // go right
                }
                keyPressed = true;
            }
        } else if ( input.keys[1] ) {
            if(!keyPressed) {
                if ( gameMap.getMapKey(x - 1, y) != 2) {
                    setNextPos(this.x, this.y, gameMap.getMapKey(x - 1, y));
                    x -= 1; // go left
                }
                keyPressed = true;
            }
        } else if ( input.keys[2] ) {
            if(!keyPressed) {

                if ( gameMap.getMapKey(x, y + 1) != 2) {
                    setNextPos(this.x, this.y, gameMap.getMapKey(x, y + 1));
                    y += 1; // go up
                }

                keyPressed = true;
            }
        } else if ( input.keys[0] ) {
            if(!keyPressed) {

                if ( gameMap.getMapKey(x, y - 1) != 2) {
                    setNextPos(this.x, this.y, gameMap.getMapKey(x, y - 1));
                    y -= 1; // go down
                }

                keyPressed = true;

            }
        } else {
            keyPressed = false;
        }

    }


    public void setNextPos(int x, int y, int key) {
        // Stops the player painting the map, leaving their colour in the previous square.
        nextPos[0] = x;
        nextPos[1] = y;
        nextPos[2] = key;
    }

    public int[] getNextPos() {
        return nextPos;
    }

    private void updateState() {
        gameMap.setMapPosition(this.x, this.y, this.key);
        gameMap.setMapPosition(nextPos[0], nextPos[1], nextPos[2]);
    }


    private void boundCollision() {

        if ( x > Game.WIDTH ) {
            x = 0;
        } else if ( x < 0) {
            x = Game.WIDTH;
        } else if ( y > Game.HEIGHT ) {
            y = 0;
        } else if ( y < 0 ) {
            y = Game.HEIGHT;
        }

    }

}
