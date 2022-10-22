package week3day2assignment;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumber {

	public static void main(String[] args) {
		int data[] ={1,2,3,4,5,6,7,8,8,2,7,99};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i =0;i<data.length;i++) {
			
			int x = data[i];
			boolean add =set.add(x);
			
			if(!add) {
				System.out.println("Duplicate element "+x);
			}
		
			}
		System.out.println(set);
		

	}

}
