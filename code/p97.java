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
	//��ʱvector a���Ѿ��洢��Trans�����µ�����Car���һ��Airplane��
	for(int i=0;i<a.size();i++)
	{
		//�ڽ�����������ת��ʱ�����������Car����Airplane
		//��֪�����Ƕ�����Trans�࣬������ת����Trans��Trans�е�name�ֶδ洢���������������ж�
		//�жϺ����Ժ��֪����Car����airplane���Ϳ��Խ������
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
//ʹ����̳и����е�name����
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

//����һ������
class Trans
{
	String name;
}