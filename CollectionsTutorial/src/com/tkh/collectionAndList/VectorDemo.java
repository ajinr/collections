package com.tkh.collectionAndList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
	

	public static void main(String[] args) {

		List<Integer> values= new Vector();
		values.add(6);
		values.add(5);
		values.add(9);
	//	values.remove(9);
		
		Collections.sort(values);

		for(int v:values) {
			System.out.println(v); 
		}


	}

}
