package javaarrayprogram;

import java.util.Scanner;

public class PrintAllElementOfArrayInASeperateLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the size of the array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println("enter element of the array");
			arr[i] = sc.nextInt();
			
		}
		for(int i=0; i<arr.length; i++)
		{
			//System.out.print(arr[i]+" ");//print in single line
			System.out.println(arr[i]);//print in seperate seperate line
		}
		sc.close();
	}

}
