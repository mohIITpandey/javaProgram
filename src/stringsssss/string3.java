package stringsssss;

public class string3 {
public static void main(String[] args) {
	String s="abhishekkumar";
	char[] a = s.toCharArray();
	for(int i=0;i<s.length();i++) {
		int count=1;
		for(int j=i+1;j<s.length();j++) {
			if(a[i]==a[j]) {
				count++;
				a[j]=' ';
			}else {
				break;
			}
		}if(a[i]!=' ') {
				System.out.print(a[i]+"--> "+count+" ");
			}
		}
	}
}

