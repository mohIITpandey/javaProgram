package stringsssss;

public class PositionOfCharacterWithDoublicates {

	public static void main(String[] args) {
		 String s="Bolo Bolo Har Har mahadev";
	        s=s.toLowerCase();
	        s=s.replace(" ", "");
	        for(int i=0;i<s.length();i++) {
	        	System.out.println(s.charAt(i)+" comes at position "+(i+1));
	        }
		
	}

}
