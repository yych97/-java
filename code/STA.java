public class STA
{
	public static void main(String args[])
	{
		Car1 myCar1=new Car1(5,1.8,1.6,"red","running",80);
		Car2 myCar2=new Car2(4.6,1.7,1.5,"blue","running",60);
		
		//Car.passengers=4;
		System.out.println("myCar1的载客量为"+myCar1.passengers);
		System.out.println("myCar2的载客量为"+myCar2.passengers);
		System.out.println("Car1的载客量为"+Car1.passengers);
		System.out.println("Car2的载客量为"+Car2.passengers);
		myCar1.passengers=5;
		myCar1.color="yellow";
		System.out.println("myCar1的载客量为"+myCar1.passengers);
		System.out.println("myCar2的载客量为"+myCar2.passengers);
		System.out.println("Car1的载客量为"+Car1.passengers);
		System.out.println("Car2的载客量为"+Car2.passengers);
	}
}
class Car1
{
	static int passengers;
	double length,width,height;
	String color,condition;
	int speed;
	Car1(double len,double wid,double hei,String col,String con,int spe)
	{
		length=len;
		width=wid;
		height=hei;
		color=col;
		condition=con;
		speed=spe;
	}
	static
	{
		passengers=4;
	}
}

class Car2
{
	static final int passengers=3;
	double length,width,height;
	String color,condition;
	int speed;
	Car2(double len,double wid,double hei,String col,String con,int spe)
	{
		length=len;
		width=wid;
		height=hei;
		color=col;
		condition=con;
		speed=spe;
	}
	
}