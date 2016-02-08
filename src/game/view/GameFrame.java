package game.view;

import javax.swing.JFrame;

public class GameFrame extends JFrame
	{
		private GamePanel basePanel;
		public GameFrame()
		{
			basePanel = new GamePanel();
			buildFrame();
		}
		
		private void buildFrame()
		{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setLocationRelativeTo(null);
			this.setSize(700,500);
			this.setResizable(false);
			this.setTitle("Guessing Game");
			this.setContentPane(basePanel);
			this.setVisible(true);
		}
	}
