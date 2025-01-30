package io.github.thienthu1410.example_usage;

import io.github.thienthu1410.BluePrint;


// How to create a specific blueprint type: car blueprint
public abstract class CarBlueprint extends BluePrint {

    private String engineType;
    private String color;

    // Constructor
    public CarBlueprint(String engineType, String color) {
        super("Car Design");
        this.engineType = engineType;
        this.color = color;
    }

    // Implementing the method createDesign
    @Override
    public final void createDesign() {
        System.out.println("Creating a car design...");
        System.out.println("Design details:");
        System.out.println("- Engine type: " + engineType);
        System.out.println("- Color: " + color);
    }

    public final String getEngineType() {
        return engineType;
    }

    /*
    create a method to show common car info, each car has the same info
    this method cannot be overridden
     */     
    public final void showCommonCarInfo() {
        System.out.println("This car has engine type: " + engineType);
        System.out.println("This car has color: " + color);
    }

    /*
    create a method to show specific car info, specific car has specific info
    this method can be overridde
     */     
    public void showSpecificCarInfo(){};

     /*
    create an abstract method to handle the running of the specific car
    this method must be overridden
     */
    public abstract void run();
}

    

