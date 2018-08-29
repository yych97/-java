public class p21
{
public static void main(String args[])
{
	int a=2,b=3;
	a*=b;
	int c=a++;
	int d=++a;
	int e=b>d?b:d;
	d+=c;
	System.out.println("a+b="+(a+b));
	System.out.println("a>b="+(a>b));
	System.out.println((a<e&&c<d)?e:a);
	float f=(float)(--d)/2;
	System.out.println("f="+f);
}
}