package Patterns;

public class Three {
public static void main(String[] args) {
	//remove doublicate words
	String s="twincle twincle little star";
	String[] s1 = s.split(" ");
	boolean [] b=new boolean[s1.length];
	for(int i=0;i<s1.length;i++) {
		for(int j=i+1;j<s1.length;j++) {
			if(s1[i].equals(s1[j])) {
				b[j]=true;
			}
		}if(b[i]==false) {
			System.out.print(s1[i]+" ");
		}
	}
	
}
}
