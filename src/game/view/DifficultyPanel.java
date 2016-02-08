package game.view;

import game.model.EasyDifficulty;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class DifficultyPanel extends JPanel
	{
		private EasyDifficulty easyNumberGen;
		private SpringLayout baseLayout;
		
		private JButton easyButton;
		
		public DifficultyPanel()
			{	
				baseLayout = new SpringLayout();
				
				easyButton = new JButton("Easy");
				
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
							easyNumberGen = new EasyDifficulty();
							System.out.println(easyNumberGen.getEasyNumber());
						}
					});
			}
	}
