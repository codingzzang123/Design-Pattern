package DynamicProxyExam;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInJava {

	public static void main(String[] args) {
		ProxyInJava proxyInJava = new ProxyInJava();
		proxyInJava.dynamicProxy();
	}

	private void dynamicProxy() {
		GameService gameServiceProxy = getGameServiceProxy(new DefaultGameService());
		gameServiceProxy.startGame();
	}
	/* 런타임에 동적 프록시를 생성 */
	private GameService getGameServiceProxy(GameService target) {
		return (GameService)Proxy.newProxyInstance(this.getClass().getClassLoader(),
				new Class[] {GameService.class},new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("before");
				method.invoke(target, args);
				System.out.println("after");
				return null;
			}
		});
	}
}
