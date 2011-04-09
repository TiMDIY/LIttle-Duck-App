package com.ederig.duck.simulator;

import com.ederig.duck.behavior.FlyRocketPowered;
import com.ederig.duck.ducks.Duck;
import com.ederig.duck.ducks.MallardDuck;
import com.ederig.duck.ducks.ModelDuck;

public class MiniDuckSimulator {
	
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
