package main;

import actionFly.CanFly;
import actionFly.CannotFly;
import duck.MallardDuck;
import duck.RubberDuck;

public class Main {
	public static void main(String[] args) {
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubber = new RubberDuck();
		
		mallard.display();
		mallard.swim();
		mallard.setFlyAction(new CanFly()); mallard.fly();
		System.out.println("----------");
		
		rubber.display();
		rubber.swim();
		rubber.setFlyAction(new CannotFly()); rubber.fly();
	}
}	
