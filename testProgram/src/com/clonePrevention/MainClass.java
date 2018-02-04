package com.clonePrevention;

public class MainClass {
public static void main(String[] args) throws CloneNotSupportedException {
	//Singleton.getInstance().print();
	Singleton obj=Singleton.getInstance();
	Singleton obj1=(Singleton)obj.clone();
	obj.print();
	System.out.println("main object= "+obj.hashCode());
	System.out.println("clone object = "+obj1.hashCode());
}
}
