package com.substring.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.substring.core.concepts.Student;

//uske baad check karega conginguration hai
@Configuration
//phir com.substring.core.concepts is package me jayega and check karega conponent annotation hai
@ComponentScan(basePackages = {"com.substring.core.concepts"})
public class Config {

  @Bean(name="student1")
public Student getStudent(){
//      manuallly bean...
//      @bean kb use krte jb hm kisi class ko change nahi kr skte hai tb
      // jo method return karega wahi as a bean use hoga
    return new Student();
}

}
