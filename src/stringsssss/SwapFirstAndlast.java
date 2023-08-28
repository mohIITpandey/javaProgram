package stringsssss;

public class SwapFirstAndlast {

	public static void main(String[] args) {
		String s="Bolo Bolo Har Har mahadev";
	    String[] a = s.split(" ");
	    	String temp=a[0];
	    	a[0]=a[a.length-1];
	    	a[a.length-1]=temp;
	    	for(int i=0;i<a.length;i++) {
	    		System.out.print(a[i]+" ");
	    	}
	}

}
