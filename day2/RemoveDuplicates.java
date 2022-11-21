package week3.day2;

import java.util.ArrayList;
import java.util.List;


public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str = text.split(" ");
		int count=0;
		//List<String>lst=new ArrayList<String>(Arrays.asList(str));
		List<String>lst=new ArrayList<String>();
		
		for(int k=0;k<str.length;k++) {
			lst.add(str[k]);
			
		}
	
		System.out.println(lst);
		for(int i=0;i<lst.size();i++) {
			for(int j=i+1;j<lst.size();j++)
			{
			if(lst.get(i).equals(lst.get(j)))
			{
				count=count+1;
			}
			
			}
			if(count>1)
			{
				text=text.replace(lst.get(i), " ");
				break;
			}
		}
		System.out.println("Removed Duplicates:"+text);
		
	}

}
