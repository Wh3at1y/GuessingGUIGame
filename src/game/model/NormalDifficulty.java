package game.model;

public class NormalDifficulty
{
	private int normalNumber;
	
	public NormalDifficulty()
	{
		normalNumber = (int) (Math.random() * 101);
	}

	public int getNormalNumber()
		{
			return normalNumber;
		}
}
