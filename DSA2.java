package Ass10;

public class DSA2 {

	public static void main(String[] args) {
		
	
		int a[]= {1,2,3,4,5,6,7,8,9};
		int n=a.length;
		int[] cal = cal(a,"odd");
		for(int i:cal)
		{
			System.out.println(i+" ");
		}
	}
	
	public static int[] cal(int []a,String flip)
	{
		
		if(a.length==1)
		{
			return a;
		}
		
		int b[]=new int[a.length-(int)Math.ceil(a.length/2.0f)];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			if(flip=="odd" && i%2!=0)
			{
				b[k]=a[i];
				k++;
			}
			if(flip=="even" && i%2==0)
			{
				b[k]=a[i];
				k++;
			}
		}
		
			
		return cal(b,flip=="odd"?"even":"odd");
	}
}
