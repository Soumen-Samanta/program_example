package com.clonePrevention;

public class Singleton implements Cloneable {
private static Singleton instance=new Singleton();
private Singleton(){
	
}
@Override
protected Object clone()throws CloneNotSupportedException 
  {
   // return super.clone();
//	return instance; // if return same instance then it will clone the object
	throw new CloneNotSupportedException("Clone not possible");
}
public static Singleton getInstance(){
	return instance;
}
void print(){
	System.out.println("singleton");
}
}
