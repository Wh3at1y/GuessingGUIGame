package game.view;

import game.model.EasyDifficulty;
import game.model.NormalDifficulty;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DifficultyPanel extends JPanel
	{
		private SpringLayout baseLayout;
		
		private JButton easyButton;
		private JButton normalButton;
		
		private boolean isEasy;
		private boolean isNormal;
		
		public DifficultyPanel()
			{	
				baseLayout = new SpringLayout();
				
				easyButton = new JButton("Easy");
				normalButton = new JButton("Normal");
				
				buildPanel();
				buildWindow();
				buildListeners();
			}
			
			private void buildPanel()
			{
				setLayout(baseLayout);
				setBackground(Color.GREEN);
				setPreferredSize(new Dimension(180,478));
				
				add(easyButton);
				add(normalButton);
			}
			
			private void buildWindow()
			{
				
			}
			
			private void buildListeners()
			{
				easyButton.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent click)
						{
							EasyDifficulty easyNumberGen = new EasyDifficulty();
							System.out.println(easyNumberGen.getEasyNumber());
							
							isEasy = true;
							isNormal = false;
						}
					});
				
				normalButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent click)
					{
						NormalDifficulty normalNumberGen = new NormalDifficulty();
						System.out.println(normalNumberGen.getNormalNumber());
						
						isEasy = false;
						isNormal = true;
					}
				});
			}

			public boolean isEasy()
			{
				return true;
			}

			public boolean isNormal()
			{
				return true;
			}
			
			

	}
