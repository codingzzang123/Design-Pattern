package proxyExam02;

public class GameServiceProxy extends GameService{
	@Override
	public void gameStart(){
		long before = System.currentTimeMillis();
		super.gameStart();
		System.out.println(System.currentTimeMillis()-before);
	}
}
