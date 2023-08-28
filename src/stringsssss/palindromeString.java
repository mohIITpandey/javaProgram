package stringsssss;

import java.util.Scanner;

public class palindromeString {

	public static void main(String[] args) {
for(;;) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
		if(isPalindrome(s)) {
			System.out.println("It is Palindrome");
		}else
			System.out.println("Not Palindrome");
	}
	
	}
	
  public static boolean isPalindrome(String s) {
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
			return false;
		}
	}return true;
  }
}
