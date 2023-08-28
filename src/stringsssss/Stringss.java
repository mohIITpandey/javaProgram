package stringsssss;

public class Stringss {
  public static void main(String[] args) {
	String s="hello i am mohit pandey hello pradeep";
	System.out.println(s);
	String s1=s.replace(" ","");
	//System.out.println(s1);
	String s2 = "";
	for(int j=s1.length()-1;j>=0;j--) {
	s2=s2+s1.charAt(j);
	}
	//System.out.println(s2);
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			System.out.print(s2.charAt(count));
			count++;
		}else {
			System.out.print(' ');
		}
	}
		
	 
	  
	  
	  
		
//	if(s.charAt(j-1)==' ' && j-1>=0) {
//		s2=" "+s2;
//	
//	}
//	System.out.println(s2);
}
  }
