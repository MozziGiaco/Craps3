import java.util.Scanner;

public class CrapsGame
	{
		static int firstRollTotal;
		static String userInput;
		static int bet;

		public static void main(String[] args)
			{

				greetPlayer();
				betMoney();
				firstRoll();
				firstResults();
				secondRoll();

			}

		public static void greetPlayer()
			{
				Scanner userInput = new Scanner(System.in);

				System.out.println("What is your name?");
				String name = userInput.nextLine();

				System.out.println("Let's play a game of Craps!");
			}

		public static void betMoney()
			{
				Scanner betInput = new Scanner(System.in);
				System.out.println("How much money would you like to bet?");
				int bet = betInput.nextInt();
				System.out.println(bet + " dollars, I like it!");

			}

		public static void firstRoll()
			{
				System.out.println("Take your first roll");
				int firstRoll = (int) (Math.random() * 6 + 1);
				int secondRoll = (int) (Math.random() * 6 + 1);
				int firstRollTotal = firstRoll + secondRoll;
			}

		public static void firstResults()
			{
				if (firstRollTotal == 7 || firstRollTotal == 11)
					{
						System.out.println("Your roll is " + firstRollTotal + ", you win!");
						System.out.println("You have received " + bet + " dollars!");
						System.exit(0);

					} else if (firstRollTotal == 2 || firstRollTotal == 12)
					{
						System.out.println("Your roll is " + firstRollTotal + ", you lose!");
						System.out.println("You just lost your bet of " + bet + " dollars, sorry!");
						System.exit(0);
					} else

					{
						System.out.println("Your roll is " + firstRollTotal
								+ ", let's continue. Press enter to take your next roll.");
					}
			}

		public static void secondRoll()
			{
				boolean stillRolling = true;
				while (stillRolling)
					{
						Scanner userInput = new Scanner(System.in);
						String roll = userInput.nextLine();

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
								System.out.println("You have receieved " + bet + " dollars!");
								stillRolling = false;
							} else if (secondRollTotal == 7)
							{
								System.out.println("Your roll is 7, you lose!");
								System.out.println("You just lost your bet of " + bet + " dollars, sorry!");

								stillRolling = false;
							}

					}
			}

	}