import java.util.Arrays;
import java.util.ArrayList;
public class szkr
{
public static void main(String args[])
{
	int a[]={1,2,3,4,5};
	int b[]=Arrays.copyOf(a,6);
	ArrayList aa = new ArrayList();
	b[5]=6;
	aa.remove(a);
	int[] a=new int[6];	
	for(int i=0;i<6;i++)
	{
		a[i]=b[i];
		System.out.print(a[i]+" ");
	}
}
}