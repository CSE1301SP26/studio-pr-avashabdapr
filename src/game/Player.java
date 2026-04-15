package game;

import edu.princeton.cs.introcs.StdDraw;

import java.awt.Color;
import java.awt.event.KeyEvent;

public class Player extends Entity {

    private long lastFired;

    public Player(double x, double y, double size) {
        super(x,y, size, Color.BLACK);
        lastFired = System.currentTimeMillis();
    }

    public void move() {
        if (StdDraw.isKeyPressed(KeyEvent.VK_A)) {
            setXPosition(this.getXPosition() - 0.01);
        }
        if (StdDraw.isKeyPressed(KeyEvent.VK_D)) {
            setXPosition(this.getXPosition() + 0.01);
        }
    }

    public boolean isFiring() {
        long now = System.currentTimeMillis();
        if (now - lastFired > 500 && StdDraw.isKeyPressed(KeyEvent.VK_SPACE)) {
                lastFired = now;
                return true;
            } else {
                return false;
            }
        }
    
}
