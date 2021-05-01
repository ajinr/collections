package com.tkh.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceDemo {

	public static void main(String[] args) {

		List<Integer> values= new ArrayList();
		values.add(652);
		values.add(598);
		values.add(961);
	//	values.remove(9);
		Comparator< Integer> comparator= new ComparatorImpl();
		Collections.sort(values,comparator);
		//Collections.reverse(values);

		for(int v:values) {
			System.out.println(v); 
		}


	} 	 

}
