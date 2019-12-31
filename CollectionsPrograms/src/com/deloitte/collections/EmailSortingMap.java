package com.deloitte.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmailSortingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> emails= Arrays.asList("archana.iyer19@gmail.com","julianabiju.mec@gmail.com","kevin@hotmail.com","aseef@orkut.com","irene@deloitte.com","pavithra@deloitte.com","barun@orkut.com","sanaya@orkut.com","theja@hotmail.com");
       Map<String,List<String>> emailList= new HashMap<>();
       for(String email:emails)
       {
    	   String domain= email.substring(email.indexOf("@")+1, email.indexOf(".")-1);
    	   if(emailList.containsKey(domain))
    	   {
    		   List<String> em= emailList.get(domain);
    		   List<String> ems= new ArrayList<>(em);
    		   ems.add(email);
    		   emailList.put(domain, ems);
    	   }
    	   else
    	   {
    		   emailList.put(domain, Arrays.asList(email));
    	   }
       }
       emailList.forEach((d,e)->
       {
    	   System.out.println("Domain : "+d);
    	   System.out.println("----------------------------------");
    	   e.forEach((s)->System.out.println(s));;
       });
	}

}
