package javaarrayprogram;

public class AdditionOfTwoArray {

	public static void main(String[] args) {

     int[]a= {2,4,2,7,8,5};
     int[]b= {4,7,6,9,2};
     int length=a.length;
     if(b.length>a.length) {
	   length=b.length;
     }
  for(int i=0;i<length;i++) {
	  try {
	  System.out.println(a[i]+b[i]);
    }
     catch(ArrayIndexOutOfBoundsException e) {
	if(a.length<b.length) {
		System.out.println(b[i]);
	}
	else
		System.out.println(a[i]);
      }
  }
  
  
  
  
  
  
	}

}
