package stringsssss;

public class CountVowels {

	public static void main(String[] args) {
		String s="pavanmohitpradeeppunith";
		s=s.toLowerCase();
		char[]a=s.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++) {
		if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u') {
			count++;
			System.out.print(a[i]+" ");
		}
		}
		System.out.println("------"+count);
	}

}
