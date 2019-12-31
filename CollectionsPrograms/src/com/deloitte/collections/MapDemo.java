package com.deloitte.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<String,String> details = new HashMap<>();
    details.put("Archana", "Kerala");
    details.put("Ju", "Banglore");
    details.put("Irene", "Karnataka");
    
//    System.out.println("Enter a name : ");
//    @SuppressWarnings("resource")
//	String name= new Scanner(System.in).nextLine();
//    System.out.println("Location is : "+details.get(name));
 
//    OR
//    for(String key: details.keySet())
//    {
//    	System.out.println("Name : "+key+" ; Location : "+details.get(key));
//    }
    
    details.forEach((k,v)->System.out.println("Name : "+k+" ; Location : "+v));
	}
}
