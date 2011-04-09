package com.ederig.duck.behavior;

import com.ederig.duck.interfaces.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak...");

	}

}
