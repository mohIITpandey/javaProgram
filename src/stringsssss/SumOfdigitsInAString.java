package stringsssss;

public class SumOfdigitsInAString {

	public static void main(String[] args) {
		String s="fd7sdd9sd5dd9";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='1' && s.charAt(i)<='9') {
				int n=s.charAt(i)-48;
				sum=sum+n;
			}
		}
     System.out.println(sum);
	}

}
