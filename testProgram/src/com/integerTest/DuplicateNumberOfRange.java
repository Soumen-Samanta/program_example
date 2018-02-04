package com.integerTest;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateNumberOfRange {
public static void main(String[] args) {
	System.out.println("enter the range");
	Scanner sc=new Scanner(System.in);
	//int start=sc.nextInt();
	int end=sc.nextInt();
	int sum=0;
	//int len=(end-start)+1;
	ArrayList<Integer> list=new ArrayList<>();
	for(int i=1;i<=end;i++){
		list.add(i);
	}
	list.add(2);
	sum=end*(end+1)/2;
	int dupSum=0;
	
	System.out.println("sum= "+sum);
	for(Integer listElement:list){
		dupSum=dupSum+listElement;
	}
	System.out.println("total="+dupSum);
	int duplicate=dupSum-sum;
	System.out.println("duplicate is =" +duplicate);
	
}
}
