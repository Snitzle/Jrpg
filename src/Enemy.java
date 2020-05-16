import java.awt.*;

public class Enemy extends GameObject {

    Player player = Player.getInstance();

    public Enemy(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {

        /* Write the updates for the object per tick in this part of the object
        * Set new position based on some new logic once the grid is working
        * Abstract out to include different movement sets
        * */

//        x;
//        y;
//
//        if ( player.x > this.x ) {
//            velX += _acc; // go left
//        } else if ( player.x < this.x) {
//            velX -= _acc; // go right
//        }
//
//        if ( player.y > this.y ) {
//            velY += _acc; // go left
//        } else if ( player.y < this.y) {
//            velY -= _acc; // go right
//        }

    }

//    @Override
//    public void render(Graphics g) {
//        g.setColor(Color.green);
//        g.fillRect( (int) x, (int) y,32,32);
//    }
}
