package javaarrayprogram;

import java.util.Scanner;

public class PrintOnlyEvenNoFromArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter element of the array");
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2==0) {
			System.out.println("The even no present inside the array is"+arr[i]+" ");
			}
		}
		sc.close();

	}

}
