package main;

public class Game implements Runnable{
    private Window window;
    private GameScreen gameScreen;
    private Thread gameThread;
    private final int FPS_Maximum = 120;
    public Game(){
        gameScreen = new GameScreen();
        window = new Window(gameScreen);
        gameScreen.requestFocus();
        startGameLoop();

    }
    private void startGameLoop() {
        gameThread = new Thread(this);
        gameThread.start();

    }

    @Override
    public void run() {
        double timePerFrame = 1000000000 / FPS_Maximum;
        long lastFrame = System.nanoTime();
        long now = System.nanoTime();
        int frames = 0;
        long lastCheck = System.currentTimeMillis();
        while(true) {

            now = System.nanoTime();
            if(now - lastFrame >= timePerFrame ){
                gameScreen.repaint();
                lastFrame = System.nanoTime();
                frames++;
            }


            if(System.currentTimeMillis() - lastCheck >= 1000){
                lastCheck = System.currentTimeMillis();
                System.out.println("FPS: " + frames);
                frames =0;

            }
        }

    }
}
