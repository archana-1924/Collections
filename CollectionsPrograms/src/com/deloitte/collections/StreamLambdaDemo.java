package com.deloitte.collections;

import java.util.Arrays;
import java.util.List;

public class StreamLambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<String> items = Arrays.asList("Abdul","Kevin","Ju","Joe","Aseef");
    items.stream().filter(s->s.length()>4).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
