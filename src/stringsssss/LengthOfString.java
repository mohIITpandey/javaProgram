package stringsssss;

public class LengthOfString {

	public static void main(String[] args) {
		String s="mohitpavanpradeeppunith";
		int count=0;
		char[] a = s.toCharArray();
		for(char ch:a) {
			count++;
		}
		System.out.println(count);
	}

}
