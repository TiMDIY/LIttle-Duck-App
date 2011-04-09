package com.ederig.duck.behavior;

import com.ederig.duck.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quaaaack !");

	}

}
