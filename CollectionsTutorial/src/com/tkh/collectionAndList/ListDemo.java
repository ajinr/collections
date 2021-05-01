package com.tkh.collectionAndList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<Integer> values= new LinkedList<Integer>();
		values.add(6);
		values.add(5);
		values.add(9);
		values.add(1, 56);
	//	values.remove(9);
		
		//Collections.sort(values);

		for(int v:values) {
			System.out.println(v); 
		}


	}
}
