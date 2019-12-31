package com.deloitte.collections;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharactersMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Map<Character, Integer> charOcc= new HashMap<>();
         String str="Juliana Biju";
         
         for(char c: str.toCharArray())
         {
        	 if(charOcc.containsKey(c))
        	 {
        		 int oc=charOcc.get(c)+1;
        		 charOcc.put(c, oc);
        	 }
        	 else
        	 {
        		 charOcc.put(c, 1);
        	 }
         }
         charOcc.forEach((c,oc)->System.out.println(c+" -> "+oc));
	}

}
