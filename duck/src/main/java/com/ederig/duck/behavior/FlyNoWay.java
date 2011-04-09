package com.ederig.duck.behavior;

import com.ederig.duck.interfaces.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void quack() {
		System.out.println("I cant fly");

	}

}
