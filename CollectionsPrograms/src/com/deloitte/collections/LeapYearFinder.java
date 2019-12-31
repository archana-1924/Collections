package com.deloitte.collections;

import java.util.Arrays;
import java.util.List;

public class LeapYearFinder {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
      List<Integer> years = Arrays.asList(2100,2000,2400,2800,2020,2005,2001,1996);
      years.stream().filter(s->s%4==0||(s%100==0 && s%400==0)).forEach(s->System.out.println(s));
	}

}
 