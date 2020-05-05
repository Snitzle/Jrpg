import java.awt.*;

public class Enemy extends GameObject {

    Player player = Player.getInstance();

    private float _acc = 0.02f; //Acceleration
    private float _dcc = 0.1f; //Deceleration

    public Enemy(float x, float y, ID id) {
        super(x, y, id);
    }




    @Override
    public void tick() {

        /* Write the updates for the object per tick in this part of the object */
        x += velX;
        y += velY;

        if ( player.x > this.x ) {
            velX += _acc; // go left
        } else if ( player.x < this.x) {
            velX -= _acc; // go right
        }

        if ( player.y > this.y ) {
            velY += _acc; // go left
        } else if ( player.y < this.y) {
            velY -= _acc; // go right
        }



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

    @Override
    public void render(Graphics g) {
        g.setColor(Color.green);
        g.fillRect( (int) x, (int) y,32,32);
    }
}
