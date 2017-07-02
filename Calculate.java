package assignments;

import java.util.Scanner;

public class Calculate {
	
Scanner s = new Scanner(System.in);

int p=s.nextInt();
int c=s.nextInt();
int m=s.nextInt();
	
	
	double total,average;
	
	
	
	public void calc()
	{
		total=p+c+m;
		average=total/3.00;
		
	if(average>=70)
	{
		System.out.println("Grade A");
	}
	else if(average>=60 && average<= 70)
	{
		System.out.println("Grade B");
	}
	else
	{ 
		System.out.println("grade c");
	}
		
}

public static void main(String Args[])
{
	System.out.println("Enter value for 3 subjects that is P C and M");
	Calculate c=new Calculate();
	
	
	c.calc();
}
}