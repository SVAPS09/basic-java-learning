package JavaBasics;

public class IfElseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		if(b>a)
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("A is greater");
		}
		// comparison operation , >,<,==,!=,<=,>=
		
		int c = 40;
		int d = 40;
		if (c==d)
		{
			System.out.println("C & D are equal");
		}
		else
		{
			System.out.println("Not equal");
		}
		
		// greater in these 3 we use nested if to fimd out
	int a1 = 100;
	int b1 = 500;
	int c1 = 300;
	
	if (a1>b1 && a1>c1)
	{
		System.out.println("a1 is greater");
	}
	else if (b1>a1 && b1>c1)
	{
		System.out.println("b1 is greater");
	}
	else
	{
		System.out.println("C1 is greater");
	}
	
	
	}


}
