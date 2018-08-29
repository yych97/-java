public class p29_up
{
public static void main(String args[])
{
	for(int i=9;i>=1;i--)
	{
	  for(int j=9;j>i;j--)
		{
           System.out.print(" "+" "+" "+" "+" "+"\t");	  
	    }
	  for(int j=i;j>=1;j--)
		{
           System.out.print(j+"*"+i+"="+i*j+"\t");	  
	    }
		System.out.print("\r\n");
	}
}
}