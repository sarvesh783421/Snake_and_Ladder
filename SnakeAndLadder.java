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
		double randomnumber = Math.random() * 6+1;
		dieRoll = (int) randomnumber;
		System.out.println("Dice Number =" + " " + dieRoll);
		playerposition = playerposition + dieRoll;

		System.out.println("Current Position =" + " " + playerposition);
		TotalNoOfDiceRoll++;
			}
	}
}
