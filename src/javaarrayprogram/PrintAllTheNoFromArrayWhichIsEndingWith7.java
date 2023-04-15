package javaarrayprogram;

import java.util.Scanner;

public class PrintAllTheNoFromArrayWhichIsEndingWith7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		 for(int i=0; i<arr.length;i++)
		 {
			 System.out.println("enter the element inside the array");
			 arr[i] = sc.nextInt();
		 }
		 for(int i=0; i<arr.length; i++) {
			 if(arr[i]%10== 7) {
				 System.out.println("the no which is ending with 7 present inside the array is:"+arr[i]);
			 }
		 }
		 sc.close();

	}

}
