public class p19_2
{
public static void main(String args[])
{
	int i;
	i=5;i++;System.out.println("i="+i);
	i=5;++i;System.out.println("i="+i);
	i=5;i--;System.out.println("i="+i);
	i=5;--i;System.out.println("i="+i);
	float x=7,y=5,v1,v2;
	v1=x++;
	v2=++y;
	System.out.println("x="+x);
	System.out.println("y="+y);
}
}