package inputs;

import main.GameScreen;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static utilis.Constants.Directions.*;

public class KeyboardInputs implements KeyListener {

    private GameScreen gameScreen;
    public KeyboardInputs(GameScreen gameScreen){
        this.gameScreen = gameScreen;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {

            case KeyEvent.VK_A:
                gameScreen.setDirection(LEFT);
                break;
            case KeyEvent.VK_S:
                gameScreen.setDirection(DOWN);
                break;
            case KeyEvent.VK_D:
                gameScreen.setDirection(RIGHT);
                break;
            case KeyEvent.VK_W:
                gameScreen.setDirection(UP);
                break;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()) {

            case KeyEvent.VK_A:
            case KeyEvent.VK_S:
            case KeyEvent.VK_D:
            case KeyEvent.VK_W:
                gameScreen.setMoving(false);
                break;

        }

    }
}
