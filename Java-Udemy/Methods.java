package Section4;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int playerPosition = calculateHighScorePosition(250);
		displayHighScorePosition("KEyur", playerPosition);
		
	/*	if(score == 5000)
		{
			System.out.println("Your score is: \t" + score);
		} */
		int highScore = calculateScore(true, 500, 5, 100);
		System.out.println(highScore);
		boolean newGameOver = true;
		int newScore = 800;
		int newLevelCompleted = 8;
		int newBonus = 200;
		
		if(newGameOver)
		{
			int newFinalScore = newScore + ( newLevelCompleted * newBonus);
			System.out.println("Your new Final score: " + newFinalScore);
			
		}
	}
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
	{
	
		if(gameOver == true)
		{
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			return finalScore;
			
		}
		
		return -1;
		
	}
	
	public static void displayHighScorePosition(String playerName, int playerPosition)
	{
		System.out.println(playerName + " managed to get into position " + playerPosition );
	}
	
	public static int calculateHighScorePosition(int playerScore)
	{
		if(playerScore > 1000)
			return 1;
		else if(playerScore > 500 && 	playerScore < 1000)
			return 2;
		else if(playerScore > 100 && playerScore < 500)
			return 3;
		else
			return 4;
	}
}
