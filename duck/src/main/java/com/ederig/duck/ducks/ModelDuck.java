package com.ederig.duck.ducks;

import com.ederig.duck.behavior.FlyNoWay;
import com.ederig.duck.behavior.Quack;

public class ModelDuck extends Duck{
	
	 public ModelDuck(){
		 quackBehavior = new Quack();
		 flyBehavior = new FlyNoWay();
	 }
	
	 public void display(){
		 System.out.println("I'm a real Mallard Duck");
	 }

}
