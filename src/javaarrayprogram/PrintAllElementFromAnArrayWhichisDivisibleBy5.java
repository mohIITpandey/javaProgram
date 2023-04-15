package javaarrayprogram;

import java.util.Scanner;

public class PrintAllElementFromAnArrayWhichisDivisibleBy5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("enter the element of the array");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0) {
				System.out.println("the no present inside the array whic is divisible by 5 is :"+arr[i]);
			}
		}
		sc.close();
	}

}
