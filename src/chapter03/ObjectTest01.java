package chapter03;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);
		
		System.out.println(p.getClass()); // 객체가 생성된 정보 (reflection)
		System.out.println(p.hashCode()); // address X 
										  // reference X
										  // address 기반의 hashing 값
		System.out.println(p);
		System.out.println(p.toString()); // getClass() + "@" + hashCode()
		
		String s = new String("Hello World");
	}

}
