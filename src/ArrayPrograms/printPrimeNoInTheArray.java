package ArrayPrograms;

public class printPrimeNoInTheArray {

	public static void main(String[] args) {
		int[]a= {3,5,4,8,6,5,3,9};
		
		
		for(int j=0;j<a.length;j++) {
			int count=0;int n=a[j];
		   for(int i=1;i<=n/2;i++) {
		    	  if(n%i==0) {
		    		  count++;
		    	  }
		      }
		      if(count<=1) {
		    	  System.out.println(n+" is primeNo");
		    	  }
		}
	}

}
