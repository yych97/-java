public class myAuto
{	
	public static void main(String args[])
	{
		Auto myA1=new Auto(5,1.8,1.6,"red","parking",0);
		Auto myA2=new Auto(4.4,1.7,1.5);
		String s1,s2;
		s1="��"+myA1.length+" ��"+myA1.width+","+" ��"+myA1.height+" ��ɫ"+myA1.color+" ״̬"+myA1.condition+" �ٶ�"+myA1.speed;
		System.out.println(s1);
		s2="��"+myA2.length+" ��"+myA2.width+","+" ��"+myA2.height;
		System.out.println(s2);
		System.out.println(myA1.getColor());
		
		System.out.println("�����˱���! "+myA1.condition)
	}
}

class Auto
	{
		double length;
		double width;
		double height;
		String color;
		String condition;
		int speed;
		
		Auto(double len,double wid,double hei,String col,String con,int spe)
	    {
			length=len;
			width=wid;
			height=hei;
			color=col;
			condition=con;
			speed=spe;
	    }

		Auto(double len,double wid,double hei)
	    {
			length=len;
			width=wid;
			height=hei;		
	    }
		
		void setSize(double len,double wid,double hei)
		{
			length=len;
			width=wid;
			height=hei;
		}
		
		void setColor(String col)
		{
			color=col;
		}
		
		String getColor()
		{
			return color;
		}

		String settranform(String con)
		{
			condition=con;
		}
		
		void start()
		{
			condition="running";
		}
		
		void stop()
		{
			condition="parking";
		}
		
		void setSpeed(int spe)
		{
			speed=spe;
		}
		
		int getSpeed()
		{
			return speed;
		}
	}
	