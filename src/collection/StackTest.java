package collection;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		
		s.push("둘리");
		s.push("또치");
		s.push("희동이");
		
		while(s.isEmpty() == false) {
			String value = s.pop();
			System.out.println(value);
		}
		
		// 비어있는 경우, EmptyStackException 발생
		s.pop();
		s.push("둘리");
		s.push("또치");
		s.push("희동이");
		
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}
}
