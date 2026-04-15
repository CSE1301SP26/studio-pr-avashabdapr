package game;

import java.awt.Color;

public class Projectile extends Entity {

    public Projectile(double x, double y,double size, Color color) {
        super(x, y, size, color);
    }

    public void moveUp(double size) {
        setYPosition(this.getYPosition() + size);
    }

    public void moveDown(double size) {
        setYPosition(this.getYPosition() - size);
    }

    public boolean isOutOfBounds() {
        if(this.getYPosition() > 1) {
            return true;
        }
        return this.getYPosition() < 0; 
    }

}
