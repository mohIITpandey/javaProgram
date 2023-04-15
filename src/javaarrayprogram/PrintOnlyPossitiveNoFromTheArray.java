package javaarrayprogram;

import java.util.Scanner;

public class PrintOnlyPossitiveNoFromTheArray {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of the array");
			int size = sc.nextInt();
			int[] arr = new int[size];
			for(int i=0; i<arr.length; i++)
			{
				System.out.println("enter the array element");
				arr[i]=sc.nextInt();
			}
			for(int i =0; i<arr.length;i++)
			{
				if(arr[i]>=0) {
					System.out.println("the positive no present inside the array is:"+arr[i]);
				}
			}
		sc.close();
		

	}

}
