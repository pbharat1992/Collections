package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll=new LinkedList<String>();
 //add
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("test");
		//print:
		System.out.println("contents in the list"+ ll);
		//addfirst
		ll.addFirst("bharat");
		//addlast
		ll.addLast("kumar");
		System.out.println("contents in the list"+ll);
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0,"tom");
		System.out.println(ll.get(0));
		//remove
		ll.removeFirst();
		ll.removeLast();
		System.out.println("contents in the list"+ll);
		//remove in particular position
		ll.remove(2);
		System.out.println("contents in the list"+ll);
		//how to print all the values of th list
		//for loop
		System.out.println("************using for loop");
		
      for(int n=0;n<ll.size();n++) {
    	  System.out.println(ll.get(n));}
    	  //advance for loop
      System.out.println("*****using advance for loop");
        for(String str:ll)	{
        	System.out.println(str);}
        //iterator
        System.out.println("*****using iterator");
        Iterator<String> it=ll.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        
        //while
        System.out.println("******using while loop");
        int num=0;
        while(ll.size()>num) {
        	
        	System.out.println(ll.get(num));
        	num++;
        	
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
		
		
		
		
		
		
}
}
