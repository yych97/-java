import java.util.*;
public class p97
{
public static void main(String args[])
{
	Vector a=new Vector();	
	a.addElement(new Car("Audi A8 W12",5267,1949,1471));
	a.addElement(new Car("Benz S600",5230,1871,1485));
	a.addElement(new Car("BMW 760Li",5212,1902,1484));	
	a.insertElementAt(new Airplane("Boeing 747-400",70600,64400,19300),1);
	//此时vector a中已经存储了Trans父类下的三个Car类和一个Airplane类
	for(int i=0;i<a.size();i++)
	{
		//在进行数据类型转换时不清楚具体是Car还是Airplane
		//但知道他们都属于Trans类，所以先转换成Trans，Trans中的name字段存储了类型名称用于判断
		//判断好了以后就知道是Car还是airplane，就可以进行输出
		if(((Trans)a.elementAt(i)).name=="Car")
		{
			System.out.print(((Car)a.elementAt(i)).type+" ");
		    System.out.print(((Car)a.elementAt(i)).length+" ");
			System.out.print(((Car)a.elementAt(i)).width+" ");
			System.out.println(((Car)a.elementAt(i)).height);
		}
		else
		{
			System.out.print(((Airplane)a.elementAt(i)).type+" ");
		    System.out.print(((Airplane)a.elementAt(i)).length+" ");
			System.out.print(((Airplane)a.elementAt(i)).wing_span+" ");
			System.out.println(((Airplane)a.elementAt(i)).height);
		}		
		
	}
}
}
//使子类继承父类中的name属性
class Car extends Trans
{
	String type;
	int length;
	int width;
	int height;
	
	Car(String tp,int len,int wid,int hei)
	{
		type=tp;
		length=len;
		width=wid;
		height=hei;
		name="Car";
	}
}

class Airplane extends Trans
{
	String type;
	int length;
	int wing_span;
	int height;
	
	Airplane(String tp,int len,int wis,int hei)
	{
		type=tp;
		length=len;
		wing_span=wis;
		height=hei;
		name="Airplane";
	}
}

//定义一个父类
class Trans
{
	String name;
}