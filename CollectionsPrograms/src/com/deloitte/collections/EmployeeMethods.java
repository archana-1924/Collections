package com.deloitte.collections;

import java.util.HashSet;
import java.util.Set;

public class EmployeeMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee e1= new Employee(101,"Rahul",250000.0);
     Employee e2= new Employee(102,"Priya",300000.0);
     Employee e3= new Employee(103,"Kriti",450000.0);
     Employee e4= new Employee(101,"Rahul",250000.0);
     Set<Employee> emps= new HashSet<>();
     emps.add(e1);
     emps.add(e2);
     emps.add(e3);
     emps.add(e4);
     
     emps.forEach(System.out::println);
    /* List<Employee> empList= Arrays.asList(e1,e2,e3);
     Collections.sort(empList);
     empList.forEach(System.out::println);
     
     Comparator<Employee> 
       
     List<Integer> nums= Arrays.asList(5,2,10,1,6);
     Collections.sort(nums);
     nums.forEach(System.out::println);*/
     
     
	}
}
