package javaarrayprogram;

import java.util.Scanner;

public class PrintOnlyTwoDigitNoFromAnArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("enter the element of the array");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>9 && arr[i]<100) {
				System.out.println("two digit no in the array is :"+arr[i]);
			}
		}
		sc.close();
	}

}
