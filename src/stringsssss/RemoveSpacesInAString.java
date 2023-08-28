package stringsssss;

public class RemoveSpacesInAString {

	public static void main(String[] args) {
		String s="Bolo Bolo Har Har mahadev";
       String[] a = s.split(" ");
       for(int i=0;i<a.length;i++) {
    	   System.out.print(a[i]);
       }
	}

}
