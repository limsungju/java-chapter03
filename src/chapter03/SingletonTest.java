package chapter03;

public class SingletonTest {
	
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s);
	}
}
