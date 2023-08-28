package ArrayPrograms;

public class SmallestStringInTheArray {

	public static void main(String[] args) {
		String []s= {"jkj","kjhjb","bgk","hb","hbb","jd"};
		
		String small=s[0];
		int lengthsmall = small.length();
           for(int i=1;i<s.length;i++) {
        	   if(lengthsmall>s[i].length()) {
        		   lengthsmall=s[i].length();
        	   }
           }
           for(int i=0;i<s.length;i++) {
        	   if(lengthsmall==s[i].length()) {
        		   System.out.println(s[i]);
        	   }
           }
	}

}
