package JavaBasic;

public class BreakStatement {
	
	public static void main(String args[])
	{
		for(int i=1; i<10; i++)
		{
			if(i==6)
				break;  // Breaking the loop when particular condition is fulfilled
			System.out.println(i);
			
		}
		System.out.println("Breaking from the loop");
	}

}
