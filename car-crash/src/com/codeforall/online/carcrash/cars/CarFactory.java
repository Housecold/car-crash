package com.codeforall.online.carcrash.cars;

import com.codeforall.online.carcrash.grid.Grid;
import com.codeforall.online.carcrash.grid.Position;
import org.academiadecodigo.simplegraphics.graphics.Color;

import java.util.Random;

public class CarFactory {

    public static Car getNewCar(Grid grid) {
        Random colRandom = new Random();
        Random rowRandom = new Random();;

        Random random = new Random();
        int randomCar = random.nextInt(2);

        Position randomPosition = new Position(grid, colRandom, rowRandom, getColor(randomCar));

        if(randomCar == 0) {
            getColor(0);
            return new Fiat(randomPosition);
        } else {
            getColor(1);
            return new Mercedes(randomPosition);
        }
    }

    private static Color getColor(int randomCar) {
        return (randomCar == 0) ? Mercedes.getMercedesColor() : Fiat.getFiatColor();
    }
}
