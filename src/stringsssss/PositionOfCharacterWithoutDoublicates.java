package stringsssss;

import java.util.LinkedHashSet;

public class PositionOfCharacterWithoutDoublicates {

	public static void main(String[] args) {
		 String s="Bolo Bolo Har Har mahadev";
	        s=s.toLowerCase();
	        s=s.replace(" ", "");
	        LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	        for(int i=0;i<s.length();i++) {
	        	set.add(s.charAt(i));
	        }
	        for(char ch:set) {
	        	for(int i=0;i<s.length();i++) {
	        		if(ch==s.charAt(i)) {
		        		System.out.println(ch+" is comes at "+(i+1));
                        break;
	        		}
	        	}
	        		
	        	}
	        }
	        
	}


