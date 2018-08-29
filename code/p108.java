import java.util.*;
public class p108
{
public static void main(String args[])
{
	String[] name={" T"," J"," M"," MA"," L"," M"};
	Stack st=new Stack();
	for(int i=0;i<name.length;i++)
	{
		st.push(name[i]);
	}
	System.out.println(st.peek());
	System.out.println(" "+st.search(" MA"));
	for(int i=0;i<st.size();i++)
	{
		System.out.print(st.elementAt(i));
	}
	System.out.println("");
	while(!st.empty())
	{
		System.out.print(st.pop());
	}
}
}