package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class App {

	public static void main(String[] args) {
		System.out.println(process("Hello World!", String::toLowerCase) );
		
		String [] names = {"Mr. Jones", "Dr. Uber", "Ms. Jane"};
		
	//	Arrays.sort(names, Comparator.comparing(name -> name.split(" ")[1]));
		Arrays.sort(names, Comparator.comparing(App::firstName));
		
		System.out.println(Arrays.toString(names));
	}

	private static String process(String s, Function<String, String> processor) {
		return processor.apply(s);
	}
	
	private static String firstName(String name) {
		return name.split(" ")[1];
	}
	
	
	
}
