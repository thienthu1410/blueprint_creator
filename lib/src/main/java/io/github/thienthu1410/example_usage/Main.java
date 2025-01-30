package io.github.thienthu1410.example_usage;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        XL7 xl7 = new XL7("Red");
        xl7.getDesignType();

        VF8 vf8 = new VF8("Pink");

        List<CarBlueprint> carLists = new ArrayList<CarBlueprint>();     
        carLists.add(xl7);
        carLists.add(vf8);
        for (CarBlueprint car : carLists) {
            car.showBlueprintInfo();
            car.createDesign();
            car.showCommonCarInfo();
            car.showSpecificCarInfo();
            car.run();
            System.out.println("-------------------");
        }
    }

}
