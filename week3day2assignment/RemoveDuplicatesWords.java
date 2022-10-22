package week3day2assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String s ="Work hard and get the success by that work";
		System.out.println(s);
		String[] strArray =s.split("");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for (String st:strArray) {
			System.out.println(st);
		}
		System.out.println(set);
		
}

}
