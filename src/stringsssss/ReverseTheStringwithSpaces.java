package stringsssss;

public class ReverseTheStringwithSpaces {

	public static void main(String[] args) {
		String s="Bolo Bolo Har Har mahadev";
	    String[] a = s.split(" ");
	    for(int i=a.length-1;i>=0;i--) {
	    	System.out.print(a[i]+" ");
	    }
	}

}
