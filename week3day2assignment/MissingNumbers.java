package week3day2assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {
public static void main(String[] args) {
int[] array = {1,2,4,5,7,9,10,11,12,14,15,17,18,20};

Set<Integer> set = new TreeSet<Integer>();

for(int i:array) {
	set.add(i);
	}
		System.out.println(set);
		
		List<Integer> list = new ArrayList<Integer>(set);
		
		for(int j=0;j<=(set.size()-1);j++) {
			try {
		if(list.get(j)+1==list.get(j+1)) {
				continue;
			}
		else {
			int missingnumber = list.get(j)+1;
			System.out.println("Missing number is "+missingnumber);
		}
			}
		
		catch(Exception e) {
		}
		}
		}
			
			
		}
				
		
		
		


