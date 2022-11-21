package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer>set=new HashSet<Integer>();
		
		System.out.println("Duplicates in array: ");
		for(int i=0;i<arr.length;i++)
		{
			if(!set.add(arr[i]))
			{
				System.out.println(arr[i]);
			}
		}
		

	}

}
