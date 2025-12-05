package com.substring.core;

import com.substring.core.concepts.Fuel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.substring.core.concepts.Engine;
import com.substring.core.concepts.Car;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Fuel fuel1=new Fuel();
////        engine depend hai fuel pr
//        Engine bmwengine1=new Engine(fuel1);
////yaha pr Car create kiye lekin engine pass nahi kiye
//        Car carsp321=new Car(bmwengine1);
//
////        Car ko start kr skte h
//        carsp321.startcar();

//        👆 ye ham apne se object bana rhe the


//       👇ab hm spring framework se banayenge
//        ab framework se bolege ki iska object doo
//        lekin phle batana padega ki mere pass itni file ka object hai



////        ye to xml Config se hua hai
//// container..
////itt maintain the context(xml) from the class path
//        ApplicationContext context  = new ClassPathXmlApplicationContext("Config.xml");
//   Fuel fuel=context.getBean("fuel",Fuel.class);
//        Engine enginebean=context.getBean("enginebean",Engine.class);
//        Car carbean= context.getBean("carbean", Car.class);
//
//   fuel.use();
//   enginebean.startengine();
//   carbean.startcar();








//        ba ye hm xml file me hai ab java file me annotation use kr ke hm bean use karenge

        ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
//        pahle jayega Config.java ke class me

        Fuel fuel=context.getBean("petrol",Fuel.class);
        fuel.use();
        Engine bmwEngine=context.getBean("bmwEngine", Engine.class);
        bmwEngine.startEngine();

        System.out.println("=====================================");
        Car mercedes= context.getBean("mercedes",Car.class);
        mercedes.startCar();
//        name ki jagah class ka camelcase use karega
    }
}
