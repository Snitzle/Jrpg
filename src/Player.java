import java.awt.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Player extends GameObject {

    private int key = 1;
    private boolean keyPressed = false;

    private static Player Instance;

    protected KeyInput input;

    private Player(int x, int y, ID id) {
        super(x, y, id);
    }

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

        // Movement is brought in from the constructor of the object.
//        x;
//        y;

        movement();
        updateState();
        boundCollision();

        /* Write collision function here
        * How to check I overlap any other object?
        * */



    }

    private void movement() {

        /*
            Legend
            0 = up
            1 = left
            2 = down
            3 = right
        */


        if ( input.keys[3] ) {

            if(!keyPressed) {
                x += 1; // go right
                keyPressed = true;
            }

        } else if ( input.keys[1] ) {
            if(!keyPressed) {
                x -= 1; // go left
                keyPressed = true;
            }
        } else {
            keyPressed = false;
        }



//
//        if ( input.keys[2] ) {
//            velY += _acc; // go up
//        } else if ( input.keys[0] ) {
//            velY -= _acc; // go down
//        } else if ( !input.keys[2] && !input.keys[0] ) {
//
//            // This brings the player to a stop.
//            if ( velX > 0 ) {
//                velX -= _dcc;
//            } else if ( velX < 0 ) {
//                velX += _dcc;
//            }
//
//        }

    }

    private void updateState() {
        Handler handler = Handler.getInstance();
        handler.setGridPos(this.x, this.y, this.key);
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

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);

        g.fillRect( x * 32, y * 32 ,32,32);
    }

}
