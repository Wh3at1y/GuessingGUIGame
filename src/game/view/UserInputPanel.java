package game.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import game.model.EasyDifficulty;
import game.model.NormalDifficulty;

public class UserInputPanel extends JPanel
	{
		private DifficultyPanel grabDifficulty;
		private EasyDifficulty easyNumber;
		private NormalDifficulty normalNumber;
		
		private SpringLayout baseLayout;
		
		private JButton grabUserInput;
		private JTextField userInputField;
		
		private int userGuess;
		
		public UserInputPanel()
			{
				grabDifficulty = new DifficultyPanel();
				easyNumber = new EasyDifficulty();
				normalNumber = new NormalDifficulty();
				
				baseLayout = new SpringLayout();
				
				grabUserInput = new JButton("Enter Guess");
				
				userInputField = new JTextField();
				
				
				buildPanel();
				buildWindow();
				buildListeners();
			}
			
			private void buildPanel()
			{
				setLayout(baseLayout);
				setBackground(Color.BLUE);
				setPreferredSize(new Dimension(320,478));
				
				add(grabUserInput);
				add(userInputField);
			}
			
			private void buildWindow()
			{
				baseLayout.putConstraint(SpringLayout.WEST, grabUserInput, 26, SpringLayout.EAST, userInputField);
				baseLayout.putConstraint(SpringLayout.EAST, userInputField, -173, SpringLayout.EAST, this);
				baseLayout.putConstraint(SpringLayout.WEST, userInputField, 10, SpringLayout.WEST, this);
				baseLayout.putConstraint(SpringLayout.NORTH, userInputField, 9, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, userInputField, -419, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.NORTH, grabUserInput, 12, SpringLayout.NORTH, this);
				baseLayout.putConstraint(SpringLayout.SOUTH, grabUserInput, -419, SpringLayout.SOUTH, this);
				baseLayout.putConstraint(SpringLayout.EAST, grabUserInput, -10, SpringLayout.EAST, this);
			}
			
			private void buildListeners()
			{
				grabUserInput.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent clicked)
						{
							parseUserInput();
							
							findDifficulty();
						}
					});
			}
			
			private void parseUserInput()
			{
				userGuess = Integer.parseInt(userInputField.getText());
			}
			
			private void findDifficulty()
			{
				if(grabDifficulty.isEasy() == true)
					easyIsSelected();
				else if(grabDifficulty.isNormal() == true)
					normalIsSelected();
			}
			
			private void easyIsSelected()
			{
				System.out.println(easyNumber.getEasyNumber());
				if(userGuess == easyNumber.getEasyNumber())
					System.out.println("Correct");
				else
					System.out.println("False");
			}
			
			private void normalIsSelected()
			{
				System.out.println(normalNumber.getNormalNumber());
			}
	}
