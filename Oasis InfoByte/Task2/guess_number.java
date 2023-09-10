import java.util.Scanner;

public class guess_number {

	
	public static void guessingNumberGame()
	{
		
		Scanner sc = new Scanner(System.in);

		
		int n= 1 + (int)(100* Math.random());

		
		int k = 5;

		int i, guess;

		System.out.println("A number is chosen"+ " between 1 to 100."+ "Guess the number"+ " within 5 trials.");

	
		for (i = 0; i <k; i++) {

			System.out.println("Guess the number:");

			
			guess = sc.nextInt();

			
			if (n== guess) {
				System.out.println("Congratulations!"+ " You guessed the number successfully.");
				break;
			}
			else if (n > guess&& i != k - 1) {
				System.out.println("The number is "+ "greater than " + guess);
			}
			else if (n< guess&& i != k - 1) {
				System.out.println("The number is"+ " less than " + guess);
			}
		}

		if (i == k) {
			System.out.println("You have exhausted"+ " k trials.");

			System.out.println("The number was " + n);
		}
	}


	public static void main(String arg[])
	{

		guessingNumberGame();
	}
}