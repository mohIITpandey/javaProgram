package Patterns;

public class Two {
public static void main(String[] args) {
	//remove doublicates
	String s="mohanjodaro";
	boolean[]a=new boolean[s.length()];
	for(int i=0;i<s.length();i++) {
		for(int j=i+1;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				a[j]=true;
			}
		}if(a[i]==false) {
			System.out.print(s.charAt(i));
		}
	}
	
}
}
