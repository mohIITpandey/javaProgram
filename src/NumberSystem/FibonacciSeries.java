package NumberSystem;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=6;
		int s1=0;
		int s2=1;
		int s3;
		for(int i=0;i<n;i++) {
			System.out.println(s1);
			s3=s1+s2;			
			s1=s2;
			s2=s3;
			
		}
       
	}

}
