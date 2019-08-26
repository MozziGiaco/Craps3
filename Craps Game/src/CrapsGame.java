import java.util.Scanner;

public class CrapsGame
	{

		public static void main(String[] args)
			{

				greetPlayer();

				System.out.println("Take your first roll");
				int firstRoll = (int) (Math.random() * 6 + 1);
				int secondRoll = (int) (Math.random() * 6 + 1);
				int firstRollTotal = firstRoll + secondRoll;

				if (firstRollTotal == 7 || firstRollTotal == 11)
					{
						System.out.println("Your roll is " + firstRollTotal + ", you win!");
						System.exit(0);

					} else if (firstRollTotal == 2 || firstRollTotal == 12)
					{
						System.out.println("Your roll is " + firstRollTotal + ", you lose!");
						System.exit(0);
					} else

					{
						System.out.println("Your roll is " + firstRollTotal
								+ ", let's continue. Press enter to take your next roll.");
					}
				boolean stillRolling = true;
				while (stillRolling)
					{
						// String roll = userInput.nextLine();

						int thirdRoll = (int) (Math.random() * 6 + 1);
						int fourthRoll = (int) (Math.random() * 6 + 1);

						int secondRollTotal = thirdRoll + fourthRoll;

						System.out.println("You rolled a " + thirdRoll + " and a " + fourthRoll + " for a total of "
								+ secondRollTotal);

						System.out.println("firstRollTotal:" + firstRollTotal);
						System.out.println("secondRollTotal:" + secondRollTotal);
						if (secondRollTotal == firstRollTotal)
							{
								System.out.println("Your roll is " + secondRollTotal + ", you win!");
								stillRolling = false;
							} else if (secondRollTotal == 7)
							{
								System.out.println("Your roll is 7, you lose!");
								stillRolling = false;
							}

					}

			}

		public static void greetPlayer()
			{
				Scanner userInput = new Scanner(System.in);

				System.out.println("What is your name?");
				String name = userInput.nextLine();

				System.out.println("Let's play a game of Craps!");
			}

	}