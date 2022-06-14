package actionFly;

public class CanFly implements FlyBehavior{
	@Override
	public void flyBehavior() {
		System.out.println("날 수 있습니다.");
	}
}
