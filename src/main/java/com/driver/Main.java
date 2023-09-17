package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //obj.name = "Arjun";
        //name has private access in com.driver.RWOnly
        obj.setName("Arjun");
        System.out.println(obj.getName());
    }
  
}