package com.tkh.collectionAndList;

public class Test {

	public static void main(String[] args) {
		int num=11111;
		int count=0;
		while (num!=0) {
			if(num%10==1)
				count+=1;
			num=num/10;
		}
		System.out.println(count);

	}

}
