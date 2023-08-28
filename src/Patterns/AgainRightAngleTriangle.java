package Patterns;

public class AgainRightAngleTriangle {

	public static void main(String[] args) {
		int n=5;int s=n;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j>i)
				System.out.print(" ");
				else {
					System.out.print(" *");
				}
			}
			System.out.println();
			
		}
	}

}
