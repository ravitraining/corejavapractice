package logics;

public class StringWordReverse {
public String reverseString(String str)
{
	String words[]=str.split(" ");
	String reverseString="";
	for(int i=0;i<words.length;i++)
	{
		String word=words[i];
		String reverseword="";
		for(int j=word.length()-1;j>=0;j--)
		{
			reverseword=reverseword+word.charAt(j);
		}
		reverseString=reverseString+reverseword+" ";
		
	}
	return reverseString;
}
public static void main(String[] args) {
	StringWordReverse st=new StringWordReverse();
	String s1=st.reverseString("Hello Ravi");
	System.out.println(s1);
}
}
