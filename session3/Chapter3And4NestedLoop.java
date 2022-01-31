
public class Chapter3And4NestedLoop
{

	public static void main(String[] args) 
	{
		 
		for (int i =0; i <2; i++)
		{
			System.out.println("In outer loop " + i);
			
			for (int j=0; j < i; j++)
			{
				System.out.println("in the inner loop " + j);
			}
		
		}
		
		System.out.println("end");

	}

}
