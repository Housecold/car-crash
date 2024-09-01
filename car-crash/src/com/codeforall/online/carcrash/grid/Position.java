package com.codeforall.online.carcrash.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.util.Random;

public class Position {
    private int col;
    private int row;
    private Rectangle rectangle;
    private Grid grid;

    public Position(Grid grid, Random col, Random row, Color color) { //Creates a random position in the grind with a rectangular shape
        Random random = new Random();
        this.grid = grid;
        this.col = random.nextInt(grid.getCols());
        this.row = random.nextInt(grid.getRows());
        rectangle = new Rectangle(grid.columnToX(getCol()), grid.rowToY(getRow()), grid.getCellSize(), grid.getCellSize());
        rectangle.fill();
        rectangle.setColor(color);
    }

    public int getCol() {
        return this.col;
    }

    public int getRow() {
        return this.row;
    }

    public void moveRight() { //Makes the rectangle move to the right knowing the max he can go
        if(getCol() < grid.getCols() - 1) {
            col++;
            rectangle.translate(grid.getCellSize(), 0);
        }
    }

    public void moveLeft() { //Makes the rectangle move to the left knowing the min he can go
        if (getCol() > 0) {
            col--;
            rectangle.translate(-grid.getCellSize(), 0);
        }
    }

    public void moveDown() { //Makes the rectangle move down knowing the max he can go
        if(getRow() < grid.getRows() - 1) {
            row++;
            rectangle.translate(0, grid.getCellSize());
        }
    }

    public void moveUp() { //Makes the rectangle move up knowing the min he can go
        if(getRow() > 0) {
            row--;
            rectangle.translate(0, -grid.getCellSize());
        }
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
}
