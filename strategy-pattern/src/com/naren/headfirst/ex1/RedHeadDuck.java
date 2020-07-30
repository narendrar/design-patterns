package com.naren.headfirst.ex1;

public class RedHeadDuck extends Duck {
   public RedHeadDuck() {
      quackBehavior = new Squeak();
      flyBehavior = new FlyWithWings();
   }

   public void display() {
      System.out.println("I’m a real Mallard duck");
   }
}
