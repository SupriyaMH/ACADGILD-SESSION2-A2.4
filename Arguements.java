package assignments;

public class Arguements {
	public void testNumber(int num)
	{
		if (num==0)
		{
			System.out.println("you entered zero arguments");
			System.out.printf("%d:%c",num,num);
		}
		else if (num > 0 ){
		    System.out.println("You Have Entered Positive Value"); 
		    System.out.printf("%d:%c",num,num);
		    } else {
		    System.out.println("You Have Entered Negative Value"); 
		    System.out.printf("%d:%c",num,num);
		    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arguements a2=new Arguements();
				a2.testNumber(0);
		Arguements a=new Arguements();
		a.testNumber(043);
		
		Arguements a3=new Arguements();
		a3.testNumber(-1);
		

	}

}
