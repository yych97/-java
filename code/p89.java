public class p89
{
public static void main(String args[])
{
	char[] a={'h','e','l','l','o',' ','j','a','v','a','!'};
	String s1,s2,s3,s4,s5,s6;
	StringBuffer sb=new StringBuffer("Welcome to java world!");

	s1="hello!";
	s2=new String(s1);
	s3=new String(a);
	s4=new String(a,6,5);

	s5=new String();
	s6=new String(sb);

	System.out.println("s1="+s1);
	System.out.println("s2="+s2);
	System.out.println("s3="+s3);
	System.out.println("s4="+s4);
	System.out.println("s5="+s5);
	System.out.println("s6="+s6);
}
}