public class P64
{
public static void main(String args[])
{
	Student s1=new Student("��ѩ");
	Student s2=new Student("��ѩ",22);
	Student s3=new Student("��ѩ",22,"�人��ѧ");
	Student s4=new Student();
	Student s5=new Student("�����",20,"SHNU",0,0);
	s4.name="ruijianxun";
	s4.age=50;
	s4.school="SHNU";
	s1.getInfo();
	s2.getInfo();
	s3.getInfo();
	s4.getInfo();
	s5.getInfo();
}
}
class Student
{
	String name;
	int age;
	String school;
	int salary;
	int IQ;
	Student()
	{
		System.out.println("wu");
	}
	Student(String name)
	{
		this.name=name;
	}
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	Student(String sname,int sAge,String sch)
	{
		//this(n,a);
		name=sname;
		age=sAge;
		school=sch;
	}
	Student(String name,int age,String school,int salary,int IQ)
	{
        this.name=name;
		this.age=age;
		this.school=school;
		this.salary=salary;
		this.IQ=IQ;
	}
	public void getInfo()
	{
		System.out.println("������"+name+" ���䣺"+age+" ѧУ��"+school+" ���ʣ�"+salary+" IQ:"+IQ);
	}
}