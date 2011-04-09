package com.ederig.duck.behavior;

import com.ederig.duck.interfaces.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void quack() {
		System.out.println("Im flying");

	}

}
