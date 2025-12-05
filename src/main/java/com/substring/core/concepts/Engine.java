package com.substring.core.concepts;

public class Engine {

    Fuel fuel;

    public Engine(Fuel fuel){
        this.fuel=fuel;
    }

    public void setFuel(Fuel fuel) {
        this.fuel = fuel;
    }

    public Engine(){
        System.out.println("engine created default constructor");
}
//    engine fuel pr depend hai to iski dependecy bana do
   public void startengine(){
        fuel.use();
        System.out.println("engine started..");

    }
}
