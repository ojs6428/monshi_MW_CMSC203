import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		
		/*
		 *  ask user to enter a letter
		 * based on user input until user enters -1
		 * write a switch statement that checks the value
		 * of a variable named letter and does the following:
		 * if letter is A or a, then display the message "hi"
		 * if letter is 1 or 2, display "number"
		 * otherwise display "bye"
		 */
		Scanner input = new Scanner(System.in);
		char letter;
		
		
		do {
			System.out.println("enter a word");
			String letterInput;
			letterInput = input.next();
			int numOfChars = letterInput.length() -1;
			letter = letterInput.charAt(0);
			
			switch(letter)
			{
				case 'A':
				case 'a':
					System.out.println("hi");
					System.out.println("hi still in case A");
					break;
				case '1':
				case '2':
					System.out.println("number");
					break;
				default:
					System.out.println("bye");
			}
		} while(letter != 45);
		
		input.close();
		

	}

}
