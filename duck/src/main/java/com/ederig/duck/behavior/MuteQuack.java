package com.ederig.duck.behavior;

import com.ederig.duck.interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Silence...");

	}

}
