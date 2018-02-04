package com.serializationPrevention;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {
public static void main(String[] args) throws IOException, ClassNotFoundException{
	//Singleton.getInstance().print();
	Singleton instance1 = Singleton.getInstance();
	Singleton.getInstance().print();
	FileOutputStream fos=new FileOutputStream("test.text");
	ObjectOutputStream obs=new ObjectOutputStream(fos);
	obs.writeObject(instance1);
	obs.close();
	// deserialization
	FileInputStream fis=new FileInputStream("test.text");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Singleton instance2=(Singleton)ois.readObject();
	ois.close();
	
	System.out.println("main object= "+instance1.hashCode());
	System.out.println("clone object = "+instance2.hashCode());
}
}
