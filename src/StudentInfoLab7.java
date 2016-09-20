import java.util.*;
import java.util.InputMismatchException; //exception statement

public class StudentInfoLab7 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		String userCont = "yes";
		boolean cont = true;

		int input = 0;
		String classMember;

		System.out.println("Welcome to our Java class!");

		while (userCont.equals("yes")) {
			System.out.print("Which student would you like to learn more about?");
			System.out.println("(Enter a number 1-4:)");

			try { // Exception statement
				input = userInput.nextInt();
			} catch (InputMismatchException e) {
				System.out.print("Please try again. Type 'yes' or 'no' to continue");
				userInput.nextLine();
				userCont = userInput.nextLine();
			}
			switch (input) {

			case 1:
				classMember = userInput.nextLine();
				System.out.println("Armani");
				System.out.println("Would you like to know where Armani is from? (enter yes or no)");
				userCont = userInput.nextLine();

				
				if (userCont.equalsIgnoreCase("yes")) {
					System.out.println("Armani is from Detroit");
					System.out.println("Would you like to know Armani's favorite food?");
					System.out.println("enter yes or no)");
					;
					userCont = userInput.nextLine();

					if (userCont.equalsIgnoreCase("yes")) {
						System.out.println("Armani's favorite food is salmon");
						System.out.println("Continue with another student? (enter yes or no)");
						userCont = userInput.nextLine();
					}
					
					else if (userCont.equalsIgnoreCase("no")) {
						System.out.println("Continue with another student?");
						System.out.println("(enter yes or no)");
						userCont = userInput.nextLine();
					}
				}
				break;
			case 2:
				classMember = userInput.nextLine();
				System.out.println("Kristen");
				System.out.println("Would you like to know where Kristen is from? (enter yes or no)");
				userCont = userInput.nextLine();

				
				if (userCont.equalsIgnoreCase("yes")) {
					System.out.println("Kristen is from Detroit");
					System.out.println("Would you like to know Kristen's favorite food?");
					System.out.println("enter yes or no)");
					;
					userCont = userInput.nextLine();

					if (userCont.equalsIgnoreCase("yes")) {
						System.out.println("Kristen's favorite food is tacos");
						System.out.println("Continue with another student? (enter yes or no)");
						userCont = userInput.nextLine();
					}
					
					else if (userCont.equalsIgnoreCase("no")) {
						System.out.println("Continue with another student?");
						System.out.println("(enter yes or no)");
						userCont = userInput.nextLine();
					}
				}
				break;
			case 3:
				classMember = userInput.nextLine();
				System.out.println("Clark");
				System.out.println("Would you like to know where Clark is from? (enter yes or no)");
				userCont = userInput.nextLine();

				
				if (userCont.equalsIgnoreCase("yes")) {
					System.out.println("Clark is from Detroit");
					System.out.println("Would you like to know Clark's favorite food?");
					System.out.println("enter yes or no)");
					;
					userCont = userInput.nextLine();

					if (userCont.equalsIgnoreCase("yes")) {
						System.out.println("Clark's favorite food is Thai");
						System.out.println("Continue with another student? (enter yes or no)");
						userCont = userInput.nextLine();
					}
					
					else if (userCont.equalsIgnoreCase("no")) {
						System.out.println("Continue with another student?");
						System.out.println("(enter yes or no)");
						userCont = userInput.nextLine();
					}
				}
				break;
			case 4:
				classMember = userInput.nextLine();
				System.out.println("Zalika");
				System.out.println("Would you like to know where Zalika is from? (enter yes or no)");
				userCont = userInput.nextLine();

				
				if (userCont.equalsIgnoreCase("yes")) {
					System.out.println("Zalika is from Detroit");
					System.out.println("Would you like to know Zalika's favorite food?");
					System.out.println("enter yes or no)");
					;
					userCont = userInput.nextLine();

					if (userCont.equalsIgnoreCase("yes")) {
						System.out.println("Zalika's favorite food is pasta");
						System.out.println("Continue with another student? (enter yes or no)");
						userCont = userInput.nextLine();
					}
					
					else if (userCont.equalsIgnoreCase("no")) {
						System.out.println("Continue with another student?");
						System.out.println("(enter yes or no)");
						userCont = userInput.nextLine();
					}
				}
				break;
			}
			if (userCont.equalsIgnoreCase("no")) {
				System.out.println("Continue with another student? (enter yes or no)");
				userCont = userInput.nextLine();
			}

		} 
		System.out.println("Goodbye!");

	}
}