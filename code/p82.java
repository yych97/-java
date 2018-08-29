public class p82
{
public static void main(String args[])
{
	int d[][]={{1,2,3},{4,5,6,7},{0}};	
	d[2]=d[0];
	d[0]=d[1];
	d[1]=d[2];
	System.out.println(d[0][1]);
	System.out.println(d[0].length);
	System.out.println(d[1].length);
}
}