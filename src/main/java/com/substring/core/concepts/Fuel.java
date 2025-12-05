package com.substring.core.concepts;

import org.springframework.stereotype.Component;

@Component("petrol")
public class Fuel {
    public void use(){
        System.out.println("engine using petrol..");
    }
}
