class People
	{
		public String name;
		//public int age;
		public char sex='女';
		private int age;
		int x;
		public void getInfo()
		{
		    System.out.println("父类：People");
		}
		int setx(int y)
		{
		    x=y;
		    return x;
		}
	}

class Student extends People
{
	public String school;
	private int age;
	int x=10;
	Student(String n,int a,String sch)
	{
	    name=n;
	    age=a;
	    school=sch;
	}
	public void getInfo()
	{
	    System.out.println("\n"+"学生信息如下：\n姓名："+name+"\n年龄"+age+"\n学校:"+school);
	}
	public void testInfo(String nm,int ag,String sc)
	{
	    name=nm;
		age=ag;
		school=sc;
		System.out.println("子类的testInfo()");
	}
	public void testInfo()
	{
	    //name=nm;		
		System.out.println("\n"+"学生信息如下：\n姓名："+name+"\n年龄"+age+"\n学校:"+school);
	}
	int showx()
	{
	//System.out.println(x);
	    return x;
	}
}

public class Stu
{	
	public static void main(String args[])
	{
	   People p=new People();
	   p.getInfo();
	   Student s=new Student("liuan",20,"qinghua");	   
	   s.getInfo();
	   s.testInfo("zz",0,"zz University");
	   System.out.println(s.sex);
	   s.setx(50);
	   System.out.println("子类中的值："+s.showx()+"\n父类中的值：");
	   s.testInfo();
	   //s.showx();
	}
}
	