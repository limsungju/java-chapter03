package collection;

import java.util.HashSet;

public class HashSetTest2 {

	public static void main(String[] args) {
		HashSet<Money> set = new HashSet<Money>();
		
		set.add(new Money(1));
		set.add(new Money(2));
		set.add(new Money(3));
		set.add(new Money(1));
		
		for(Money m : set) {
			System.out.println(m);
		}
		
	}

}
