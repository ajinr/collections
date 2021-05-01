package com.tkh.setAndTree;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> values= new HashSet<Integer>();
		values.add(5);
		values.add(9);
		values.add(8);
		values.add(9);
		values.add(52);
		values.add(100);
		values.add(77);
		values.add(25);
		
		Set<Integer> valuesTS= new TreeSet<Integer>();
		
		valuesTS.addAll(values);
		System.out.println("HashSet");
		for(Integer v:values)
			System.out.println(v);

		System.out.println("TreeSet");
		for(Integer v:valuesTS)
			System.out.println(v);

	}

}
