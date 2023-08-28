package ArrayPrograms;

public class printPrimeNoUpto100 {

	public static void main(String[] args) {
		for(int j=0;j<=100;j++) {
			int count=0;int n=j;
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
