package stringsssss;


import java.util.LinkedHashSet;

public class removeDoublicate {

	public static void main(String[] args) {
    String s="Bolo Bolo Har Har mahadev";
    s=s.toLowerCase();
    s=s.replace(" " , "");
    LinkedHashSet<Character> set= new LinkedHashSet<Character>();
    for(int i=0;i<s.length();i++) {
    	set.add(s.charAt(i));
    }
    for(Character ch:set) {
    	System.out.print(ch);
    }
	}

}
