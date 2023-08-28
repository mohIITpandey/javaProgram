package Patterns;

public class patternsss {
	public static void main(String[] args) {
		// a
		// a b
		// a b c
		// a b c d
		// a b c d e
		// int x=5;
//	for(int i=1;i<=x;i++) {
//		for(int j=0;j<i;j++) {
//			System.out.print((char)('a'+j));
//			System.out.print(" ");
//		}System.out.println();
//	}

		// a
		// b b
		// c c c
		// d d d d
		// e e e e e

//	for(int i=0;i<=x;i++) {
//		for(int j=0;j<i;j++) {
//			System.out.print((char)('a'+i-1));
//			System.out.print(" ");
//		}System.out.println();
//	}	

		// input=abcadbca
		// output=abc1d112
//		String s = "helloworld";
//		char[] sa = s.toCharArray();
//		boolean[] a = new boolean[sa.length];
//		for (int i = 0; i < sa.length - 1; i++) {
//			for (int j = i + 1; j < sa.length; j++) {
//				if (sa[j] == sa[i]) {
//					a[j] = true;
//				}
//			}
//		}
//		for (int i = 0; i < sa.length; i++) {
//			if (a[i] == false) {
//				System.out.print(sa[i]);
//			} else {
//				int count = 0;
//				for (int j = 0; j < i; j++) {
//					if (sa[i] == sa[j]) {
//						count++;
//					}
//				}
//				System.out.print(count);
//			}
//		}

//		 a
//		 b c
//		 d e f
//		 g h i j
//		 k l m n o
//		int x=5,ch=97;
//		for(int i=1;i<=x;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(ch++)+" ");
//			}System.out.println();
//		}
		
		//a
		//b c
		//c d e
		//d e f g
		//e f g h i
//		int x=5;char ch='a';
//		for(int i=1;i<=x;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(ch+i+j-2));
//				System.out.print(" ");
//			
//			}
//			System.out.println();	
//	}
//		
		
//		int x=5,ch=96;
//		for(int i=1;i<=x;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print((char)(ch+i+j-1)+" ");
//			}
//			System.out.println();	
//	}
		
		//0
		//1 2
		//3 4 5
		//6 7 8 9
		//0 1 2 3 4
		
//		int x=5;int g=0;
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<=i;j++) {
//				if(g>=0 && g<=9) {
//					System.out.print(g+++" ");
//				}if(g>9) {
//					g=0;
//				}
//			}System.out.println();
//		}
		
		//1
		//2 3
		//4 5 6
		//7 8 9 1
		//2 3 4 5 6
//		int x=5;int g=1;
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<=i;j++) {
//				if(g>=0 && g<=9) {
//					System.out.print(g+++" ");
//				}if(g>9) {
//					g=1;
//				}
//			}System.out.println();
//		}
			
		//1
		//2 3
		//4 5 1
		//2 3 4 5
		//1 2 3 4 5
		
//		int x=5;int g=1;
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<=i;j++) {
//				if(g>=0 && g<=5) {
//					System.out.print(g+++" ");
//				}if(g>5) {
//					g=1;
//				}
//			}System.out.println();
//		}
		
		//0
		//1 2
		//3 4 5
		//0 1 2 3
		//4 5 0 1 2

//		int x=5;int g=0;
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<=i;j++) {
//				if(g>=0 && g<=5) {
//					System.out.print(g+++" ");
//				}if(g>5) {
//					g=0;
//				}
//			}System.out.println();
//		}
		
//      0
//		1 1
//		2 2 2
//		3 3 3 3
//		4 4 4 4 4
//		int x=5;int g=0;
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print(i+" ");
//			}System.out.println();
//		}
		
//		0
//		0 1
//		0 1 0
//		0 1 0 1
//		0 1 0 1 0
//		int x=5;int g=0;
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<=i;j++) {
//				if(j%2==0)
//				System.out.print(0+" ");
//				else
//					System.out.print(1+" ");
//			}System.out.println();
//		}
		
//		0
//		1 1
//		0 0 0
//		1 1 1 1
//		0 0 0 0 0
//		int x=5;int g=0;
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<=i;j++) {
//				if(i%2==0)
//				System.out.print(0+" ");
//				else
//					System.out.print(1+" ");
//			}System.out.println();
//		}
		
//		1
//		1 2
//		1 2 3
//		1 2 3 4
//		1 2 3 4 5
//		int x=5;int g=0;
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<=i;j++) {
//				System.out.print(j+1+" ");
//			}System.out.println();
//		}
		
//		1
//		1 0
//		1 0 1
//		1 0 1 0
//		1 0 1 0 1
//		int x=5;int g=0;
//		for(int i=0;i<x;i++) {
//			for(int j=0;j<=i;j++) {
//				if(j%2==1)
//				System.out.print(0+" ");
//				else {
//					System.out.print(1+" ");
//				}
//			}System.out.println();
//		}
		
//		5
//		5 4
//		5 4 3
//		5 4 3 2
//		5 4 3 2 1
//		int x=5;int g=0;
//		for(int i=0;i<x;i++) {
//			for(int j=x;j>=x-i;j--) {
//				System.out.print(j+" ");
//			}System.out.println();
//		}

//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
//		int x=5;
//		for(int i=0;i<x;i++) {
//			for(int j=1;j<=x-i;j++) {
//				System.out.print(j+" ");
//			}System.out.println();
//		}
		
//		0
//		1 0
//		2 1 0
//		3 2 1 0
//		4 3 2 1 0
		
		int x=5;
		for(int i=0;i<x;i++) {
			for(int j=i;j>=0;j--) {
				System.out.print(j+" ");
			}System.out.println();
		}
		
		
	}
}
