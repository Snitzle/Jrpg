import java.awt.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;

public class Player extends GameObject {

    private float _acc = 0.3f; //Acceleration
    private float _dcc = 0.1f; //Deceleration

    private static Player Instance;

    protected KeyInput input;

    private Player(float x, float y, ID id) {
        super(x, y, id);
    }

    public static Player getInstance() {
        if (Instance == null) {
            Instance = new Player(100,100, ID.Player);
        }

        return Instance;
    }

    public void init(KeyInput input) {
        this.input = input;
    }

    @Override
    public void tick() {

        // Movement is brought in from the constructor of the object.
        x += velX;
        y += velY;

        movement();
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
            velX += _acc; // go left
        } else if ( input.keys[1] ) {
            velX -= _acc; // go right
        } else if ( !input.keys[3] && !input.keys[1] ) {

            // This brings the player to a stop.
            if ( velX > 0 ) {
                velX -= _dcc;
            } else if ( velX < 0 ) {
                velX += _dcc;
            }

        }

        if ( input.keys[2] ) {
            velY += _acc; // go up
        } else if ( input.keys[0] ) {
            velY -= _acc; // go down
        } else if ( !input.keys[2] && !input.keys[0] ) {

            // This brings the player to a stop.
            if ( velX > 0 ) {
                velX -= _dcc;
            } else if ( velX < 0 ) {
                velX += _dcc;
            }

        }

    }

    private void boundCollision() {

        // This doesn't work. I need to work out how to move the box to the opposite side of the screen.
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
        g.fillRect( (int) x, (int) y,32,32);
    }

}
