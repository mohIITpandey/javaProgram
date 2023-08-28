package stringsssss;

public class ReverseString {

	public static void main(String[] args) {
		
		//for print directly
//		String s="mohitpandey";
//        for(int i=s.length()-1;i>=0;i--) {
//        	System.out.print(s.charAt(i)+" ");
//        }
        
		
		
		//print using array
//        String s="mohitpandey";
//        char[]c=s.toCharArray();
//        for(int i=c.length-1;i>=0;i--) {
//        	System.out.print(c[i]);
//        }
        
		//print using 2nd string
//        String s="mohitpandey";  
//        String rev="";
//        for(int i=s.length()-1;i>=0;i--) {
//        	rev=rev+s.charAt(i);
//        }
//        System.out.println(rev);
        
		
		//print using without string length variable 
//        String s="mohitpandey"; 
//        char[]c=s.toCharArray();
//        int count=0;
//        for(char ch:c) {
//        	count++;
//        }
//        for(int i=count-1;i>=0;i--) {
//        	System.out.print(c[i]);
//        }
        
        String s="mohitpandey"; 
        StringBuilder s1=new StringBuilder(s);
        System.out.println(s1.reverse());
        
        
	}

}
