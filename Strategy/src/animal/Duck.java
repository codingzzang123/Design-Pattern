package animal;

import actionFly.FlyBehavior;

public abstract class Duck {
	
	private FlyBehavior flyAction;
	
	public void swim() {
		System.out.println("오리가 물에 떠있습니다.");
	}
	public abstract void display();
	
	public void setFlyAction(FlyBehavior flyAction) {
		this.flyAction = flyAction;
	}
	
	public void fly() {
		flyAction.flyBehavior();
	}
	
}
