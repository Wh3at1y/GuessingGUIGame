package game.view;

import javax.swing.*;

public class GamePanel extends JPanel
	{
		private SpringLayout baseLayout;
		private UserGuessesPanel showUserGuesses;
		private UserInputPanel userInputPanel;
		private DifficultyPanel difficultySelection;
		
		public GamePanel()
		{
			baseLayout = new SpringLayout();
			showUserGuesses = new UserGuessesPanel();
			userInputPanel = new UserInputPanel();
			difficultySelection = new DifficultyPanel();
			
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
