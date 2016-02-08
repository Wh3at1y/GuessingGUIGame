package game.model;

public class EasyDifficulty
	{
		private int easyNumber;
		
		public EasyDifficulty()
		{
			easyNumber = (int) (Math.random() * 51);
		}

		public int getEasyNumber()
			{
				return easyNumber;
			}
	}
