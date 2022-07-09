package JavaBasic;

public class Arrays {

	public static void main(String[] args) {
		
		int[] Arr={10, 20, 30, 40};
		
		int sum=0;
		
		//for(int i=0; i<Arr.length; i++)
			
			//System.out.println(Arr[i]);  
		
		for(int a :Arr)  //only for arrays
		{
			System.out.println(a);
			
			sum=sum+a;
			
			
		}
		
		System.out.println(sum);
	}

}

