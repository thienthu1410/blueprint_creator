package io.github.thienthu1410.example_usage;

// How to create a specific car from car blueprint
public class XL7 extends CarBlueprint {


    public XL7(String color) {
        super("1.5L Gasoline Engine", color);
    }


   @Override
   public void run() {
       System.out.println("XL7 car is running");
       
   }

   @Override
   public void showSpecificCarInfo() {
    System.out.println("Logo: XL7");
   }
}

    

