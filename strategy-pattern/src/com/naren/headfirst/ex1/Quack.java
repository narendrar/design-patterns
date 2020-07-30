package com.naren.headfirst.ex1;

public class Quack implements QuackBehavior {
   @Override public void quack() {
      System.out.println("Quack");
   }
}
