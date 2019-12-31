package com.deloitte.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class StringBufferDemo
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums=Arrays.asList(5,2,1,3,10);
		List<Integer> oddSqs= nums.stream().filter((i)->i%2!=0).map((i)->i*i).collect(Collectors.toList());
		Collections.sort(oddSqs);
		oddSqs.forEach(System.out::println);
		int sum = nums.stream().filter((i)->i%2!=0).mapToInt((i)->i*i).sum();
		/*OR 
		 * int sum=0;
		   for(int num:nums)
		   {
			 if(num%2!=0)
			 {
				sum+=num*num;
			 }
		   }*/
		
		System.out.println("Sum = "+sum);
		
//StringBuffer
		
		/*class ForEachIterator<T> implements Consumer <T>
		{
			 @Override
			 public void accept(T t)
			 {
				 System.out.println(t);
			 }
		}
		
	List<String> sb= new ArrayList<>();
     sb.add("Rahul");
     sb.add("Rohit");
     sb.add("Ajay");
     for(StringBuffer sbs:sb)
    	 System.out.println(sbs);
     sb.forEach(t->System.out.println(t));
     //sb.forEach(System.out::println);
//     @SuppressWarnings("unused")
//	Iterator<StringBuffer> itr= sb.iterator();*/
	}

		
}