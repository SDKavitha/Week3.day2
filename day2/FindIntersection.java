package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] ar1={3,2,11,4,6,7};
		int[] ar2={1,2,8,4,9,7};
		List<Integer>ls1=new ArrayList<Integer>();
		for(int i=0;i<ar1.length;i++)
		{
			ls1.add(ar1[i]);
		}
       System.out.println("First list : "+ls1);
       
       List<Integer>ls2=new ArrayList<Integer>();
		for(int j=0;j<ar2.length;j++)
		{
			ls2.add(ar2[j]);
		}
      System.out.println("Second list : "+ls2);
      
      System.out.println("Intersection of 2 lists :");
      
      for(int i=0;i<ls1.size();i++)
      {
    	  for(int j=0;j<ls2.size();j++)
    	  {
    		  if(ls1.get(i).equals(ls2.get(j)))
    		  {
    			  System.out.println(ls1.get(i));
    		  }
    	  }
      }
	}

}
