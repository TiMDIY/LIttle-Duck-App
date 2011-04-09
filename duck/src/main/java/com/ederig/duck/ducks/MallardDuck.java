package com.ederig.duck.ducks;

import com.ederig.duck.behavior.FlyWithWings;
import com.ederig.duck.behavior.Quack;
import com.ederig.duck.interfaces.FlyBehavior;
import com.ederig.duck.interfaces.QuackBehavior;

public class MallardDuck extends Duck{
	
	 public MallardDuck(){
		 quackBehavior = new Quack();
		 flyBehavior = new FlyWithWings();
	 }
	
	 public void display(){
		 System.out.println("I'm a real Mallard Duck");
	 }

}
