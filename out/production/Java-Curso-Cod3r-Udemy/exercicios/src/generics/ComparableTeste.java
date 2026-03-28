package generics;

import java.util.TreeSet;

public class ComparableTeste {

	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(5);
		nums.add(6);
		nums.add(0);
		nums.add(-123);
		nums.add(-150);
		
		nums.stream().forEach(System.out::println);
	}
}
