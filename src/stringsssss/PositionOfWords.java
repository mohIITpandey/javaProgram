package stringsssss;

import java.util.LinkedHashSet;

public class PositionOfWords {

	public static void main(String[] args) {
		//find the position of each word with and withoud doublicates
		String s="I am a i am a Software Engineer";
		   s=s.toLowerCase();
		    String[] a = s.split(" ");
   for(int i=0;i<a.length;i++) {
	   System.out.println(a[i]+" comes at "+(i+1));
     }
		
		

	}

}
