package Ass10;

public class DSA8 {

	public static void main(String[] args) {
		
		
		String s="aeiourbba";
		char c[]=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='u'||c[i]=='u')
			{
				continue;
			}
			count++;
		}
		System.out.println(count);
	}
}
