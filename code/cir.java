public class cir
{
public static void main(String args[])
{
	Circle Circle1=new Circle(1.0);
	Circle1.CSqu();
	//System.out.println(Circle1.Squ);
	Circle Circle2=new Circle(3.0);
	Circle2.CSqu();
	//System.out.println(Circle2.Squ);
}
}

class Circle
{
	static double PI=3.1415926;
	double rid;
	double Squ;
	
	Circle(double r)
	{
	rid=r;	
	}

	void CSqu()
	{
	Squ=PI*rid*rid;
	System.out.println("Բ�����Ϊ��"+Squ);
	//return Squ;
	}

}