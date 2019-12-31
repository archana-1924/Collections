package com.deloitte.collections;


import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class HashSetDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     @SuppressWarnings("rawtypes")
	Set items= new HashSet();
     items.add("Manish");
     items.add("Manish");
     items.add(25);
     items.add(25);
     items.add(25);
     items.add(true);
     items.add(20.6);
     
     for(Object item:items)
     {
    	 System.out.println(item);
     }
     items.remove(true);
     System.out.println("\nAfter removing: ");
     for(Object item:items)
     {
    	 System.out.println(item);  //Prints the items randomly in hashset... random order
     } 
     
     
     Set<Integer> items1= new TreeSet<>();
     items1.add(25);
     items1.add(25);
     items1.add(25);
     items1.add(2);
     items1.add(10);
     items1.add(20);
     System.out.println("\nTreeSet values: ");
     for(Object item:items1)
     {
    	 System.out.println(item); //Prints items in ascending order in treeSet
     } 
     
     
     System.out.println("\nStack values: ");
     Stack<String> items3 = new Stack<>();
     items3.push("AAA");
     items3.push("BBB");
     items3.push("CCC");
     items3.push("DDD");
     items3.push("EEE");
     
     while(!items.isEmpty())
     {
    	 System.out.println(items3.pop());
     }
	}

}
