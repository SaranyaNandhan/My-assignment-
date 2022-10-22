package week3day2assignment;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,3,4,5,6,7,8,8,2,7,99);
		System.out.println("Prin the list"+list);
		Set<Integer> set1 = new HashSet<Integer>(list);
		
		for(int i:set1) {
			
			System.out.println(i);
			
		}
		
		System.out.println(set1);
		
		

	}

}
