package Patterns;

public class Pattern {
public static void main(String[] args) {
	int n=7;
	int h=(n/2)+1;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<h && j<=i;j++) {
			if(j%2==1 ) {
				System.out.print("* ");
			}else {
				System.out.print(" ");
			}
		}System.out.println();
	}
	
}
}
