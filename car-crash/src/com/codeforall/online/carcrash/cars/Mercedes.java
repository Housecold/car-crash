package com.codeforall.online.carcrash.cars;

import com.codeforall.online.carcrash.grid.Position;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Mercedes extends Car {

    private static Color MERCEDES_COLOR = Color.BLUE;

    public Mercedes(Position initialPosition) {
        super(initialPosition);
    }

    @Override
    public void move() {
        for(int i = 0; i < 2; i++) {
            super.move();
        }
    }

    public static Color getMercedesColor() {
        return MERCEDES_COLOR;
    }
}
