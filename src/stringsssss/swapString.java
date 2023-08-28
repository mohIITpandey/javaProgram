package stringsssss;

public class swapString {

	public static void main(String[] args) {
String s1="abcbda";
String temp="";
for(int i=0;i<=s1.length()-1;i++)
{
	int count=0;
	char ch=s1.charAt(i);
	if(temp.indexOf(ch)==-1)
	{
		for(int j=0;j<=s1.length()-1;j++)
		{
			if(ch==s1.charAt(j))
			{
				count++;
			}
		}
		temp=temp+ch;
		System.out.println(ch +" repeated "+ count +"times");
		
	}
}



	}

}
