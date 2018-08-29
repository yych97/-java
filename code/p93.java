public class p93
{
public static void main(String args[])
{
	String s="world!";
	StringBuffer sb=new StringBuffer("hello!");
	System.out.println(sb.length());
	System.out.println(sb.charAt(1));
	sb.setCharAt(0,'H');
	System.out.println(sb.append(s));
	System.out.println(sb.insert(6,"java "));
	System.out.println(sb.toString());
	System.out.println(sb.capacity());
}
}