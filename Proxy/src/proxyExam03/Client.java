package proxyExam03;

public class Client {
	public static void main(String[] args) {
		GameService gameService = new GameServiceProxy();
		gameService.startGame(); 
	}
}
