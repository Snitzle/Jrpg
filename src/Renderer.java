import java.awt.*;

public class Renderer {

    public void blit( Map map, Graphics g) {

        for (int i = 0; i < Game.gridWidth; i++) {
            for (int j = 0; j < Game.gridHeight; j++) {
                switch (map.getMapKey(i,j)) {
                    case 0:
                        g.setColor(Color.BLUE);
                        g.fillRect( i * 32, j * 32, 32 ,32);
                        break;
                    case 1:
                        g.setColor(Color.RED);
                        g.fillRect( i * 32, j * 32, 32 ,32);
                        break;
                    default:
                        g.setColor(Color.BLACK);
                        g.fillRect( i * 32, j * 32, 32 ,32);
                        break;
                }
            }
        }

    }

}
