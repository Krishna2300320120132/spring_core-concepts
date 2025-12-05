package com.substring.core.concepts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bmwEngine")
public class Engine {
@Autowired  //ye to pura field/property injection pr annotation laga hai aur ye setter method ko call nhi kr skta h
    Fuel fuel;


@Autowired // constructor injection
    public Engine(Fuel fuel){
        this.fuel=fuel;
    }

    public Engine(){
        System.out.println("engine created default constructor");
}

    public Fuel getFuel() {
        return fuel;
    }
@Autowired //setter injection
    public void setFuel(Fuel fuel) {
        System.out.println("setting fuel to engine ");
        this.fuel = fuel;
    }

    //    engine fuel pr depend hai to iski dependecy bana do
   public void startEngine(){
        fuel.use();
        System.out.println("engine started..");

    }
}
