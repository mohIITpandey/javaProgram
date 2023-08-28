package stringsssss;

import java.util.LinkedHashSet;

public class ReverseStringInAArrayWithPosition {

	public static void main(String[] args) {
		 //remove the doublicate word in a string
		String s="I am a i am a Software Engineer";
	   s=s.toLowerCase();
	    String[] a = s.split(" ");
	  LinkedHashSet<String> set= new LinkedHashSet<String>();
	for(int i=0;i<a.length;i++) {
		set.add(a[i]);
	}
    for(String ch:set) {
    	System.out.print(ch+" ");
    }
   
	
	
	//find the position of each word with and withoud doublicates
	
	}
}
