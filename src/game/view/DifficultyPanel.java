package game.view;

import java.awt.*;
import javax.swing.*;

public class DifficultyPanel extends JPanel
	{
		private SpringLayout baseLayout;
		
		public DifficultyPanel()
			{
				baseLayout = new SpringLayout();
				
				buildPanel();
				buildWindow();
				buildListeners();
			}
			
			private void buildPanel()
			{
				setLayout(baseLayout);
				setBackground(Color.GREEN);
				setPreferredSize(new Dimension(180,478));
			}
			
			private void buildWindow()
			{
				
			}
			
			private void buildListeners()
			{
				
			}
	}
