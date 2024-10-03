import java.util.Scanner;

public class Lecture10 {

	public static void main(String[] args) {
		// if else
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your grade: ");
//		float grade = scan.nextFloat();
//		
//		if (grade < 60) {
//			System.out.println("You failed this course!");
//		} else {
//			System.out.println("You passed this course!");
//		}
//		System.out.println("Your grade is: " + grade);
		
//		try (Scanner agePrompt = new Scanner(System.in)) {
//			System.out.println("Enter your age: ");
//			int ageGiven = agePrompt.nextInt();
//			
//			if (ageGiven > 17) {
//				System.out.println("Vote or die!");
//			} else if (ageGiven == 17) {
//				System.out.println("preregister to vote RFK Jr." );
//			} else {
//				System.out.println("Have fun playing outside");
//				}
//		}
		
		try (Scanner number = new Scanner(System.in)) {
			System.out.println("enter a number: ");
			int firstNum = number.nextInt();
			System.out.println("enter a 2nd number: ");
			int secondNum = number.nextInt();
			
			if (firstNum > secondNum) {
				System.out.println(firstNum);
			} else if (firstNum < secondNum) {
				System.out.println(secondNum);
			} else {
				System.out.println("They are equal");
			}
		}

	}
	
		

}
