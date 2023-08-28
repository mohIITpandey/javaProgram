package stringsssss;

import java.util.LinkedHashSet;

public class OccuranceOfEachWord {

	public static void main(String[] args) {
		//print number of doublicate words in a string
			String s="I am a i am a Software Engineer";
		   s=s.toLowerCase();
		    String[] a = s.split(" ");
 LinkedHashSet<String> set= new LinkedHashSet<String>();
 for(int i=0;i<a.length;i++) {
	 set.add(a[i]);
 }
 for(String ch:set) {
	 int count=0;
	 for(int i=0;i<a.length;i++) {
		 if(ch.equals(a[i])) {
			 count++;
		 }
	 }
	 if(count>1)
	 System.out.println(ch+"---"+ count);
	
 }

	}

}
