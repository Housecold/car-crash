# 🚗 Car Crash Game

This project involves creating a self-playing car-crashing game using Java and the SimpleGraphics library, implementing the necessary classes and methods based on a provided code skeleton.

## Goal

Implement the necessary classes and methods to create a car-crashing game that plays itself with the aid of the SimpleGraphics library.

## Skills

- Improve your composition and delegation skills by combining simpler objects.
- Advance your knowledge about inheritance to define common behaviors and attributes in superclasses and isolate specific attributes and behaviors in subclasses.
- Utilize polymorphism and get familiar with more situations where you can benefit from it.
- Take advantage of abstract classes.
- Create and implement an interface.
- Practice using an external graphics library, like SimpleGraphics.
- Practice packaging your program with Ant.

### Key Points:

- Although SimpleGraphics uses pixels for navigation, implement the idea of columns and rows with Java. This approach will make it easier to switch to another graphics library if needed.
- Create any necessary classes for implementing the desired behavior. However, the program should include at least the following classes:

  I. **Grid**
     - The grid is where the cars are placed. It must know its limits and include logic for converting pixels to columns and rows.
  
  II. **Position**
     - Represents the position of the car, describing where a car is located on the grid and its graphical representation. Updating this position results in the movement of the car.

  III. **Cars**
     - Represents various types of cars that can be used in the game. Cars move at different speeds and in different directions. They can crash into each other at any time.

  IV. **Game**
     - Represents the game being played. It creates cars and moves them to check for collisions.

  V. **Movable**
     - An interface that represents all moving entities in the program.

### Build Instructions

To build the project using Ant, use the `build.xml` file provided. This file will package your project into a JAR file that includes the SimpleGraphics library. To do so, run this commnand:

```bash
ant
```

## Requirements

- Java Development Kit (JDK) 17 or above.
- Apache Ant.
- A Java IDE like IntelliJ IDEA, or any other of your choice.

## Installation

Clone the repository and navigate to the folder.

```bash
git clone <repository-url>
cd <repository-folder>
```

## Usage

To run the Java program:

```bash
java -jar build/car-crash.jar
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## Suggested future improvements

- Create an ambulance that doesn’t crash into cars but can fix crashed cars instead.
- Enhance the AI of cars for more complex behaviors.
- Introduce more vehicle types with unique characteristics.
- Add a graphical user interface (GUI) for more interactive gameplay.

## Contributors

-  Daniel Magalhães - @Housecold
-  Sérgio Conchinha - @SConchinha
