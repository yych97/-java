public class p28
{
public static void main(String args[])
{
	int sum=0;
	int i=1;
	for(i=1;i<=10;i++)
	{
	sum+=i;
	}
	System.out.println(i);
	System.out.println(sum);
	while(i<=10)
	{
	sum+=i;
	i++;
	}
	System.out.println(i);
	System.out.println(sum);
	do
	{
		sum+=i;
		i++;
	}
	while (i<=10);
	System.out.println(i);
	System.out.println(sum);
}
}