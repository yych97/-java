public class P62
{
public static void main(String args[])
{
	A a=new A();
	a.get(3);
	a.get('M');
	a.get("China");
	a.get(3,'M');
	a.get('M',3);
}
}
class A
{
	void get(int i)
	{
		System.out.println("����"+i);
	}
	void get(char i)
	{
		System.out.println("�ַ���"+i);
	}
	void get(String i)
	{
		System.out.println("�ַ���"+i);
	}
	void get(int i,char c)
	{
		System.out.println("����"+i+"���ַ��ͣ�"+c);
	}
	void get(char c,int i)
	{
		System.out.println("�ַ��ͣ�"+c+"������"+i);
	}
	
}