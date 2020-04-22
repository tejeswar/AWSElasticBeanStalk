package com.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
//		Map<Employee,Integer> hm = new HashMap<>();
//		System.out.println(hm.size());
// 		hm.put(null,1);
// 		System.out.println(hm.size());
// 		hm.put(null,2);
// 		System.out.println(hm.size());
// 		System.out.println(hm.get(null));
		
		
		
		Employee e1 = new Employee("a1", 1);
		Employee e2 = new Employee("b1", 1);
		Map<Employee,Integer> hm = new HashMap<>();
		System.out.println(hm.get(e1));
		hm.put(null, 100000);
		hm.put(e1,1);
		hm.put(e2,2);
		System.out.println(hm.size());
		System.out.println(hm.get(e1));
		System.out.println(hm.get(e2));
		e1 = null;
		e2 = null;
		System.out.println(hm.size());
		System.out.println(hm.get(e1));
		System.out.println(hm.get(e2));
	}
	
	
	
	
	
}
