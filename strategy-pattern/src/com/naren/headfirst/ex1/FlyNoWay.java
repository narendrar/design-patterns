package com.naren.headfirst.ex1;

public class FlyNoWay implements FlyBehavior {
   @Override public void fly() {
      System.out.println("Not able to fly...");
   }
}
