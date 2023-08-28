package javaarrayprogram;

public class practiceeee {
	//1
	//1 2
	//1 2 3
	//1 2 3 4
public static void main(String[] args) {
	int x=4;
//	for(int i=1;i<=x;i++) {
//		for(int j=1;j<=i;j++) {
//		System.out.print(j+" ");
//		}
//		System.out.println();
//	}
	
	//1
	//2 1
	//3 2 1
	//4 3 2 1
	
	
//	for(int i=1;i<=x;i++) {
//		for(int j=i;j>0;j--) {
//			System.out.print(j+" ");
//		}System.out.println();
//	}
	
	//a
	//a b
	//a b c
	//a b c d
//	for(int i=1;i<=x;i++) {
//		for(int j=1;j<=i;j++) {
//			System.out.print((char)(j+96)+" ");
//		}System.out.println( );
//	}
	
	
	//        i
	//      i n
	//    i n d
	//  i n d i
	//i n d i a
	String s="india";
	for(int i=0;i<s.length();i++) {
		for(int j=s.length()-i;j>1;j--) {
			System.out.print("  ");		
		}
		for(int j=0;j<=i;j++ ) {
			System.out.print(s.charAt(j)+" ");
		}
		System.out.println();
	}
	
	
	
	
	
	
	
	
}
}
