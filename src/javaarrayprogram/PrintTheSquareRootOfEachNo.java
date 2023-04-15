package javaarrayprogram;

import java.util.Scanner;



public class PrintTheSquareRootOfEachNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++) {
			System.out.println("enter element into the array");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(Math.sqrt(arr[i]));
		}
		sc.close();
	}

}
