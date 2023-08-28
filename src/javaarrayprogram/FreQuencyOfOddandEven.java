package javaarrayprogram;

import java.util.Scanner;

public class FreQuencyOfOddandEven {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter row and column:");
	int m=sc.nextInt();
	int n=sc.nextInt();
System.out.println("enter the elements");
	int [][]a=new int[m][n];
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			a[i][j]=sc.nextInt();
		}
	}
	int countE=0,countO=0;
	for(int i=0;i<m;i++) {
		for(int j=0;j<n;j++) {
			if(a[i][j]%2==0) {
			countE++;
			}else {
				countO++;
			}
		}
	}
	System.out.println(countE+"  "+countO);
}
}
