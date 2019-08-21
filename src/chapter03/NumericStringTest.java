package chapter03;

import java.util.Scanner;

public class NumericStringTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		
		if(s.matches("-?\\d+?") == false) {
			System.out.println("숫자만 입력해야 합니다.");
			return;
		}
		
		int value = -1;
		value = Integer.parseInt(s);
		
		
//		try {
//			value = Integer.parseInt(s);
//		} catch(NumberFormatException e) {
//			System.out.println("숫자만 입력해야 합니다.");
//			return;
//		}
		System.out.println(value);
	}
}
