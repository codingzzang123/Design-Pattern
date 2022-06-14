package actionFly;

public class CannotFly implements FlyBehavior{
	@Override
	public void flyBehavior() {
		System.out.println("날 수 없습니다");
	}
}
