package animal;

import actionFly.FlyBehavior;

public abstract class Duck {
	
	private FlyBehavior flyAction;
	
	public void swim() {
		System.out.println("������ ���� ���ֽ��ϴ�.");
	}
	public abstract void display();
	
	public void setFlyAction(FlyBehavior flyAction) {
		this.flyAction = flyAction;
	}
	
	public void fly() {
		flyAction.flyBehavior();
	}
	
}
