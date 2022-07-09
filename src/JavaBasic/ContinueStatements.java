package JavaBasic;

public class ContinueStatements {
	
	public static void main(String args[])
	{
		for(int i=1; i<10; i++)
		{
			if(i%2==0)
				continue;  //Skipping the particular Iteration
			System.out.println(i);
			
		}
		System.out.println("Breaking from the loop");
	}

}
