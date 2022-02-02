import java.util.Scanner;

public class LogicalOperatorsWithLoops {

	public static void main(String[] args) {
		int x = 4;
		
		// examples of logical operators
		System.out.println(x > 2 || x ==4);
		System.out.println(x > 2 || x !=4);
		System.out.println(x < 1 || x !=4);
		
		System.out.println(x > 2 && x ==4);
		System.out.println(x > 2 && x !=4);
		System.out.println(x < 1 && x !=4);
		
		
		/*
		 * 
		 * ask user to enter a number
		 * between 1 and 100
		 * if the number is valid (between 1-100)
		 * then use a loop to show the sum 
		 * of all the numbers between 1 and the number inputted
		 * otherwise ask the user to enter a 
		 * valid number.
		 * repeat the whole process until
		 * the user enters 0. 
		 * display the sum
		 */
		
		int number;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("enter a number"
					+ " between 1-100");
			//get the number
			number = input.nextInt();
			
			//check if number is between 1 and 100
			if (number >= 1 && number <= 100)
			{
				int sum=0;
				//calculate sum of numbers between 1 and number
				// the user enters
				
				for(int i=1;i<=number; i++)
				{
					sum = sum+i;
				}
				
				System.out.println("the sum of numbers between "
						+ "1 and " + number + " is " + sum);
			}
		} while (number != 0);
		input.close();
	

	}

}