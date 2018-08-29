public class p91
{
public static void main(String args[])
{
	String s="Welcome to java world";
	System.out.println(s.length());
	System.out.println(s.substring(11));
	System.out.println(s.substring(11,15));
	System.out.println(s.toUpperCase());
	System.out.println(s.charAt(0));
	System.out.println(s.indexOf("java"));
	System.out.println(s.replace('j','J'));
	if(s.equalsIgnoreCase("WELCOME TO JAVA WORLD"))
	{
		System.out.println(s.concat("l"));
	}
}
}