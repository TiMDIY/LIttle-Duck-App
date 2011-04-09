package com.ederig.duck.behavior;

import com.ederig.duck.interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void quack() {
		System.out.println("Im flying with a rocket");

	}

}
