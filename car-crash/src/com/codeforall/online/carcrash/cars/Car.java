package com.codeforall.online.carcrash.cars;

import com.codeforall.online.carcrash.grid.Position;

import java.util.Random;

public abstract class Car implements Movable {

    /** The position of the car on the grid */
    private Position pos;
    private boolean crashed = false;

    public Position getPos() {
        return pos;
    }

    public void setCrashed(boolean crashed) {
        this.crashed = crashed;
    }

    public boolean isCrashed() {
        return crashed;
    }

    public Car(Position initialPosition) {
        this.pos = initialPosition;
    }

    public void move(){
        if(!isCrashed()) {

            Random random = new Random();
            int direction = random.nextInt(4);

            switch (direction) {
                case 0:
                    pos.moveRight();
                    break;
                case 1:
                    pos.moveLeft();
                    break;
                case 2:
                    pos.moveUp();
                    break;
                case 3:
                    pos.moveDown();
                    break;
            }
        }
    }


}
