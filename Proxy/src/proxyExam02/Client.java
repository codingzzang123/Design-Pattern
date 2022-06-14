package proxyExam02;



public class Client {
	public static void main(String[] args){
		GameService service = new GameServiceProxy();
		service.gameStart();
	}
}
