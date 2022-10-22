package week3day2assignment;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {

	public static void main(String[] args) {
		String[] array = new String[] {"Gold","Diamond","Platinum","Rose Gold","Silver","Bronze","Copper","Metal"};
		
		List<String> list = Arrays.asList(array);
		
		System.out.println("Before Sort");
		System.out.println(list);
		
		System.out.println("After Sorting");
	
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		
	System.out.println(list);
		
	
		

	}

}
