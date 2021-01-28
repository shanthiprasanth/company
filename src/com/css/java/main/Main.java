package com.css.java.main;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		Map<Integer,String> employees=new HashMap<>();
		employees.put(100, "Praveen");
		employees.put(101, "Shan");
		employees.put(102, "Dinesh");

		
		System.out.println(employees.get(101));
	}

}
