package arraysDesc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Multplication_Array {

	public static void main(String[] args) {
		
		int [] arr = { 1,2,3,4,5,6,7,8};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 ==0) {
				
				System.out.println(arr[i]);
				break;
			}else
			{
				System.out.println(arr[i] +" is not multiple of 2");
			}
			
		}
		ArrayList<String> a = new ArrayList<String>();
		a.add("ARIF");
		a.add("test");
		a.add("rahim");
		a.add("Rahul");
		
		System.out.println(a.get(2));
		
		for(int i=0; i<a.size();i++) {
			
			System.out.println(a.get(i));
		}
		
		System.out.println("********************************");
		
		//Enhanced for loop
		
		 for( String var  :a) {
			 
			 System.out.println(var);
			
		 }
		 
		 System.out.println(a.contains("Manik"));
		 System.out.println(a.contains("ARIF"));
	     String [] arr1 = { "rahim","money","test"};
		 List<String> convertArrayList  = Arrays.asList(arr1);
		 System.out.println(convertArrayList.contains("test"));
	}

}
