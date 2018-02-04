package com.singlyLinkedList;

import java.util.LinkedList;

public class SinglyLinkedListImpl<T> {
private Node<T> head;


// add element at end of the list
public void add(T element){
	 Node<T> nd = new Node<T>();
     nd.setValue(element);
    // System.out.println("Adding: "+element);
     Node<T> tmp = head;
     while(true){
         if(tmp == null){
             //since there is only one element, both head and 
             //tail points to the same object.
             head = nd;
             break;
         } else if(tmp.getNextRef() == null){
             tmp.setNextRef(nd);
             break;
         } else {
             tmp = tmp.getNextRef();
         }
     }
     
  }
// add element at any position of the linkedlist
public void addAtPosition(T element,int pos){
	Node<T> nd=new Node<>();
	Node<T> ptr=head;
	pos=pos-1;
	
	
}
// traverse a linkedlist
public void traverse(){
    
    Node<T> tmp = head;
    while(true){
        if(tmp == null){
            break;
        }
        System.out.print(tmp.getValue()+"\t");
        tmp = tmp.getNextRef();
    }
}
// reverse a linkedlist
public void reverse(){
    
    System.out.println("\nreversing the linked list\n");
    Node<T> prev = null;
    Node<T> current = head;
    Node<T> next = null;
    while(current != null){
        next = current.getNextRef();
        current.setNextRef(prev);
        prev = current;
        current = next;
    }
    head = prev;
}
public static void main(String[] args) {
	SinglyLinkedListImpl<Integer> sl=new SinglyLinkedListImpl<>();
	sl.add(12);
	sl.add(1);
	sl.add(14);
	sl.add(11);
	sl.add(10);
	sl.traverse();
	/*LinkedList<Object> list=new LinkedList<>();
	list.add("soumen");
	list.add("sd");
	list.add("ss");
	for(Object obj:list){
		System.out.println(obj.toString());
	}
	list.size();*/
	sl.reverse();
	sl.traverse();
	
}
}
