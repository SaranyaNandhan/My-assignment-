package week3day2assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] array = {1,2,4,5,7,9,10,11,12,14,15,17,18,20};

		Set<Integer> set = new TreeSet<Integer>();
		
		for(int i=0;i<array.length;i++) {
			
			int x =array[i];
			set.add(x);
		}
		
		List<Integer> list = new ArrayList<>(set);
		System.out.println(list);
		int size= list.size();
		
	System.out.println("list sze"+size);
	
	int t =list.get(size-2);
	System.out.println("Find Second Largest Number is :"+t);

						

	}

}
