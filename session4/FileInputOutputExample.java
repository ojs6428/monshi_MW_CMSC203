import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInputOutputExample {

	public static void main(String[] args) throws FileNotFoundException  {
		
		//opens file containing scores
		File f1 = new File("scores.txt");
		Scanner file = new Scanner(f1);
		
		//opens file containing names
		File f2 = new File("names.txt");
		Scanner file2 = new Scanner(f2);
		
		int sum=0, num;
		
		//read numbers from file and add them 
		while (file.hasNextInt())
		{
			num = file.nextInt();
			sum += num;
		}
		//display the sum of numbers in file
		System.out.println("The sum of the numbers in the file is " +
				sum);
		
		//read names from file and display them
		while (file2.hasNextLine())
		{
			System.out.println(file2.nextLine());
		}
		file.close();
		file2.close();
		
		
	}

}
