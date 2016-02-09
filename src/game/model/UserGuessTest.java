package game.model;

public class UserGuessTest
{
	private boolean isEasy;
	private boolean isNormal;
	private boolean isHard;
	
	public UserGuessTest()
	{
		if(isEasy)
			checkEasy();
		else if(isNormal)
			checkNormal();
		else if(isHard)
			checkHard();
		else
			checkEasy();
	}
	
	private void checkEasy()
	{
		
	}
	
	private void checkNormal()
	{
		
	}
	
	private void checkHard()
	{
		
	}
}
