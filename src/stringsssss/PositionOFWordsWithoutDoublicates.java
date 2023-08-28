package stringsssss;

import java.util.LinkedHashSet;

public class PositionOFWordsWithoutDoublicates {

	public static void main(String[] args) {
		String s="I am a i am a Software Engineer";
		   s=s.toLowerCase();
		    String[] a = s.split(" ");
LinkedHashSet<String> set= new LinkedHashSet<String>();
for(int i=0;i<a.length;i++) {
	 set.add(a[i]);
}
for(String ch:set) {
	 for(int i=0;i<a.length;i++) {
		 if(ch.equals(a[i])) {
			 System.out.println(ch+"---"+(i+1));
			 break;
		 }
	 }
	
	
}
	}

}
