package game.view;

import javax.swing.*;

public class GamePanel extends JPanel
	{
		private UserGuessesPanel showUserGuesses;
		private UserInputPanel userInputPanel;
		private DifficultyPanel difficultySelection;
	
		private SpringLayout baseLayout;
		
		public GamePanel()
		{
			showUserGuesses = new UserGuessesPanel();
			userInputPanel = new UserInputPanel();
			difficultySelection = new DifficultyPanel();
			
			baseLayout = new SpringLayout();
			
			buildPanel();
			buildWindow();
			buildListeners();
		}
		
		private void buildPanel()
		{
			setLayout(baseLayout);
			add(showUserGuesses);
			add(userInputPanel);
			add(difficultySelection);
		}
		
		private void buildWindow()
		{
			baseLayout.putConstraint(SpringLayout.WEST, userInputPanel, 0, SpringLayout.EAST, showUserGuesses);
			baseLayout.putConstraint(SpringLayout.WEST, difficultySelection, 0, SpringLayout.EAST, userInputPanel);
		}
		
		private void buildListeners()
		{
			
		}
	}
