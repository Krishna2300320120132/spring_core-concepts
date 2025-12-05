package com.substring.core.concepts;

public class Car {

Engine engine;

public Car(Engine engine){
    this.engine=engine;
}


     public void startcar(){
//        Engine start karna hai apne ko
//        Car depend hai engine pr to hame engine ka dependecy bana padega
        System.out.println("Car is starting");
        engine.startengine();
        System.out.println("Car started now.");

    }
}
