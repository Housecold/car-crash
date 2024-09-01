package com.codeforall.online.carcrash;

import com.codeforall.online.carcrash.grid.Grid;
import com.codeforall.online.carcrash.cars.Car;
import com.codeforall.online.carcrash.cars.CarFactory;
import org.academiadecodigo.simplegraphics.graphics.Color;

public class Game {

    /**
     * Graphical Car field
     */
    private Grid grid;

    /**
     * Container of Cars
     */
    private Car[] cars;

    /**
     * Animation delay
     */
    private int delay;


    /**
     * Number of cars to manufacture
     */
    private int manufacturedCars = 20;

    Game(int cols, int rows, int delay) {

        grid = new Grid(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        grid.init();

        cars = new Car[manufacturedCars];

        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar(grid);
        }
    }


    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            moveAllCars();
        }

    }

    /**
     * Moves all cars
     */
    public void moveAllCars() {
        for(int i = 0; i < cars.length; i++) {
            cars[i].move();
            checkCrash(cars[i]);
        }
    }

    public void checkCrash(Car car) {
        for(int i = 0; i < cars.length; i++) {
            if(car.getPos() == cars[i].getPos()) {
                continue;
            }
            if(car.getPos().getRow() == cars[i].getPos().getRow() && car.getPos().getCol() == cars[i].getPos().getCol()) {
                car.setCrashed(true);
                car.getPos().getRectangle().setColor(Color.GREEN);
            }
        }
    }
}
