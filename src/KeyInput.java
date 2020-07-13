import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    /**
     * Stores which keys are being pressed
     */

    public boolean keys[] = new boolean[4];

    public void keyPressed ( KeyEvent e ) {

        int key = e.getKeyCode();

        switch (key) {
            case KeyEvent.VK_W: // Up
                keys[0] = true;
                break;
            case KeyEvent.VK_A: // Left
                keys[1] = true;
                break;
            case KeyEvent.VK_S: // Right
                keys[2] = true;
                break;
            case KeyEvent.VK_D: // Down
                keys[3] = true;
                break;
        }

    }

    public void keyReleased ( KeyEvent e) {

        int key = e.getKeyCode();

        switch (key) {
            case KeyEvent.VK_W: // Up
                keys[0] = false;
                break;
            case KeyEvent.VK_A: // Left
                keys[1] = false;
                break;
            case KeyEvent.VK_S: // Right
                keys[2] = false;
                break;
            case KeyEvent.VK_D: // Down
                keys[3] = false;
                break;
        }

    }

}
