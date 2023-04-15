package javaarrayprogram;

import java.util.Scanner;

public class PrintOnlyNumberAtEvenIndexFromAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("enter element of the array");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++)
		{
			if(i%2==0) {
				System.out.println("element in even index is :"+arr[i]);
			}
		}
		
		sc.close();


	}

}
