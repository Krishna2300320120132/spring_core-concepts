package com.substring.core.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mercedes")
public class Car {

//    car is dependent on engine
Engine engine;

public Car(Engine engine){
    this.engine=engine;
}
public Car(){

}

    public Engine getEngine() {
        return engine;
    }
@Autowired
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startCar(){
//        Engine start karna hai apne ko
//        Car depend hai engine pr to hame engine ka dependecy bana padega
        System.out.println("Car is starting");
        engine.startEngine();
        System.out.println("Car started now.");

    }
}
