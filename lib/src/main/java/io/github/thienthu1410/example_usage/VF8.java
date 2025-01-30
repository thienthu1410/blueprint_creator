package io.github.thienthu1410.example_usage;

// How to create a specific car from car blueprint
public class VF8 extends CarBlueprint {


    public VF8(String color) {
        super("Dual Electric Motors - AWD", color);
    }


   @Override
   public void run() {
       System.out.println("VF8 car is running");
       
   }

   @Override
   public void showSpecificCarInfo() {
    System.out.println("Logo: VF8");
   }
}

    

