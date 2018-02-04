package com.serializationPrevention;

import java.io.Serializable;

public class Singleton implements Serializable {
private static Singleton instance=new Singleton();
private Singleton(){
	
}
// implement readResolve method
protected Object readResolve()
{
    return instance;
}
public static Singleton getInstance(){
	return instance;
}
void print(){
	System.out.println("singleton");
}
}
