import java.io.*;
public class p131
{
public static void main(String args[])
{
	try
	{	
	int a;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("input integer");
	a=Integer.parseInt(br.readLine());
	System.out.println();
	System.out.println("����߳�Ϊ"+a+"�ĵȱ�������");
	for(int i=1;i<=a;i++)
	{
		for(int j=1;j<=a-i;j++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
    }
    catch(IOException e)
	{
	    System.out.println(e);
    }
}
}