package com.integerTest;

import java.util.Arrays;

public class ArrayListImplementation {
private Object[] mystore;
private int actsize=0;
 public ArrayListImplementation(){
	 mystore=new Object[10];
 }
 public void add(Object obj){
	 if(mystore.length- actsize <=5){
		increaseArrayListSize();
	 }
	 mystore[actsize++]=obj;
 }
 public Object get(int index){
     if(index < actsize){
         return mystore[index];
     } else {
         throw new ArrayIndexOutOfBoundsException();
     }
 }
 public Object remove(int index){
	 if(index<actsize){
		 Object obj=mystore[index];
		 mystore[index]=null;
		 int tmp=index;
		 while (tmp<actsize) {
			 mystore[tmp]=mystore[tmp+1];
			 mystore[tmp+1] = null;
             tmp++;
		}
		 actsize--;
		 return obj;
	 }else{
		 throw new ArrayIndexOutOfBoundsException();
	 }
 }
 public void increaseArrayListSize(){
	 mystore=Arrays.copyOf(mystore,mystore.length*3);
 }
 public int size(){
	 return actsize;
 }
 public static void main(String[] args) {
	ArrayListImplementation ali=new ArrayListImplementation();
	ali.add(3);
	ali.add(8);
	ali.add(9);
	ali.add(3);
	ali.add(8);
	ali.add(9);
	ali.add(3);
	ali.add(8);
	ali.add(9);
	ali.add(3);
	ali.add(8);
	ali.add(9);
	System.out.println(ali.size());
	for(int i=0;i<ali.size();i++){
		System.out.println(ali.get(i));
	}
}
}
