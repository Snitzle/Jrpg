import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {
    // 32px squares, 40 wide, 30 tall
    public static int WIDTH = 1280, HEIGHT = 960;
    public static String title = "ZOMBIE GAME";
    public static int gridWidth = WIDTH / 32;
    public static int gridHeight = HEIGHT / 32;

    private Thread thread;
    private Renderer renderer;
    private boolean isRunning = false;

    private Handler handler;

    private synchronized void start() {
        // Stops spinning up new threads if game is already running
        if ( isRunning ) return;

        thread = new Thread(this);
        thread.start();
        isRunning = true;

    }

    private synchronized void stop() {
        if ( !isRunning) return;

        thread = Thread.currentThread();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        isRunning = false;
    }

    public Game() {

        new Window(WIDTH, HEIGHT, title, this);
        start();

        setFocusable(true);
        requestFocus();
        requestFocusInWindow();

        renderer = new Renderer();
        handler = Handler.getInstance();

        KeyInput input = new KeyInput();
        addKeyListener(input);

        Player player1 = Player.getInstance();
        player1.init(input);

        handler.addObject(player1);

    }

    // This is where the game loop runs
    public void run () {

        long lastTime = System.nanoTime();
        long timer = System.currentTimeMillis();

        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;

        int updates = 0;
        int frames = 0;

        while( isRunning ){

            long now = System.nanoTime();

            delta += (now - lastTime) / ns;
            lastTime = now;

            while ( delta >= 1 ) {

                tick();
                updates++;
                delta--;

            }

            render();

            frames++;

            if ( System.currentTimeMillis() - timer > 1000 ) {

                timer += 1000;
                System.out.println("FPS: " + frames + " TICKS: " + updates);
                frames = 0;
                updates = 0;

            }
        }




    }

    private void tick () {
        // Updates the game logic
        handler.tick();
    }

    private void render() {

        // updates the screen
        BufferStrategy bs = this.getBufferStrategy();

        // Only gets ran once when it doesn't exist
        if ( bs == null ) {
            this.createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        Map map = new Map();
        renderer.blit(map, g);

        bs.show();
        g.dispose();

    }

    public static void main(String[] args) {
        new Game();
    }

    public void drawDebugGrid(Graphics g) {

        // Add to render method
        g.setColor(Color.BLUE);

        int x = 0;
        int y = 0;

        while ( y < HEIGHT) {
            // int x1, int y1, int x2, int y2
            g.drawLine(x, y, WIDTH, y);
            y += 32;
        }

        y = 0;

        while ( x < WIDTH) {
            // int x1, int y1, int x2, int y2
            g.drawLine(x, y, x, HEIGHT);
            x += 32;
        }

    }

}
