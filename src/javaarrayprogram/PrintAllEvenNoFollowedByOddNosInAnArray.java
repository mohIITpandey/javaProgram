package javaarrayprogram;

import java.util.Scanner;

public class PrintAllEvenNoFollowedByOddNosInAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size  =sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length; i++)
		{
			System.out.println("enter element into the array");
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0) {
			System.out.println("the even no present in the array is :"+arr[i]);	
			}
			if(arr[i]%2!=0) {
				System.out.println("the odd no present in the array is :"+arr[i]);
			}
		}
		sc.close();

	}

}
