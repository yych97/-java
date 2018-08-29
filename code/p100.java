import java.util.*;
public class p100
{
public static void main(String args[])
{
	String[] name={"T","J","M"};
	String[] score={"96","88","98"};
	//String[] age={"18","19","20"};
	Hashtable ht=new Hashtable();
	for(int i=0;i<name.length;i++)
	{
		ht.put(score[i],age[i]);
	}
		Enumeration enum_name=ht.keys();
		Object ob1=new Object();
		Object ob2=new Object();
		while(enum_name.hasMoreElements())
	{
			//ob1=enum_name.elementAt();
			ob1=enum_name.NextElement();
			ob2=ht.get(ob1);
			System.out.println(ob1+" "+ob2);
			ob1=enum_name.nextElement();
		}
		
	}
}

