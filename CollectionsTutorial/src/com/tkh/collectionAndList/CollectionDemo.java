package com.tkh.collectionAndList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//collection and Generics demo 
public class CollectionDemo {

	public static void main(String[] args) {
		int A[]= new int[10];
		Object Arr[]= new Object[5];
		Arr[0]=1;
		Arr[1]="Ajin";
		
		Collection<Integer> values= new ArrayList();
		values.add(6);
		values.add(5);
		values.add(9);
		values.remove(9);
		
		/*
		 * Iterator itr= values.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		for(int v:values) {
			System.out.println(v); 
		}

	}

}
