package com.substring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//uske baad check karega conginguration hai
@Configuration
//phir com.substring.core.concepts is package me jayega and check karega conponent annotation hai
@ComponentScan(basePackages = {"com.substring.core.concepts"})
public class Config {



}
