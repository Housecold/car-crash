package com.codeforall.online.carcrash.cars;

import com.codeforall.online.carcrash.grid.Position;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Fiat extends Car{

    private static Color FIAT_COLOR = Color.RED;

    public Fiat(Position initialPosition) {
        super(initialPosition);
    }

    @Override
    public void move() {
        super.move();
    }

    public static Color getFiatColor() {
        return FIAT_COLOR;
    }


}
