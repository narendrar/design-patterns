package com.naren.headfirst.ex1;

public abstract class Duck {
   FlyBehavior flyBehavior;
   QuackBehavior quackBehavior;

   public Duck() {
   }

   public abstract void display();

   public void performQuack() {
      quackBehavior.quack();
   }

   public void performFly() {
      flyBehavior.fly();
   }

   public void swim() {
      System.out.println("All ducks float, even decoys!");
   }

   public void setFlyBehavior(FlyBehavior flyBehavior) {
      this.flyBehavior = flyBehavior;
   }

   public void setQuackBehavior(QuackBehavior quackBehavior) {
      this.quackBehavior = quackBehavior;
   }
}
