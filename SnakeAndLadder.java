class SnakeAndLadderGame {
	static int playerposition = 0;
	static int dieRoll = 0;
	static int LadderArr[] = { 5, 24, 50, 68 };
	static int SnakeArr[] = { 49, 69, 99 };
	static int TotalNoOfDiceRoll = 0;


public static void main(String[] args){
		System.out.println("Welcome to the snake and ladder game");
		System.out.println("Starting position of the player is 0 !!");




		for (playerposition = 1; playerposition <= 100; playerposition++) {
			double randomnumber = Math.random() * 6;
			dieRoll = (int) randomnumber;
			System.out.println("Dice Number =" + " " + dieRoll);
			playerposition = playerposition + dieRoll;
			playerposition = playerposition - 1;

			System.out.println("Current Position =" + " " + playerposition);

			TotalNoOfDiceRoll++;

			if (playerposition == 100) {
				System.out.println("CONGRATULATION!! YOU WON THE GAME.");
			}
			if (dieRoll == 0) {
				playerposition = playerposition - dieRoll;
				System.out.println("You have to stay on the same position!!");
			}
			if (playerposition == SnakeArr[0]) {
				playerposition = 19;
				System.out.println("OOPS!! IT'S A SNAKE.");
				System.out.println("OOPS!! Now, You are at " + playerposition + " position.");

			} else if (playerposition == SnakeArr[1]) {
				playerposition = 48;
				System.out.println("OOPS!! IT'S A SNAKE.");
				System.out.println("OOPS!! Now, You are at " + playerposition + " position.");

			} else if (playerposition == SnakeArr[2]) {
				playerposition = 77;
				System.out.println("OOPS!! IT'S A SNAKE.");
				System.out.println("OOPS!! Now, You are at " + playerposition + " position.");

			} else if (playerposition == LadderArr[0]) {
				playerposition = 67;
				System.out.println("LUCKY!! YOU GOT A LADDER.");
				System.out.println("YUPP!! Now, You are at " + playerposition + " position.");

			} else if (playerposition == LadderArr[1]) {
				playerposition = 82;
				System.out.println("LUCKY!! YOU GOT A LADDER.");
				System.out.println("YUPP!! Now, You are at " + playerposition + " position.");

			} else if (playerposition == LadderArr[2]) {
				playerposition = 98;
				System.out.println("LUCKY!! YOU GOT A LADDER.");
				System.out.println("YUPP!! Now, You are at " + playerposition + " position.");

			} else if (playerposition > 100) {
				playerposition = playerposition - dieRoll;
				System.out.println("OHH!! YOU CAN'T JUMP, YOU MUST LAND ON A 100.");
			}
		}

	}
}


