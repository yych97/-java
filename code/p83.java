import java.util.Arrays;

public class p83
{
public static void main(String args[])
{
	Car[] myCar=new Car[3];
	Car[] eCar=new Car[1];
	myCar[0]=new Car("Audi A8 W12",5267,1949,1471);
	myCar[1]=new Car("Benz S600",5230,1871,1485);
	myCar[2]=new Car("BMW 760Li",5212,1902,1484);
	String s="";
	int A[]=new int[3];
	for(int i=0;i<myCar.length;i++)
	{
		A[i]=myCar[i].height;
	}
	Arrays.sort(A);
	for(int i=0;i<myCar.length;i++)
	{
	for(int j=0;j<myCar.length;j++)
	{
		if(A[i]==myCar[j].height)
		{
			eCar[0]=myCar[i];
			myCar[i]=myCar[j];
			myCar[j]=eCar[0];
		}		
	}	
	}	
	for(int j=0;j<myCar.length;j++)
	{		
			s+="\n"+myCar[j].type+"\t"+myCar[j].length+"\t"+myCar[j].width;
			s+="\t"+myCar[j].height;		
	}	
	System.out.println(s);	
}
}
class Car
{
	String type;
	int length;
	int width;
	int height;
	Car(String ty,int len,int wid,int hei)
	{
		type=ty;
		length=len;
		width=wid;
		height=hei;
	}
}