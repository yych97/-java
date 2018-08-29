public class myAuto
{	
	public static void main(String args[])
	{
		Auto myA1=new Auto(5,1.8,1.6,"red","parking",0);
		Auto myA2=new Auto(4.4,1.7,1.5);
		String s1,s2;
		s1="长"+myA1.length+" 宽"+myA1.width+","+" 高"+myA1.height+" 颜色"+myA1.color+" 状态"+myA1.condition+" 速度"+myA1.speed;
		System.out.println(s1);
		s2="长"+myA2.length+" 宽"+myA2.width+","+" 高"+myA2.height;
		System.out.println(s2);
		System.out.println(myA1.getColor());
		
		System.out.println("汽车人变形! "+myA1.condition)
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
	