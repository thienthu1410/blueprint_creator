package io.github.thienthu1410;

public abstract class BluePrint {

    private String designType; //Purpose of the blueprint, e.g. design car, design house...
    public BluePrint(String designType) {
        this.designType = designType;

    }

    
    public abstract void createDesign();
    
    /*
    create a method to show purpose of blueprint
    this method cannot be overridden
     */ 
    public final void showBlueprintInfo() {
        System.out.println("This is the blueprint for " + designType);
    }

    /*
    create a method to get design type
    this method cannot be overridden
     */ 
    public final String getDesignType(){
        return designType;
    }

}
