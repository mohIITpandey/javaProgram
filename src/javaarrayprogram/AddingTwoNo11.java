package javaarrayprogram;

public class AddingTwoNo11 {

	public static void main(String[] args) {
int []a= {8,3,8,9,2,5,6,6,6,5};
int count=0;
      for(int i=1;i<a.length;i++) {
    	  if(a[i]+a[i-1]==11) {
    		  System.out.println(a[i]+" and "+a[i-1]);
    		  count++;
    	  }
      }
    System.out.println("total combination--"+count);


	}

}
