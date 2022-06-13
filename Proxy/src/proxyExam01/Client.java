package proxyExam01;

public class Client {
	public static void main(String[] args) {
		GameService service = new GameService();
		service.gameStart();
	}
}
